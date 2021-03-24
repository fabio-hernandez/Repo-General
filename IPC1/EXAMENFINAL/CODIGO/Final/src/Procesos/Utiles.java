package Procesos;

import javax.swing.JButton;

public class Utiles {
    
    public static JButton crearBotones(String texto,int ancho, int alto,int x, int y){
        
        JButton boton = new JButton(texto); 
        boton.setBounds(x, y, ancho, alto);
        return boton;
        
    }
    
}
