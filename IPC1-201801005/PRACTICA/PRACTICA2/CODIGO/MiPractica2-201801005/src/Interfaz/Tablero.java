package Interfaz;

import Proceso.*;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tablero extends JFrame {

    static JPanel panel1;
    JPanel panel2;
    JPanel paneldatos;
    public static JTextField contaVidas;
    public static JTextField contaPoder;
    public static JTextField contaVel;
    public static JTextField Tpunteo;
    public static int auxpoder;
    public static int vidas = 3;
    public static int poder = 0;
    public static int velocity = 0;
    public static int punteo = 0;
    public static JButton nave = Utiles.crearBotones("Nave", 100, 100, 225, 550, Color.CYAN);
    public CrearMisil misil; 

    public Tablero(String title) throws HeadlessException {
        super(title);
        this.setSize(625, 700);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);
        crearObjetos();
    }

    public Tablero() {
    }

    public void crearObjetos() {

        panel1 = new JPanel();
        panel1.setBackground(new Color(40, 15, 85));
        panel1.setBounds(0, 0, 450, 700);
        panel1.setLayout(null);

        panel2 = new JPanel();
        panel2.setBackground(new Color(40, 15, 85));
        panel2.setBounds(450, 0, 175, 700);
        panel2.setLayout(null);

        cargarPanel1();
        cargarPanel2();

        this.add(panel1);
        this.add(panel2);
    }

    private void cargarPanel1() {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                //x , y , ancho , alto
                JLabel label = Utiles.crearLabel(i * 100,j * 100, 100, 100);
                label.setOpaque(false);
                panel1.add(label);
            }
        }

        //Fila, columna, ancho, alto, velocidad, tiempo , color , nombre, direccion, panel
        CrearObjetos corazon = new CrearObjetos(-50, 100, 100, 10, 14, Color.RED, "Corazón", panel1);
        Thread hilo1 = new Thread(corazon);
        hilo1.start();

        CrearObjetos caracol = new CrearObjetos(-50, 100, 100, 10, 10, Color.PINK, "Caracol", panel1);
        Thread hilo2 = new Thread(caracol);
        hilo2.start();

        CrearObjetos rayo = new CrearObjetos(-50, 100, 100, 10, 15, Color.YELLOW, "Rayo", panel1);
        Thread hilo3 = new Thread(rayo);
        hilo3.start();

        CrearObjetos ojo = new CrearObjetos(-50, 100, 100, 10, 10, Color.CYAN, "Ojo", panel1);
        Thread hilo4 = new Thread(ojo);
        hilo4.start();

        CrearObjetos asteroide = new CrearObjetos(-50, 100, 100, 10, 2, Color.GRAY, "Asteroide", panel1);
        Thread hilo5 = new Thread(asteroide);
        hilo5.start();

        panel1.add(nave);

        nave.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

        nave.addKeyListener(new KeyListener() {
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
                        if (nave.getX() > 25) {
                            nave.setBounds(nave.getX() - 100, nave.getY(), nave.getWidth(), nave.getHeight());
                        }
                        break;

                    //right-derecha    
                    case 39:
                        if (nave.getX() < 325) {
                            nave.setBounds(nave.getX() + 100, nave.getY(), nave.getWidth(), nave.getHeight());
                        }
                        break;

                    case 40:
                        if (auxpoder > 0) {
                            auxpoder = auxpoder - 1;
                            nave.setBounds(nave.getX() + 1, nave.getY() -1, nave.getWidth(), nave.getHeight());
                            Poder invisible = new Poder();
                            invisible.start();
                            contaPoder.setText(String.valueOf(auxpoder));
                        } else {
                            System.out.println("Ningun poder seleccionado");
                        }
                        break;

                    //space-espcacio    
                    case 32:
                        //Fila, columna, ancho, alto, velocidad, tiempo , color , nombre, direccion, panel
                        misil =  new CrearMisil(nave.getY(), nave.getX() + 40, 25, 25, Color.ORANGE, panel1);
                        Thread disparo = new Thread(misil);
                        disparo.start();
                        break;

                }

            }
        });
    }

    private void cargarPanel2() {

        paneldatos = new JPanel();
        paneldatos.setBackground(Color.LIGHT_GRAY);
        paneldatos.setBounds(15, 15, 145, 650);
        paneldatos.setLayout(null);
        panel2.add(paneldatos);

        cargarDatos();

    }

    private void cargarDatos() {

        JLabel Jnombre = Utiles.crearLabel(5, 15, 130, 50);
        Jnombre.setText("Nickname: " + VentanaPrincipal.nickname);
        Jnombre.setOpaque(false);
        paneldatos.add(Jnombre);

        JLabel JVidas = Utiles.crearLabel(5, 75, 130, 30);
        JVidas.setHorizontalAlignment((int) LEFT_ALIGNMENT);
        JVidas.setText("Vidas: ");
        JVidas.setOpaque(false);
        paneldatos.add(JVidas);

        contaVidas = new JTextField();
        contaVidas.setBounds(5, 115, 130, 30);
        contaVidas.setText(String.valueOf(vidas));
        paneldatos.add(contaVidas);

        JLabel JPoder = Utiles.crearLabel(5, 155, 130, 30);
        JVidas.setHorizontalAlignment((int) LEFT_ALIGNMENT);
        JPoder.setText("Poder: ");
        JPoder.setOpaque(false);
        paneldatos.add(JPoder);

        contaPoder = new JTextField();
        contaPoder.setBounds(5, 195, 130, 30);
        contaPoder.setText(String.valueOf(poder));
        paneldatos.add(contaPoder);

        JLabel JVel = Utiles.crearLabel(5, 235, 130, 30);
        JVidas.setHorizontalAlignment((int) LEFT_ALIGNMENT);
        JVel.setText("Velocidad: ");
        JVel.setOpaque(false);
        paneldatos.add(JVel);

        contaVel = new JTextField();
        contaVel.setText(String.valueOf(velocity));
        contaVel.setBounds(5, 275, 130, 30);
        paneldatos.add(contaVel);

        JLabel JPunteo = Utiles.crearLabel(5, 315, 130, 30);
        JVidas.setHorizontalAlignment((int) LEFT_ALIGNMENT);
        JPunteo.setText("Punteo: ");
        JPunteo.setOpaque(false);
        paneldatos.add(JPunteo);

        Tpunteo = new JTextField();
        Tpunteo.setText(String.valueOf(punteo));
        Tpunteo.setBounds(5, 355, 130, 30);
        paneldatos.add(Tpunteo);

        JLabel JTiempoReversa = Utiles.crearLabel(5, 395, 150, 70);//395
        JVidas.setHorizontalAlignment((int) LEFT_ALIGNMENT);
        JTiempoReversa.setText("Tiempo restante\n" + "(seg): ");
        paneldatos.add(JTiempoReversa);

        JTextField temporizador = new JTextField();
        temporizador.setBounds(5, 475, 130, 40);
        paneldatos.add(temporizador);
        Tiempo crono = new Tiempo(temporizador);
        crono.start();
        temporizador.setEditable(false);

    }

}
