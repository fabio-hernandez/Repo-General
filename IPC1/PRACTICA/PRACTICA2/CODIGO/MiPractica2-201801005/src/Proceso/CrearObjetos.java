package Proceso;

import Interfaz.Utiles;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CrearObjetos implements Runnable {

    int fila;
    int ancho;
    int alto;
    int velocidad;
    int tiempo;
    Color color;
    String nombre;
    JPanel panel;

    public CrearObjetos(int fila, int ancho, int alto, int velocidad, int tiempo, Color color, String nombre, JPanel panel) {
        this.fila = fila;
        this.ancho = ancho;
        this.alto = alto;
        this.velocidad = velocidad;
        this.tiempo = tiempo;
        this.color = color;
        this.nombre = nombre;
        this.panel = panel;
    }

    @Override
    public void run() {

        while (true) {
            JLabel label = null;
            MoverObjetos proceso1 = null;

            int ran = (int) (Math.random() * 4);
            label = Utiles.crearLabel((100*ran)+25, this.fila, this.alto, this.ancho);
            proceso1 = new MoverObjetos(label, this.velocidad);

            label.setOpaque(true);
            label.setBackground(this.color);
            label.setText(this.nombre);
            this.panel.add(label);
            Thread hilo1 = new Thread(proceso1);
            hilo1.start();
            try {
                Thread.sleep(this.tiempo * 1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(CrearObjetos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
