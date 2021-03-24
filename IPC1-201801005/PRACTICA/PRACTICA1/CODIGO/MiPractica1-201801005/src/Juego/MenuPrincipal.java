package Juego;
import java.util.Scanner;

public class MenuPrincipal {

    public boolean status;
    public static Scanner lector;
    public int opcion;

    public int ejemplo = 3;
    public int bandera = 0;

    public MenuPrincipal() {

        this.status = false;
        MenuPrincipal.lector = new Scanner(System.in);
        this.opcion = 0;

    }

    public void initMenu() {

        do {

            System.out.println("------------- MENU PRINICIPAL -------------");
            System.out.println("1. Crear Tablero");
            System.out.println("2. Reporte completo");
            System.out.println("3. Reporte de victorias");
            System.out.println("4. Salir");
            System.out.println(" ");
            System.out.print("Por favor selecciona una opción: ");
            opcion = lector.nextInt();

            switch (opcion) {

                case 1:
                    Imprimirvacio();
                    Juego();
                    break;
                case 2:
                    Imprimirvacio();
                    break;
                case 3:
                    Imprimirvacio();
                    Rep_Victorias();
                    break;
                case 4:
                    Exit();
                    break;
                default:
                    System.out.println("Opción inválida por favor seleccione una opción que sea válida");
                    break;

            }

        } while (!status);

    }

    private void Juego() {

        MenuTablero obj = new MenuTablero();
        obj.MenuTable();

    }

    private void Reporte() {
        System.out.println("Has seleccionado la opción de Reportes ");
    }

    private void Rep_Victorias() {
        System.out.println("Has seleccionado la opción de Reportes de Victorias");

    }

    public void Exit() {
        
        Imprimirvacio();
        System.out.println("------------------- HAS DECIDIDO SALIR DEL JUEGO -------------------");
        System.out.println("------------------------- REGRESA PRONTO ---------------------------");
        System.exit(0);

    }

    public void Imprimirvacio() {
        System.out.println(" ");
        System.out.println(" ");

    }

}
