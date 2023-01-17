/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apartado_a_mayor_fila_menor_columna;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class ejer {

    /**
     * @param args the command line arguments
     */
    private static Random aleatorio = new Random();
    private static Scanner teclado = new Scanner(System.in);

    // leer enteros y decimales  sin errores  SCANNER (INPUTMISMATCHEXCEPTION)
    public static int leerEnteroSinErroresScanner() {
        int num = 0;
        boolean repetir = true;

        do {
            System.out.println("Introduce el numero entero ");
            try {

                num = teclado.nextInt();
                repetir = false;

            } catch (InputMismatchException ime) {
                System.out.println("No has introducido un numero entero");
                //limpio buffer
                teclado.nextLine();
            }

        } while (repetir);

        return num;
    }

    public static int aleatorioDentroRango(int min, int max) {
        int numeroGenerado;

        numeroGenerado = aleatorio.nextInt(max - min + 1) + min;

        return numeroGenerado;

    }

    public static void imprimirMatriz(int[][] origen) {

        for (int i = 0; i < origen.length; i++) {
            for (int j = 0; j < origen[i].length; j++) {
                System.out.print("|" + "(" + i + "-" + j + ")" + ":" + origen[i][j] + "|");
            }
            System.out.println("");
        }
    }

    public static int[][] rellenarMatrizAleatorioa(int[][] origen, int min, int max) {
        for (int i = 0; i < origen.length; i++) {
            for (int j = 0; j < origen[i].length; j++) {
                origen[i][j] = aleatorioDentroRango(min, max);
            }
        }

        return origen;
    }

    public static int[][] rellenarMatrizSolicitando(int[][] origen) {
        for (int i = 0; i < origen.length; i++) {
            for (int j = 0; j < origen[i].length; j++) {
                origen[i][j] = leerEnteroSinErroresScanner();
            }
        }

        return origen;
    }

    public static Coordenada MayorFilaYMenosColumna(int[][] origen) {
        Coordenada aux = new Coordenada();
        int valorMax = origen[0][0];
        int valorMin = origen[0][0];

        for (int i = 0; i < origen.length; i++) {

            for (int j = 0; j < origen[i].length; j++) {

                if (valorMax <= origen[i][j]) {
                    valorMax = origen[i][j];
                    for (int k = 0; k < origen[j].length; k++) {
                        if (valorMin >= origen[i][j]) {
                            valorMin = origen[i][j];

                            aux.setFila(i);
                            aux.setColumna(j);

                            return aux;

                        } else {
                            aux.setFila(-1);
                            aux.setColumna(-1);
                            return aux;
                        }
                    }
                }
            }
        }

        return aux;
    }

    public static void main(String[] args) {

        String menu = """
                            ----------------------------------------
                                  Jueguemos con matrices
                  
                              1. Apartado A del Ejercicio
                              2. Apartado B del Ejercicio
                              3. Para salir
                           ----------------------------------------   
                  """;
        int opcion = 0;
        int numeroFilasYColumnas = 0;
        Coordenada apartadoA;
        Coordenada apartadoB;

        do {
            System.out.println(menu);
            opcion = leerEnteroSinErroresScanner();

            switch (opcion) {

                case 1 -> {
                    do {
                        System.out.println("********* Vamos a ver el tamaño de la matriz **********");
                        System.out.println("Indique el número de filas y columnas entre 3 y 6");
                        numeroFilasYColumnas = leerEnteroSinErroresScanner();

                    } while (!((numeroFilasYColumnas >= 3 && numeroFilasYColumnas <= 6)));
                    int[][] matrizA = new int[numeroFilasYColumnas][numeroFilasYColumnas];
                    System.out.println("*********** Vamos a rellenar la Matriz************** ");
                    rellenarMatrizSolicitando(matrizA);
                    imprimirMatriz(matrizA);
                    apartadoA = MayorFilaYMenosColumna(matrizA);
                    System.out.println(apartadoA.toString());
                }

                case 2 -> {
                    do {
                        System.out.println("Vamos a ver el tamaño de la matriz");
                        System.out.println("Indique el número de filas y columnas entre 3 y 6");
                        numeroFilasYColumnas = leerEnteroSinErroresScanner();

                    } while (!((numeroFilasYColumnas >= 3 && numeroFilasYColumnas <= 6)));
                    int[][] matrizB = new int[numeroFilasYColumnas][numeroFilasYColumnas];
                    rellenarMatrizAleatorioa(matrizB, 0, 20);

                    imprimirMatriz(matrizB);
                    apartadoB = MayorFilaYMenosColumna(matrizB);
                    System.out.println(apartadoB.toString());
                }
                default -> {
                }

            }

        } while (opcion != 3);

    }

}
