/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso;

import Interfaz.Tablero;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HernandezMartinez
 */
public class Poder extends Thread {

    int contador;

    @Override
    public void run() {

        for (contador = 0; contador < 6; contador++) {
            Tablero.nave.setBackground(Color.ORANGE);
            Tablero.nave.setOpaque(true);
            if (contador == 5) {
                Tablero.nave.setBackground(Color.CYAN);
                Tablero.nave.setBounds(Tablero.nave.getX() - 1, Tablero.nave.getY() + 1, Tablero.nave.getWidth(), Tablero.nave.getHeight());
                return;
            }
            try {
                Poder.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Poder.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
    }

}
