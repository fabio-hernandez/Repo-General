package HT;

import java.util.Scanner;

public class HT1 {

    public static void main(String[] args) {
        boolean status = false;
        String nombre;
        int opcion;
        int valor1;
        int valor2;
        int seccion;
        Scanner lector = new Scanner(System.in);

        System.out.println("Bienvenido al portal de ingeniería FIUSAC");
        System.out.println("Por favor ingrese sus datos");
        System.out.print("Nombre: ");
        nombre = lector.next();
        do {
            System.out.println("Bienvenido " + nombre);
            System.out.println("Eliga una opción");
            System.out.println("1. Datos personales");
            System.out.println("2. Asignaciones");
            System.out.println("3. Salir");
            opcion = lector.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Su nombre es: " + nombre);
                    break;

                case 2:
                    System.out.println("Seleccione una sección por favor: ");
                    System.out.println("1. A");
                    System.out.println("2. B");
                    seccion = lector.nextInt();
                    
                    
                case 3:
                    System.out.println("Adiós");
                    System.exit(0);
                default:
                    System.out.println("Opción incorrecta");
                    break;

            }

        } while (!status);
    }

}
