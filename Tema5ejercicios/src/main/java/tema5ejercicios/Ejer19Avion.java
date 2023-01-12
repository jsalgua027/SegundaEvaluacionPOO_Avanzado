/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5ejercicios;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class Ejer19Avion {

    /**
     * @param args the command line arguments
     *
     *
     *
     *
     * Crear un programa que, mediante un menú, permita reservar o cancelar
     * asientos de un avión, así como mostrar qué asientos están ocupados y
     * libres actualmente. El avión tendrá 25 filas de 4 asientos cada una.
     *
     *
     */
    private static Random aleatorio = new Random();
    private static Scanner teclado2 = new Scanner(System.in);

    public static void imprimirAvion(boolean[][] origen) {

        for (int i = 0; i < origen.length; i++) {
            for (int j = 0; j < origen[i].length; j++) {
                System.out.print("|" + "(" + i + "-" + j + ")" + ":" + origen[i][j] + "|");
            }
            System.out.println("");
        }
    }

    public static boolean ocupacionAleatoria() {
        boolean aux = true;
        int numero = aleatorio.nextInt(1 - 0 + 1) + 0;

        if (numero == 0) {
            aux = false;
        } else {
            aux = true;
        }
        return aux;
    }

    public static boolean[][] rellenarAsientosInicial(boolean[][] origen) {
        for (int i = 0; i < origen.length; i++) {
            for (int j = 0; j < origen[i].length; j++) {
                origen[i][j] = ocupacionAleatoria();
            }
        }

        return origen;
    }

    public static int leerEnteroSinErroresScanner() {
        int num = 0;
        boolean repetir = true;

        do {
            //  System.out.println("Introduce el numero entero");
            try {

                num = teclado2.nextInt();
                repetir = false;

            } catch (InputMismatchException ime) {
                System.out.println("No has introducido un numero entero");
                //limpio buffer
                teclado2.nextLine();
            }

        } while (repetir);

        return num;
    }

    public static boolean reservaAsiento(int fila, int asiento) {
        boolean aux = true;

        return aux;

    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int fila = 0;
        int asiento = 0;
        boolean ocupacion = true; //true es asiento libre
        String opcion = "";
        String menu = """
                                1.Para reservar  asientos
                                2.Para cancelar asientos
                                3.Para mostrar asientos
                                4.Salir
                             """;
        boolean[][] asientosAvion = new boolean[25][4];
        do {
            System.out.println(menu);
            System.out.println("Indique la opcion");
            opcion = teclado.nextLine();

            rellenarAsientosInicial(asientosAvion);
            imprimirAvion(asientosAvion);
            switch (opcion) {
                case "1" -> {
                    do {
                        System.out.println("¿Indique que  asientos?");
                        asiento = leerEnteroSinErroresScanner();

                        if ((asiento >= 0 || asiento <= 3)) {
                            System.out.println("El avión solo tiene 4 asientos por fila");
                        }
                    } while (!(asiento >= 0 || asiento <= 3));

                    do {

                        System.out.println("Indique la fila ");
                        fila = leerEnteroSinErroresScanner();
                        if (!(fila >= 0 || fila <= 25)) {
                            System.out.println("El avión solo tiene 25 filas");

                        }
                    } while ((fila >= 0 || fila <= 25));
                }
                case "2" -> {
                }

                default -> {
                }

            }

        } while (!opcion.equalsIgnoreCase("4"));

//        imprimirAvion(asientosAvion);
    }

}
