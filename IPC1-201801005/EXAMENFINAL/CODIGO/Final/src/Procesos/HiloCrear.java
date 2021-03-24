/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author HernandezMartinez
 */
public class HiloCrear implements Runnable {

    public static int time = 20;
    int fila;
    int columna;
    int ancho;
    int alto;
    JPanel panel;
    int i = 1;

    public HiloCrear() {
    }

    public HiloCrear(int fila, int columna, int ancho, int alto, JPanel panel) {
        this.columna = columna;
        this.fila = fila;
        this.ancho = ancho;
        this.alto = alto;
        this.panel = panel;
    }

    @Override
    public void run() {
        JButton botones = null;
        HiloMover proceso1 = null;

        while (true) {
            botones = Utiles.crearBotones(String.valueOf(i), 100, 100, 25, 25);
            botones.setBackground(Color.white);
            this.panel.add(botones);
            proceso1 = new HiloMover(botones);
            Thread hilo1 = new Thread(proceso1);
            hilo1.start();
            i++;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloCrear.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
