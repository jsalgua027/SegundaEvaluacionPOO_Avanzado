/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Ejer05 {

    /**
     * @param args the command line arguments
     *
     *
     *
     * Implementa un programa que guarde en un array 10 números enteros que se
     * leen por teclado. A continuación se recorre el array y calcula el número
     * total de positivos, de negativos y de ceros. Calcula y muestra la media
     * aritmética de los valores positivos y la de los valores negativos del
     * array. Implementar métodos para: Leer valores por teclado y almacenarlos
     * en el array. Se le pasará el array como parámetro y no devolverá nada.
     * Contar positivos, se le pasará el array como parámetro y devolverá el
     * número de positivos almacenados en el array. Contar negativos, se le
     * pasará el array como parámetro y devolverá el número de negativos
     * almacenados en el array. Contar ceros, se le pasará el array como
     * parámetro y devolverá el número de ceros almacenados en el array. Mostrar
     * array, se le pasará el array como parámetro y no devolverá nada, sólo
     * imprimirá por pantalla el array. Calcular media positivos, se le pasará
     * el array como parámetro y no devolverá nada, sólo imprimirá por pantalla
     * la media aritmética de los positivos. Calcular media negativos, se le
     * pasará el array como parámetro y no devolverá nada, sólo imprimirá por
     * pantalla la media aritmética de los negativos.
     *
     *
     *
     */
    private static final Scanner teclado = new Scanner(System.in);

    public static int leerEnteroSinErroresScanner() {
        int num = 0;
        boolean repetir = true;

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

        } while (repetir);

        return num;
    }

    // almaceno datos en el array
    public static void almacenarArray(int[] origen) {
        for (int i = 0; i < origen.length; i++) {
            origen[i] = leerEnteroSinErroresScanner();
        }

    }
    //cantidad de positivos

    public static int arrayPositivos(int[] origen) {
        int contador = 0;
        for (int i = 0; i < origen.length; i++) {
            if (origen[i] > 0) {
                contador++;
            }
        }

        return contador;

    }

    //cantidad de negativos
    public static int arrayNegativos(int[] origen) {
        int contador = 0;
        for (int i = 0; i < origen.length; i++) {
            if (origen[i] < 0) {
                contador++;
            }
        }

        return contador;

    }
    // cantidad de ceros

    public static int arrayCeros(int[] origen) {
        int contador = 0;
        for (int i = 0; i < origen.length; i++) {
            if (origen[i] == 0) {
                contador++;
            }
        }

        return contador;

    }

    //muestro el array
    public static void mostrarArray(int[] origen) {
        for (int i = 0; i < origen.length; i++) {
            System.out.print(" - " + origen[i]);
        }
    }

    public static void mediaPositivos(int[] origen) {
        int suma = 0;
        int media = 0;

        for (int i = 0; i < origen.length; i++) {
            if (origen[i] > 0) {
                suma += origen[i];

            }

        }
        try {
            media = suma / arrayPositivos(origen);
        } catch (ArithmeticException eme) {
            System.out.println("No se puede dividir entre cero");

        }

        System.out.println("La media aritmetica de los positivos es: " + media);
    }

    public static void mediaNegativos(int[] origen) {
        int suma = 0;
        int media = 0;

        for (int i = 0; i < origen.length; i++) {
            if (origen[i] < 0) {
                suma += origen[i];

            }

        }
        try {
            media = suma / arrayNegativos(origen);
        } catch (ArithmeticException eme) {
            System.out.println("No se puede dividir entre cero");

        }

        System.out.println("La media aritmetica de los negativos es: " + media);
    }

    public static void main(String[] args) {

        int contadorPositivos = 0;
        int contadorNegativos = 0;
        int contadorCeros = 0;
      

        int[] conjuntoNumeros = new int[10];

        almacenarArray(conjuntoNumeros);
        mostrarArray(conjuntoNumeros);
        System.out.println("");
        // cuento positivos
        contadorPositivos = arrayPositivos(conjuntoNumeros);
        System.out.println("¿Cuántos numeros positivos hay:? " + contadorPositivos);
        System.out.println("");
        //cuento negativos
        contadorNegativos = arrayNegativos(conjuntoNumeros);
        System.out.println("¿Cuántos numeros negativos hay:? " + contadorNegativos);
        //cuento ceros
        System.out.println("");
        contadorCeros = arrayCeros(conjuntoNumeros);
        System.out.println("¿Cuántos ceros hay:? " + contadorCeros);

        System.out.println("");
        System.out.println("************Muesto las medias***********");
        mediaPositivos(conjuntoNumeros);
        mediaNegativos(conjuntoNumeros);

    }

}
