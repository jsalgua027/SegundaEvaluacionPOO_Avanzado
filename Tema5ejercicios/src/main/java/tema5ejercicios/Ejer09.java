/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5ejercicios;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import static tema5ejercicios.Ejer10.comprobarSiContiene;

/**
 *
 * @author Windows10
 */
public class Ejer09 {

    /**
     * @param args the command line arguments
     */
    private static final Scanner teclado = new Scanner(System.in);

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

    public static int[] bubbleSort(int[] origen) {
        for (int i = 0; i < origen.length - 1; i++) {
            for (int j = i + 1; j < origen.length; j++) {
                if (origen[i] >origen[j]) {
                    int temp = origen[i];
                    origen[i] = origen[j];
                    origen[j] = temp;
                }
            }

        }

        return origen;
    }

    public static void mostrarArray(int[] origen) {
        for (int i = 0; i < origen.length; i++) {
            System.out.print(" - " + origen[i]);
        }
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

            do {
                n = numAleatorio.nextInt(15 - 0 + 1) + 0;
            } while (comprobarSiContiene(arrayEnteros, i, n));

            arrayEnteros[i] = n;

        }

        mostrarArray(arrayEnteros);
        System.out.println("");

//            int numeroPedido=leerEnteroSinErroresScanner();
//        for (int i = 0; i < arrayEnteros.length; i++) {
//            
//            if (numeroPedido== arrayEnteros[i]){
//                System.out.println("Has acertado, esta en la posición: "+ i);
//            break;
//            }else{
//            
//                System.out.println("No has acertado");
//            }
//        }
//        System.out.println("uso del binatySearch");
//        System.out.println("contiene el numero?: "+   Arrays.binarySearch(arrayEnteros, numeroPedido) );
//        
        int[] ordenados = bubbleSort(arrayEnteros);

        mostrarArray(ordenados);

    }

}
