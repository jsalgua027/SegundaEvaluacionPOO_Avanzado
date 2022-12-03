/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5ejercicios;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class Ejer04 {

    /**
     * @param args the command line arguments
     *
     * Escribe un programa que, dado un array de enteros de cualquier tamaño,
     * busque si un número obtenido por teclado se encuentra en el array e
     * imprima la primera posición en la que se encuentra el número. Realiza la
     * búsqueda de un elemento: implementando el método de búsqueda secuencial.
     * usando el método de búsqueda binaria de la clase Arrays.
     *
     *
     */
    private static Scanner teclado = new Scanner(System.in);

    public static int leerEnteroSinErroresScanner() {
        int num = 0;
        boolean repetir = true;

        do {
            do {

                System.out.println("Introduce el numero entero");
                try {

                    num = teclado.nextInt();
                    repetir = false;

                } catch (InputMismatchException ime) {
                    System.out.println("No has introducido un numero entero");
                    //limpio buffer
                    teclado.nextLine();
                }
            } while (num < 0);

        } while (repetir);

        return num;
    }

    public static boolean comprobarSiContiene(int[] origen, int indice, int valor) {
        for (int i = 0; i < indice; i++) {
            if (origen[i] == valor) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Random numAleatorio = new Random();

        int[] arrayEnteros = new int[10];
        int n = 0;
        for (int i = 0; i < arrayEnteros.length; i++) {

            do {//bucle para que sean distintos los aleatorios 
                n = numAleatorio.nextInt(15 - 0 + 1) + 0;
            } while (comprobarSiContiene(arrayEnteros, i, n));

            arrayEnteros[i] = n;

        }

        for (int arrayEntero : arrayEnteros) {
            System.out.println(" - " + arrayEntero);
        }

        int numeroPedido = leerEnteroSinErroresScanner();
        for (int i = 0; i < arrayEnteros.length; i++) {

            if (numeroPedido == arrayEnteros[i]) {
                System.out.println("Has acertado, esta en la posición: " + i);
                break;
            } else {

                System.out.println("No has acertado");
            }
        }
        System.out.println("uso del binatySearch");
        System.out.println("contiene el numero?: " + Arrays.binarySearch(arrayEnteros, numeroPedido));

    }

}
