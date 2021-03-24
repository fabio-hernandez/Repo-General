/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea2;

/**
 *
 * @author HernandezMartinez
 */
public class Main {
    
    
    public static void main(String[] args) {
        
        Controller prueba = new Controller();
        
        
        prueba.getAvionComercial().Avanzar();
        prueba.getAvionComercial().Frenar();
        System.out.println("----------------------------------------------------");
        
        prueba.getAvionPrivado().Avanzar();
        prueba.getAvionPrivado().Frenar();
        System.out.println("----------------------------------------------------");
        
        prueba.getCaballoMascota().Avanzar();
        prueba.getCaballoMascota().Frenar();
        System.out.println("----------------------------------------------------");
        
        prueba.getCaballodeCarga().Avanzar();
        prueba.getCaballodeCarga().Frenar();
        System.out.println("----------------------------------------------------");
        
        prueba.getCarrodelujo().Avanzar();
        prueba.getCarrodelujo().Frenar();
        System.out.println("----------------------------------------------------");
        
        prueba.getCarroregular().Avanzar();
        prueba.getCarroregular().Frenar();
    }
    
}
