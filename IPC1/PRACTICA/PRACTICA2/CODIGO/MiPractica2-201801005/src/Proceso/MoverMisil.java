/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author HernandezMartinez
 */
public class MoverMisil implements Runnable {

    JLabel misil;

    public MoverMisil(JLabel label) {

        this.misil = label;
    }

    @Override
    public void run() {
        
        while(true){

        this.misil.setBounds(misil.getX(),misil.getY()-20,misil.getWidth(),misil.getHeight());
        if(misil.getY()<50){
        misil.setVisible(false);
        }
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(MoverMisil.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
    }

}
