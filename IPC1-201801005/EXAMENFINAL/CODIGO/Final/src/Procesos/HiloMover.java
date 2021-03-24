package Procesos;

// @author Fabio Hernández
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

public class HiloMover implements Runnable {

    HiloCrear contador = new HiloCrear();

    public boolean bandera;
    int time =20;
    JButton boton;

    public HiloMover(JButton boton) {
        this.boton = boton;
        bandera = true;
    }

    @Override
    public void run() {
        while (true) {
            boton.setBounds(boton.getX(), boton.getY() + 75, boton.getWidth(), boton.getHeight());
            try {
                Thread.sleep(900);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloMover.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
