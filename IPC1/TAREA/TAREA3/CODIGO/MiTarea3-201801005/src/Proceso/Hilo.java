/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author HernandezMartinez
 */
public class Hilo extends Thread {

    JButton boton;

    public Hilo(JButton boton) {
        this.boton = boton;
    }

    @Override
    public void run() {

        while (true) {

            if (boton.getBackground() == Color.blue) {
                this.boton.setBackground(Color.red);
            } else if (boton.getBackground() == Color.red) {
                this.boton.setBackground(Color.blue);
            }
            
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
