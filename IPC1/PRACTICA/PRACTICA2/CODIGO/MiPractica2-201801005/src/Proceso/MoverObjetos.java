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
import javax.swing.JLabel;

/**
 *
 * @author HernandezMartinez
 */
public class MoverObjetos implements Runnable {

    Tablero blabla = new Tablero();
    boolean bandera = true;
    JLabel label;
    int velocidad;

    public MoverObjetos(JLabel label, int tiempo) {
        this.label = label;
        this.velocidad = tiempo;
    }

    @Override
    public void run() {

        while (bandera) {

            label.setBounds(label.getX(), label.getY() + 100, label.getWidth(), label.getHeight());
            if (label.getY() > 550) {
                label.setVisible(false);
            }

            try {
                Thread.sleep(velocidad * 100);
            } catch (InterruptedException ex) {
                Logger.getLogger(MoverObjetos.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (Tablero.nave.getX() == label.getX() && Tablero.nave.getY() == label.getY()) {

                int vidas = Integer.parseInt(Tablero.contaVidas.getText());
                int velocidad = Integer.parseInt(Tablero.contaVel.getText());
                int poder = Integer.parseInt(Tablero.contaPoder.getText());

                if (label.getBackground() == Color.GRAY) {
                    System.out.println("Colisión");
                    if (Integer.parseInt(Tablero.contaVidas.getText()) > 0) {
                        Tablero.contaVidas.setText(String.valueOf(vidas - 1));
                    }
                }

                if (label.getBackground() == Color.RED) {
                    if (Integer.parseInt(Tablero.contaVidas.getText()) < 3) {
                        System.out.println("VIDA EXTRA");
                        Tablero.contaVidas.setText(String.valueOf(vidas + 1));
                    }
                }

                if (label.getBackground() == Color.YELLOW) {
                    System.out.println("+Velocidad");
                    if (Integer.parseInt(Tablero.contaVel.getText()) < 5) {
                        Tablero.contaVel.setText(String.valueOf(velocidad + 1));
                        this.velocidad = Integer.parseInt(Tablero.contaVel.getText());
                    }

                }

                if (label.getBackground() == Color.PINK) {
                    if (Integer.parseInt(Tablero.contaVel.getText()) > 0) {
                        System.out.println("-Velocidad");
                        Tablero.contaVel.setText(String.valueOf(velocidad - 1));
                        this.velocidad = Integer.parseInt(Tablero.contaVel.getText());
                    }

                }

                if (label.getBackground() == Color.CYAN) {
                    System.out.println("Poder");
                    Tablero.contaPoder.setText(String.valueOf(poder + 1));
                    Tablero.auxpoder = Integer.parseInt(Tablero.contaPoder.getText());
                }

            }

            if (Integer.parseInt(Tablero.contaVidas.getText()) == 0) {
                bandera = false;
                return;
            }

        }
    }
}
