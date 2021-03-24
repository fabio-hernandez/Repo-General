package Interfaz;

import MemoriaDinamica.*;
import Utiles.Utiles;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

//@author HernandezMartinez
public class VentanaPrincipal extends JFrame {

    JPanel panel1, panelTablero;
    public static JButton player;
    public JLabel bloque = Utiles.crearLabel(0, 0, 100, 100);

    ListaSimple objlista = new ListaSimple();
    ListaDoble objlistadoble = new ListaDoble();
    ListaCircular objlistacircular = new ListaCircular();
    Cola objcola = new Cola();
    Pila objpila = new Pila();

    public VentanaPrincipal(String title) throws HeadlessException {
        super(title);
        aspecto();
        this.setLayout(null);
        this.setBounds(0, 0, 800, 750);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        cargarElementos();
        cargarPanel();
        Tablero();
    }

    public void aspecto() {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void cargarElementos() {

        panel1 = new JPanel();
        panel1.setBackground(new Color(196, 250, 248));
        panel1.setBounds(0, 0, 800, 750);
        panel1.setLayout(null);
        this.add(panel1);

        panelTablero = new JPanel();
        panelTablero.setBackground(Color.WHITE);
        panelTablero.setBounds(50, 200, 700, 500);
        panelTablero.setLayout(null);
        panel1.add(panelTablero);

    }

    public void cargarPanel() {

        botonCargarDatos();
        botonListaCircular();
        botonReiniciar();
        botonListaSimple();
        botonPila();
        botonListaDoble();
        botonCola();
        mover();
    }

    public void botonCola() {

        JButton BCola = Utiles.crearBotones("Cola", 150, 50, 582, 100, Color.LIGHT_GRAY);
        BCola.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaCola cola = new VentanaCola("Cola");
                cola.setVisible(true);
                objcola.encolar(1, 30);
                objcola.encolar(2, 40);
                objcola.encolar(3, 50);
                objcola.encolar(4, 60);
                objcola.mostrar(VentanaCola.graph);
            }
        });
        panel1.add(BCola);
    }

    public void botonListaDoble() {
        JButton BlistaDoble = Utiles.crearBotones("Lista Doble", 150, 50, 582, 25, Color.LIGHT_GRAY);
        BlistaDoble.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaListaDoble lista = new VentanaListaDoble("Lista Doble");
                lista.setVisible(true);
                objlistadoble.agregar(1, 20);
                objlistadoble.agregar(2, 40);
                objlistadoble.agregar(3, 100);
                objlistadoble.print(VentanaListaDoble.graph);
            }
        });
        panel1.add(BlistaDoble);

    }

    public void botonPila() {
        JButton BPila = Utiles.crearBotones("Pila", 150, 50, 407, 100, Color.LIGHT_GRAY);
        BPila.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaPila pila = new VentanaPila("Pila");
                pila.setVisible(true);
                objpila.push(1, 40);
                objpila.imprimir(VentanaPila.graph);
            }
        });
        panel1.add(BPila);
    }

    public void botonListaSimple() {
        JButton BlistaSimple = Utiles.crearBotones("Lista Simple", 150, 50, 407, 25, Color.LIGHT_GRAY);
        BlistaSimple.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaListaSimple lista = new VentanaListaSimple("Lista Simple");
                objlista.imprimir(VentanaListaSimple.graph);
                lista.setVisible(true);
            }
        });
        panel1.add(BlistaSimple);

    }

    private void botonReiniciar() {
        JButton BReiniciar = Utiles.crearBotones("Reiniciar", 150, 50, 57, 100, Color.LIGHT_GRAY);
        BReiniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                objlista.eliminar();
            }
        });
        panel1.add(BReiniciar);
    }

    public void botonCargarDatos() {
        JButton BcargarDatos = Utiles.crearBotones("Cargar Datos", 150, 50, 57, 25, Color.LIGHT_GRAY);
        BcargarDatos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cargarArchivo();
                agregarBloques();
            }
        });
        panel1.add(BcargarDatos);
    }

    public void botonListaCircular() {
        //Ventana Lista Circular
        JButton BlistaCircular = Utiles.crearBotones("Lista Circular", 150, 50, 232, 50, Color.LIGHT_GRAY);
        BlistaCircular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaListaCircular lista = new VentanaListaCircular("Lista Circular");
                lista.setVisible(true);
                objlistacircular.agregar(1, 60);
                objlistacircular.agregar(2, 90);
                objlistacircular.agregar(3, 80);
                objlistacircular.agregar(4, 60);
                objlistacircular.agregar(6, 100);  
                objlistacircular.mostrar(VentanaListaCircular.graph);
            }
        });
        panel1.add(BlistaCircular);
    }

    public void Tablero() {
        //Tablero
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                //x , y , ancho , alto
                JLabel label = Utiles.crearLabel(i * 100, j * 100, 100, 100);
                label.setOpaque(false);
                panelTablero.add(label);
            }
        }

    }

    public void cargarArchivo() {
        JFileChooser lector = new JFileChooser();
        lector.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.ipc1", "ipc1");
        lector.setFileFilter(filtro);
        int seleccion = lector.showOpenDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {

            try {
                FileReader lectorarchivo = new FileReader(lector.getSelectedFile());
                BufferedReader br = new BufferedReader(lectorarchivo);
                String temp = "";
                while (temp != null) {
                    temp = br.readLine();
                    if (temp != null) {
                        String[] vector = temp.split("\n");
                        for (String info : vector) {
                            String[] datosfinales = info.split(",");
                            objlista.agregar(Integer.parseInt(datosfinales[0]), Integer.parseInt(datosfinales[1]),
                                    Integer.parseInt(datosfinales[2]), datosfinales[3]);
                        }
                    }
                }

            } catch (FileNotFoundException ex) {
                System.out.println("Se encontró una falla en: " + ex);
            } catch (IOException e) {
                System.out.println("Se encontró una falla en: " + e);
            }
        }
    }

    public void agregar() {
        int i = 0;
        int contadoraux = 0;
        while (contadoraux < objlista.getTamaño()) {
            System.out.println("Hola");
            int valor = objlista.obtenerValor(contadoraux);
            if (player.getX() == bloque.getX() && bloque.getY() == player.getY()) {
                objlistacircular.agregar(i, valor);
                objlistacircular.mostrar(VentanaListaCircular.graph);
                bloque.setBounds(0, 0, 0, 0);
                i++;
            }
        }
    }

    public void mover() {
        
        JButton player = Utiles.crearBotones("", 100, 100, 0, 00, Color.BLACK);
        panelTablero.add(player);
        player.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        player.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {

                switch (e.getKeyCode()) {

                    //left-izquierda
                    case 37:
                        if (player.getX() > 0) {
                            player.setBounds(player.getX() - 100, player.getY(), player.getWidth(), player.getHeight());
                            
                        } else {
//                            JOptionPane.showMessageDialog(null, "No puedes salirte del panel");
                        }
                        break;

                    //right-derecha    
                    case 39:
                        if (player.getX() < 600) {
                            player.setBounds(player.getX() + 100, player.getY(), player.getWidth(), player.getHeight());
                        } else {
//                            JOptionPane.showMessageDialog(null, "No puedes salirte del panel");
                        }
                        break;

                    //Down-Abajo
                    case 40:
                        if (player.getY() < 400) {
                            player.setBounds(player.getX(), player.getY() + 100, player.getWidth(), player.getHeight());
                        } else {
//                            JOptionPane.showMessageDialog(null, "No puedes salirte del panel");
                        }
                        break;

                    //Up-Arriba    
                    case 38:
                        if (player.getY() > 0) {
                            player.setBounds(player.getX(), player.getY() - 100, player.getWidth(), player.getHeight());
                        } else {
//                            JOptionPane.showMessageDialog(null, "No puedes salirte del panel");
                        }
                        break;
                        
                }

            }
        });

    }

    public void agregarBloques() {
        int fila, columna, valor = 0;
        String color = " ";
        bloque = null;
        int contadoraux = 0;

        while (contadoraux < objlista.getTamaño()) {
            fila = objlista.obtenerFila(contadoraux);
            columna = objlista.obtenerCol(contadoraux);
            valor = objlista.obtenerValor(contadoraux);
            color = objlista.obtenerColor(contadoraux);

            if (color.equalsIgnoreCase("Rojo")) {
                bloque = Utiles.crearLabel(columna * 100, fila * 100, 100, 100);
                bloque.setBackground(Color.red);

            }
            if (color.equalsIgnoreCase("Verde")) {
                bloque = Utiles.crearLabel(columna * 100, fila * 100, 100, 100);
                bloque.setBackground(Color.green);
//                objcola.encolar(i, valor);
//                objcola.mostrar(VentanaListaCircular.graph);
//                i++;
            }
            if (color.equalsIgnoreCase("Amarillo")) {
                bloque = Utiles.crearLabel(columna * 100, fila * 100, 100, 100);
                bloque.setBackground(Color.yellow);
//                objpila.push(i, valor);
//                objpila.imprimir(VentanaPila.graph);

//                i++;
            }
            if (color.equalsIgnoreCase("Azul")) {
                bloque = Utiles.crearLabel(columna * 100, fila * 100, 100, 100);
//                objlistadoble.agregar(i, valor);
//                objlistadoble.print(VentanaListaDoble.graph);
                bloque.setBackground(Color.blue);
            }

            bloque.setText(String.valueOf(valor));
            bloque.setFont(new Font("Helvetica", Font.PLAIN, 50));
            bloque.setForeground(Color.black);
            panelTablero.add(bloque);
            panelTablero.repaint();
            contadoraux++;

        }
    }

}
