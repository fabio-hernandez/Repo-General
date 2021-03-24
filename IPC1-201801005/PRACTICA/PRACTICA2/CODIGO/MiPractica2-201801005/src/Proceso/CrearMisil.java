/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso;

import Interfaz.Utiles;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author HernandezMartinez
 */
public class CrearMisil implements Runnable {

    int fila;
    int columna;
    int ancho;
    int alto;
    Color color;
    JPanel panel;

    //fila , col, ancho, alto , velocidad, tiempo, color,
    public CrearMisil(int fila,int columna, int ancho, int alto, Color color, JPanel panel) {
        this.fila = fila;
        this.columna = columna;
        this.ancho = ancho;
        this.alto = alto;
        this.color = color;
        this.panel = panel;
    }

    @Override
    public void run() {

            JLabel label;
            MoverMisil proceso1;

            label = Utiles.crearLabel(this.columna, this.fila, this.alto, this.ancho);
            proceso1 = new MoverMisil(label);
            label.setVisible(true);
            label.setBackground(this.color);
            this.panel.add(label);
            Thread hilo1 = new Thread(proceso1);
            hilo1.start();


    }
}
