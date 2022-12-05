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
 * @author nacho
 */
public class Ejer011 {

    /**
     * @param args the command line arguments
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
    
     public static void mostrarArray(int[] origen) {
        for (int i = 0; i < origen.length; i++) {
            System.out.print(" - " + origen[i]);
        }
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
        // Para usar el metodo de busqueda tienen que estar ordenado el arrays
          Arrays.sort(arrayEnteros);
         mostrarArray(arrayEnteros);
         System.out.println("");
        System.out.println("uso del binatySearch");
        System.out.println("contiene el numero?: " + Arrays.binarySearch(arrayEnteros, numeroPedido));

    }
        
        
        
    }
    

