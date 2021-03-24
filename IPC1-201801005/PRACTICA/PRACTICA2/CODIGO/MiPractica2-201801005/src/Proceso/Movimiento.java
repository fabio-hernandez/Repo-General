package Proceso;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author HernandezMartinez
 */
public class Movimiento implements Runnable {

    JButton nave;

    public Movimiento(JButton nave) {
        this.nave = nave;
    }

    @Override
    public void run() {
        while (true) {

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

                            break;

                        //right-derecha    
                        case 39:

                            break;

                        //space-espcacio    
                        case 32:
                            System.out.println("Espacio");
                            break;

                    }
                }
            });
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }

//             case "DERECHA":
//                    label.setBounds(label.getX() + 100, label.getY(), label.getWidth(), label.getHeight());
//                     if (label.getX()>425) {
//                        label.setVisible(false);
//                    }
//                    break;
//                case "IZQUIERDA":
//                    label.setBounds(label.getX() - 100, label.getY(), label.getWidth(), label.getHeight());
//                    if (label.getX()<25) {
//                        label.setVisible(false);
//                    }
//                    break;
//        }
        }
    }
}
