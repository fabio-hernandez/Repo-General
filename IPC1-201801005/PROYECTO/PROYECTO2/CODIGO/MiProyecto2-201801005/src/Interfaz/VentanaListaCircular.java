/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import MemoriaDinamica.ListaCircular;
import Utiles.Utiles;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;

/**
 *
 * @author HernandezMartinez
 */
public class VentanaListaCircular extends JFrame {
    JPanel panel;
    public static JTextArea graph;
    public ListaCircular listacircular = new ListaCircular();
    JButton agregar,eliminar;

    public VentanaListaCircular(String title) throws HeadlessException {
        super(title);
        this.setLayout(null);
        this.setBounds(0, 0, 350, 500);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        aspecto();
        agregarComponenetes();
    }

    public void aspecto() {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void agregarComponenetes() {
        panel = new JPanel(null);
        panel.setBounds(0, 0, 350, 550);
        panel.setBackground(new Color(196, 250, 248));
        this.add(panel);
        
        graph = new JTextArea();
        graph.setBounds(25, 25, 300, 300);
        graph.setEnabled(true);
        panel.add(graph);
        
        agregar = Utiles.crearBotones("Agregar", 300, 40, 25, 350, Color.lightGray);
        agregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int valor = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el valor del nuevo nodo: "));
                listacircular.agregar(1, valor);
                listacircular.mostrar(graph);
            }
        });
        panel.add(agregar);
        
        eliminar = Utiles.crearBotones("Eliminar", 300, 40, 25, 410, Color.lightGray);
        eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               int valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del nodo a eliminar: "));
               listacircular.eliminar(valor);
               listacircular.mostrar(graph);
            }
        });
        panel.add(eliminar);

    }
}
