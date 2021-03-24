package Utiles;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Utiles {
    
    public static JPanel crearPaneles(int ancho, int alto, Color color) {

        JPanel panel = new JPanel(null);
        panel.setPreferredSize(new Dimension(ancho, alto));
        panel.setBackground(color);
        return panel;
    }

    public static JButton crearBotones(String texto,int ancho, int alto,int x, int y, Color color){
        
        JButton boton = new JButton(texto); 
        boton.setBounds(x, y, ancho, alto);
        boton.setBackground(color);
        return boton;
        
    }
    
    public static JLabel crearLabel(int x, int y, int ancho, int alto){
    
        JLabel label = new JLabel();
        label.setBounds(x, y,ancho, alto);
        label.setOpaque(true);
        label.setHorizontalAlignment(0);
        Border border = LineBorder.createBlackLineBorder();
        label.setBorder(border);
        return label;
    }
    
    
    
}
