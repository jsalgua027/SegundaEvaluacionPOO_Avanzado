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
 * @author jsalc
 */
public class Ejer10 {

    /**
     * @param args the command line arguments
     * 
     * 
     * En el programa del ejercicio 4, incluir un método llamado ordenarQuick(int [] arrayOrdenar)
     * para ordenar el array que se le pase, usando la clase Arrays.

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
      
      public static void  ordenarQuick(int[] origen){
   //   int [] aux= new int[origen.length];
               Arrays.sort(origen);
              
 
      }
      
      
      
      
      
    public static void main(String[] args) {
      
        
           Random numAleatorio= new Random();
    
        int [] arrayEnteros= new int[10];
        for (int i = 0; i < arrayEnteros.length-1; i++) {
            
            arrayEnteros[i]=numAleatorio.nextInt(15-0+1)+0;
                if (arrayEnteros[i]== arrayEnteros[i+1]){
                i--;
                }


        }
        
        for (int arrayEntero : arrayEnteros) {
            System.out.println(" - "+ arrayEntero);
        }
        
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
            System.out.println("*****************************************************************");
        ordenarQuick(arrayEnteros);
          for (int arrayEntero : arrayEnteros) {
            System.out.println(" - "+ arrayEntero);
        }
        
        
    }
    
}
