package Tarea1;

import java.util.Scanner;

public class Estudiantes {

    public String nombregeneral;
    public int carnet;
    public int cantidad1, cantidad2;
    public int aux, bandera;
    public Scanner recibir, recibir2;
    String[] estudiantesA, estudiantesB;

    public Estudiantes() {
        carnet = 0;
        recibir = new Scanner(System.in);
        recibir2 = new Scanner(System.in);
        estudiantesB = new String[cantidad2];
    }

    public void AlmacenarEstudiantes() {

        do {
            System.out.println("Por favor ingrese la sección en la que desea ingresar a los estudiantes");
            System.out.println("1. Sección A");
            System.out.println("2. Sección B");
            System.out.println("3. Terminar");
            System.out.print("Por ingrese su selección: ");
            bandera = recibir.nextInt();

            switch (bandera) {

                case 1:
                    IngresarA();
                    System.out.println(" ");
                    System.out.println(" ");
                    break;

                case 2:
                    IngresarB();
                    System.out.println(" ");
                    System.out.println(" ");
                    break;

                case 3:
                    System.out.println(" ");
                    System.out.println(" ");

                    break;

                default:
                    System.out.println("Opción inválida");
                    break;

            }

        } while (bandera != 3);

    }

    public void IngresarA() {
        System.out.print("Por favor ingrese la cantidad de estudiantes de la sección A (Entre 0 y 5 estudiantes): ");
        cantidad1 = recibir.nextInt();

        if (cantidad1 > 0 && cantidad1 <= 5) {

            estudiantesA = new String[cantidad1];

            for (int contador = 0; contador < estudiantesA.length; contador++) {

                aux = contador + 1;

                System.out.print("Ingresa el estudiantes en la posición" + aux + ": ");
                estudiantesA[contador] = recibir.next();

            }

        } else {

            System.out.println("Selecciona un valor válido");
        }

    }

    public void IngresarB() {
        System.out.print("Por favor ingrese la cantidad de estudiantes de la sección B (Entre 0 y 5 estudiantes): ");
        cantidad2 = recibir.nextInt();

        if (cantidad2 > 0 && cantidad2 <= 5) {

            estudiantesB = new String[cantidad2];

            for (int contador = 0; contador < estudiantesB.length; contador++) {

                aux = contador + 1;

                System.out.print("Ingresa el estudiantes en la posición" + aux + ": ");
                estudiantesB[contador] = recibir2.next();

            }

        } else {

            System.out.println("Selecciona un valor válido");
        }

    }

    public void ImprimirEstudiantesA() {

        for (int contador = 0; contador < estudiantesA.length; contador++) {
            aux = contador + 1;

            System.out.println("Estudiante" + aux + "= " + estudiantesA[contador]);
        }

    }

    public void ImprimirEstudiantesB() {

        for (int contador = 0; contador < estudiantesB.length; contador++) {
            aux = contador + 1;

            System.out.println("Estudiante" + aux + "= " + estudiantesB[contador]);
        }
    }

}
