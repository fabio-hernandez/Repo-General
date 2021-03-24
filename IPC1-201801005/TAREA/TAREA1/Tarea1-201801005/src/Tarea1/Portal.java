package Tarea1;

import java.util.Scanner;

public class Portal extends Estudiantes {

    public String direccWeb;
    public Scanner lector;
    public int valor1;
    public int bandera2;
    public int auxiliar;
    public int conta;

    public Portal() {

        lector = new Scanner(System.in);
        direccWeb = "https:/portal.ingenieria.usac.edu.gt/";
        conta = 0;

    }

    public void MostrarPantalla() {

        AlmacenarEstudiantes();

        System.out.println("Bienvenido al Portal de ingeníeria");
        System.out.println("Con dirección web: " + direccWeb);
        System.out.println("************************************");

        System.out.print("Por favor ingresa tu carnet: ");
        carnet = lector.nextInt();
        System.out.print("Por favor ingresa tu nombre: ");
        nombregeneral = lector.next();
        System.out.println("Bienvenido: " + nombregeneral);

        do {
            System.out.println("Por favor selecciona la sección a la que deseas asignarte: ");
            System.out.println("1. Sección A");
            System.out.println("2. Sección B");
            System.out.println("3. Mostrar estudiantes de la sección A");
            System.out.println("4. Mostrar estudiantes de la sección B");
            System.out.println("5. Salir");
            valor1 = lector.nextInt();
            Asignarse();
        } while (valor1 != 5);
    }

    public void Asignarse() {

        switch (valor1) {

            case 1:
                System.out.println(" ");
                if (cantidad1 == 5) {
                    System.out.println("Sección llena, por favor intenta en otra sección");
                    conta++;
                    if (conta == 2) {
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println("Por favor apertura una sección");
                    }

                } else {

                }
                break;

            case 2:
                System.out.println(" ");
                if (cantidad2 == 5) {
                    System.out.println("Sección llena, por favor intenta en otra sección");
                    conta++;

                    if (conta == 2) {
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println("Por favor apertura una sección");
                    }

                } else {
                    System.out.println("Felicidades has sido asignado con éxito");
                }
                break;

            case 3:

                for (int contador = 0; contador < estudiantesA.length; contador++) {
                    aux = contador + 1;

                    System.out.println("Estudiante" + aux + "= " + estudiantesA[contador]);
                }
                break;

            case 4:

                for (int contador = 0; contador < estudiantesB.length; contador++) {
                    aux = contador + 1;

                    System.out.println("Estudiante" + aux + "= " + estudiantesB[contador]);
                }
                break;

            case 5:
                System.exit(0);
                break;

            default:
                System.out.println("Opción inválida");
                break;

        }

    }

}
