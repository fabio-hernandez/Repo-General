package Interfaz;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class VentanaPrincipal extends JFrame {

    /**
     *
     */
    public static String nickname;

    public VentanaPrincipal(String title) throws HeadlessException {
        super(title);
        aspecto();
        this.setSize(470, 590);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        crearObjetos();
    }

    public void aspecto() {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void crearObjetos() {

        //Panel Principal
        JPanel panelPrincipal = Utiles.crearPaneles(470, 590, Color.black);

        //Boton para Ordenamiento Quicksort
        JButton JQuickSort = Utiles.crearBotones("Top 5 QuickSort", 250, 60, 110, 40, Color.gray);
        JQuickSort.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        panelPrincipal.add(JQuickSort);

        //Boton para Ordenamiento BubbleSort
        JButton JBubbleSort = Utiles.crearBotones("Top 5 BubbleSort", 250, 60, 110, 150, Color.gray);
        JQuickSort.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        panelPrincipal.add(JBubbleSort);

        //Boton para iniciar Juego
        JButton JInicio = Utiles.crearBotones("Iniciar Juego", 250, 60, 110, 245, Color.gray);
        JInicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                nickname = JOptionPane.showInputDialog("Por favor ingrese su nickname: ");
                setVisible(true);
                Tablero juego = new Tablero("Galaga");
                juego.show();
            }
        });
        panelPrincipal.add(JInicio);

        //Boton Acerca de
        JButton JInfo = Utiles.crearBotones("Acerca de...", 250, 60, 110, 340, Color.gray);
        JInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Icon logo;
                logo = new ImageIcon(getClass().getResource("/Imagenes/logo.png"));
                JOptionPane.showMessageDialog(rootPane, "Nombre: Fabio Josué Hernández Martinez\n" + "Carnét: 201801005", "Acerca de..", JOptionPane.PLAIN_MESSAGE, logo);
            }
        });
        panelPrincipal.add(JInfo);

        //Botón Salir
        JButton JOut = Utiles.crearBotones("Salir", 250, 60, 110, 475, Color.gray);
        JOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        panelPrincipal.add(JOut);

        //Se agrega todo al panel principal
        this.add(panelPrincipal);
    }

}
