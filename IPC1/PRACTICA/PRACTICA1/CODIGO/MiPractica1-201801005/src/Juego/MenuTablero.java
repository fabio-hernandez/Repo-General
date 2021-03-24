package Juego;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MenuTablero {

    public int dato2;
    public int filamatriz, columnamatriz;
    public static String[][] Tablero = new String[10][10];
    public int intentos, contadorintentos, intentosregreso, barcoshundidos, barcosvivos, jugabilidad;
    public String nickname;

    //Constructor
    public MenuTablero() {

    }

    //Metdo para el menú tablero
    public void MenuTable() {

        do {
            Inicializacion();
            System.out.println("********************   Bienvenido al Menu Tablero   ********************");
            System.out.println("Por favor selecciona una opción");
            System.out.println("1. Ingresar barcos");
            System.out.println("2. Cambiar cantidad de intentos");
            System.out.println("3. Iniciar juego");
            System.out.println("4. Visualizar tablero");
            System.out.println("5. Reiniciar tablero");
            System.out.println("6. Regresar al menú principal");
            System.out.print("Tu opción es: ");
            dato2 = MenuPrincipal.lector.nextInt();

            switch (dato2) {

                case 1:
                    IngresoBarcos menu = new IngresoBarcos();
                    menu.MenuBarcos();
                    break;
                case 2:

                    break;
                case 3:
                    System.out.println("Por favor ingrese su nickname: ");
                    nickname = MenuPrincipal.lector.next();
                    System.out.println(" ");
                    System.out.println(" ");
                    Date fecha = new Date();
                    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
                    String fechaTexto = formatter.format(fecha);
                    System.out.println("Hora y fecha: " + fechaTexto);
                    System.out.println(" ");
                    System.out.println("Barcos: ");
                    System.out.println("            " + barcoshundidos + "/9 Hundidos");
                    System.out.println("            " + barcosvivos + "/9   En acción");
                    System.out.println(" ");
                    System.out.println("Intentos: ");
                    System.out.println("            " + contadorintentos + "/" + intentos + "Realizados");
                    System.out.println("            " + intentosregreso + "/" + intentos + "Restantes");
                    System.out.println(" ");

                    IngresoBarcos impr = new IngresoBarcos();
                    IngresoBarcos.ImprimirTablero(Tablero);

                    System.out.println("1. Lanzar misil");
                    System.out.println("2. Terminar partida");
                    System.out.println(">>>>>> Seleccione una opción: ");

                    break;
                case 4:
                    IngresoBarcos.ImprimirTablero(Tablero);
                    break;
                case 5:
                    Inicializacion();
                    break;
                case 6:
                    System.out.println("Has regresado al menu principal");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;

            }

        } while (dato2 != 6);

    }

    public static void Inicializacion() {

        for (int i = 0; i < Tablero.length; i++) {

            for (int j = 0; j < Tablero.length; j++) {

                Tablero[i][j] = " ";

            }
        }

    }

}
