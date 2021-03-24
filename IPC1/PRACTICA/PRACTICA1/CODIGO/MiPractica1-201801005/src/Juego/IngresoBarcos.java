package Juego;

public class IngresoBarcos {

    private int nave;
    private int contador;
    public String cadena;

    public IngresoBarcos() {

        contador = 0;

    }

    public void MenuBarcos() {

        do {

            System.out.println("-----------Ahora ingresarás los barcos-----------");
            System.out.println("Selecciona el tipo de barco a ingresar");
            System.out.println("1. Portaaviones");
            System.out.println("2. Submarino");
            System.out.println("3. Destructores");
            System.out.println("4. Fragata");
            System.out.println("5. EasterEgg");
            System.out.println(" ");
            System.out.print("Tu selección es: ");
            nave = MenuPrincipal.lector.nextInt();

            switch (nave) {

                case 1:
                    System.out.println("Por favor ingrese las coordenas del barco: ");
                    cadena = MenuPrincipal.lector.next();
                    IngresarBarcos(cadena, 4, MenuTablero.Tablero);
                    ImprimirTablero(MenuTablero.Tablero);
                    contador++;
                    break;
                case 2:
                    System.out.println("Por favor ingrese las coordenas del barco: ");
                    cadena = MenuPrincipal.lector.next();
                    IngresarBarcos(cadena, 3, MenuTablero.Tablero);
                    ImprimirTablero(MenuTablero.Tablero);

                    contador++;
                    break;
                case 3:
                    System.out.println("Por favor ingrese las coordenas del barco: ");
                    cadena = MenuPrincipal.lector.next();
                    IngresarBarcos(cadena, 2, MenuTablero.Tablero);
                    ImprimirTablero(MenuTablero.Tablero);
                    contador++;
                    break;
                case 4:
                    System.out.println("Por favor ingrese las coordenas del barco: ");
                    cadena = MenuPrincipal.lector.next();
                    IngresarBarcos1posicion(cadena, MenuTablero.Tablero);
                    ImprimirTablero(MenuTablero.Tablero);
                    contador++;
                    break;
                case 5:
                    System.out.println("Por favor ingrese las coordenas del barco: ");
                    cadena = MenuPrincipal.lector.next();
                    IngresarEasterEgg(cadena, MenuTablero.Tablero);
                    ImprimirTablero(MenuTablero.Tablero);
                    contador++;
                    break;
                default:
                    break;

            }

        } while (contador < 10);

    }

    public void IngresarBarcos(String cadena, int tamaño, String Tablero[][]) {

        String[] singuion = Utilidades.quitarGuion(cadena);
        String sinParentesis1 = Utilidades.quitarParentesis(singuion[0]);
        String sinParentesis2 = Utilidades.quitarParentesis(singuion[1]);
        int[] posInicio = Utilidades.quitarComa(sinParentesis1); //0,0
        int[] posFin = Utilidades.quitarComa(sinParentesis2);     //0,3

        int contadorbarcos = 0;

        //Validación barco no es vertical ni horizontal
        if (posInicio[0] != posFin[0] && posInicio[1] != posFin[1]) {

            System.out.println("Error porfavor ingrese el barco en una manera válida");

            //Si el barco es horizontal
        } else if (posInicio[0] == posFin[0]) {

            int dimension = Math.abs(posFin[1] - posInicio[1]) + 1;

            //Verificar la longitud del barco
            if (dimension == tamaño) {

                //Verifica la casilla
                for (int i = posInicio[1]; i <= posFin[1]; i++) {

                    if (Tablero[posInicio[0]][i].equals("O")) {
                        contadorbarcos++;
                    }
                }

                //Si la casilla está vacía
                if (contadorbarcos == 0) {

                    //Asigna el String "O"
                    for (int i = posInicio[1]; i <= posFin[1]; i++) {

                        Tablero[posInicio[0]][i] = "O";
                    }

                } else {
                    System.out.println("El barco no puede colocarse");
                }

            } else {

                System.out.println("Error longitud del barco invalida");

            }

            //Si el barco es vertical
        } else if (posInicio[1] == posFin[1]) {

            int dimension = Math.abs(posFin[0] - posInicio[0]) + 1;

            //Verifica la longitud
            if (dimension == tamaño) {

                //Verifica la casilla
                for (int i = posInicio[0]; i <= posFin[0]; i++) {

                    if (Tablero[i][posInicio[1]].equals("O")) {
                        contadorbarcos++;
                    }
                }

                //Si la casilla está vacía
                if (contadorbarcos == 0) {

                    for (int i = posInicio[0]; i <= posFin[0]; i++) {

                        Tablero[i][posInicio[1]] = "O";

                    }

                } else {

                    System.out.println("El barco no puede colocarse");
                }

            } else {

                System.out.println("Error longitud del barco invalida");

            }

        }

    }

    public void IngresarBarcos1posicion(String cadena, String Tablero[][]) {

        String sinParentesis1 = Utilidades.quitarParentesis(cadena);
        int[] posicion = Utilidades.quitarComa(sinParentesis1); //7,7

            if (Tablero[posicion[0]][posicion[1]].equals("O")) {
                System.out.println("El barco no puede colocars");
            }
            else {
            Tablero[posicion[0]][posicion[1]]="O";
        }

    }
    
    public void IngresarEasterEgg(String cadena, String Tablero[][]) {

        String sinParentesis1 = Utilidades.quitarParentesis(cadena);
        int[] posicion = Utilidades.quitarComa(sinParentesis1); //7,7

            if (Tablero[posicion[0]][posicion[1]].equals("O")) {
                System.out.println("El barco no puede colocars");
            }
            else {
            Tablero[posicion[0]][posicion[1]]="$";
        }

    }
    
    
    
    public static void ImprimirTablero(String Tablero[][]) {

        for (int i = 0; i < Tablero.length; i++) {

            for (int j = 0; j < Tablero[i].length; j++) {

                System.out.print(" | " + Tablero[i][j] + " | ");

            }
            System.out.println(" ");
        }
    }

}
