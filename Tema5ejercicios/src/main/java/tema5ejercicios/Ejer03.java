/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5ejercicios;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Windows10
 */
public class Ejer03 {

    /**
     * @param args the command line arguments
     *
     * Crea un array de doubles de tamaño 20. Usando los métodos de la clase
     * Arrays:
     *
     * Rellena el array con el valor 7.5 en todas sus posiciones. Realiza una
     * copia del array anterior en un nuevo array. Imprime ambos arrays. Compara
     * ambos arrays, mostrando si son iguales. Introduce el valor 6.3 en una
     * posición aleatoria válida de uno de los arrays. Imprime ambos arrays.
     * Vuelve a compararlos, indicando si son iguales o no.
     *
     *
     *
     *
     */
    public static void main(String[] args) {
        Random numeroAleatorio = new Random();
        int posicionAlatoria;
    double[] array1 = new double[20];
//        for (int i = 0; i < array1.length; i++) {
//            array1[i] = 7.5;
//        }
         // meto el  valor 7.5 en el array con un metodo de la clase Arrays
        Arrays.fill(array1,7.5);
        System.out.println("Imprimo array1: ");
        for (double d : array1) {
            System.out.print(" - " + d);
        }
        System.out.println(" ");
        // uso el metodo estatico de la clase Array donde le indico que array quiero copiar y cuantos posiciones de la misma
        double[] array2 = Arrays.copyOf(array1, 20);
        System.out.println("Imprimo array2: ");

        for (double d : array2) {
            System.out.print(" - " + d);
        }
        System.out.println("");
        System.out.println("Son iguales el arra1 y array2: " + Arrays.equals(array1, array2));
        System.out.println("");
        System.out.println("Genero numero aleatorio para usarlo como posicion para darle el  valor 6.3 en el array2."
                + " Vuelvo a imprimir los dos arrays ");

        // genero un numero Aleatorio dentro del rango para usarlo de posicion para  meter el valor
        posicionAlatoria = numeroAleatorio.nextInt(20 - 0 + 1) + 0;
        array2[posicionAlatoria] = 6.3;
        System.out.println("");
        System.out.println("Imprimo array1: ");
        for (double d : array1) {
            System.out.print(" - " + d);
        }
        System.out.println(" ");
        System.out.println("Imprimo array2: ");

        for (double d : array2) {
            System.out.print(" - " + d);
        }
        
        System.out.println("");
        System.out.println("Son iguales el arra1 y array2: " + Arrays.equals(array1, array2));
    }

}
