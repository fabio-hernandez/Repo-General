package Juego;

public class Utilidades {


    public static String[] quitarGuion(String coordendas) {
        String[] string = coordendas.split("-");
        return string;
    }

    public static String quitarParentesis(String texto) {
        String aux = "";
        for (int i = 1; i < texto.length() - 1; i++) {
            aux = aux + texto.charAt(i);
            
        }
        return aux;
    }

    public static int[] quitarComa(String texto) { // METODO PARA QUITAR ,
        String[] string = texto.split(",");
        int[] aux = new int[2];
        aux[0] = Integer.parseInt(string[0]);
        aux[1] = Integer.parseInt(string[1]);
        
        return aux;
    }
    
    
    
}