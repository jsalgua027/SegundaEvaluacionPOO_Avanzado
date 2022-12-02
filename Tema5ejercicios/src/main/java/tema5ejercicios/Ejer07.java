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
public class Ejer07 {

    /**
     * @param args the command line arguments
     *
     *
     * Escribir un programa que lea del teclado el tamaño de dos arrays de
     * enteros (el mismo tamaño para los dos arrays). El programa inicializará
     * los arrays con números aleatorios entre 1 y 100. Existirá un método
     * llamado multiplicar que recibirá los dos arrays e irá multiplicando los
     * elementos dos a dos, empezando por los elementos que ocupan la posición
     * cero, luego la uno, etc, guardando el resultado en otro array, que será
     * devuelto por el método. Además existirá un método para imprimir por
     * pantalla los valores de los arrays.
     *
     *
     *
     */
    private static final Scanner teclado = new Scanner(System.in);
    private static Random numRandom = new Random();
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
            } while (num <= 0);

        } while (repetir);

        return num;
    }

    public static void mostrarArray(int[] origen) {
        for (int i = 0; i < origen.length; i++) {
            System.out.print(" - " + origen[i]);
        }
    }
    
    public static int[] generoArrayEnterosValoresRandom(int tamanio, int rangoMax, int rangoMin){
     int[]aux=new int[tamanio];
        for (int i = 0; i < aux.length; i++) {
            aux[i]=numRandom.nextInt(rangoMax-rangoMin+1)+rangoMin;
        }
    return aux;
    }
    
    public static int[] multiplicar(int[]array1, int[]array2){
    int[] resultado=new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            resultado[i]=array1[i]*array2[i];
        }
    
        return resultado;
    
    }

    public static void main(String[] args) {
        int tamanio=leerEnteroSinErroresScanner();
        int[] array1 = generoArrayEnterosValoresRandom(tamanio, 100, 1);
        int[] array2 = generoArrayEnterosValoresRandom(tamanio, 100, 1);
        
        
        System.out.println("Muestro los dos arrays");
        System.out.println(" ");
        mostrarArray(array1);
        System.out.println(" ");
        mostrarArray(array2);
        System.out.println(" ");
        System.out.println("Realizo la multiplicación de los dos arrays y la muestro");
        int[] arrayResultado=multiplicar(array1, array2);
        mostrarArray(arrayResultado);
        
        
    }

}
