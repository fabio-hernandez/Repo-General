/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import MemoriaDinamica.Cola;
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
public class VentanaCola extends JFrame {

    JPanel panel;
    public static JTextArea graph;
    JButton encolar, desencolar;
    Cola accion = new Cola();

    public VentanaCola(String title) throws HeadlessException {
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
        panel.setBounds(0, 0, 350, 500);
        panel.setBackground(new Color(196, 250, 248));
        this.add(panel);

        graph = new JTextArea();
        graph.setBounds(25, 25, 300, 300);
        graph.setEnabled(true);
        panel.add(graph);

        encolar = Utiles.crearBotones("Encolar", 300, 40, 25, 350, Color.lightGray);
        encolar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 int valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del nodo: "));
                 accion.encolar(1, valor);
                 accion.mostrar(graph);
            }
        });
        panel.add(encolar);

        desencolar = Utiles.crearBotones("Desencolar", 300, 40, 25, 410, Color.lightGray);
        desencolar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!accion.esVacia()) {
                    accion.desencolar();
                    accion.mostrar(graph);
                } else {
                    System.out.println("Cola vacía");
                }
            }
        });
        panel.add(desencolar);

    }
}
