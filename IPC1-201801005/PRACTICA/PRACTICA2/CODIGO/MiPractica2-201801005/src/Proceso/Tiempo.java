/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author HernandezMartinez
 */
public class Tiempo extends Thread {

    public boolean bandera;
    JTextField tiempo;
    public static int time;

    public Tiempo(JTextField tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public void run() {

        for (time = 20; time >= 0; time--) {
            this.tiempo.setText(String.valueOf(time));
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Tiempo.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (time == 0) {
            bandera = false;
        }
    }
}
