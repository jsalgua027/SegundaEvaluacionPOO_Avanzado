/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class Ejer08 {

    /**
     * @param args the command line arguments
     *
     *
     *
     *
     * Realizar un programa que lea de la entrada un número y utilice ese número
     * para crear un array de enteros de ese tamaño. A continuación, el programa
     * inicializa el array con los valores que el usuario introduzca por
     * teclado. Finalmente, se deberá recorrer el array e imprimir tantos
     * caracteres ‘*’ como indique el valor de cada elemento del array. Ejemplo:
     * los valores 5,4,3,2 producirán la siguiente salida:
       **** 
       ***
       **
       *
     */
    
      private static final Scanner teclado = new Scanner(System.in);
      public static int leerEnteroSinErroresScanner() {
        int num = 0;
        boolean repetir = true;

        do {
            do {

            //    System.out.println("Introduce el numero:");
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

      
      // metodos sobrecargados mostrar array para int y para string
    public static void mostrarArray(int[] origen) {
        for (int i = 0; i < origen.length; i++) {
            System.out.print(" - " + origen[i]);
        }
    }
    
      public static void mostrarArray(String[] origen) {
        for (int i = 0; i < origen.length; i++) {
            System.out.println(" - " + origen[i]);
        }
    }
    
    
    public static String generadorCaracteres(int numero){
        String caratere="*";
        String total="";
        for (int i = 0; i < numero; i++) {
            total+=caratere;
        }
        return total;
    }
    
    
    public static void main(String[] args) {
        String menu= """
                                Vamos a jugar
                                
                                1.Para iniciar el juego
                                
                                2.Para finalizar
                     
                     
                              """;
        
        int opcion=0;
        int tamanio=0;
    
     
        
        do {            
            
            System.out.println(menu);
            opcion=leerEnteroSinErroresScanner();
            if (opcion==1){
                System.out.println("Que tamaño tiene el array");
                tamanio=leerEnteroSinErroresScanner();
                int[] arrayEnteros=new int[tamanio];
                String[] arrayString =new String[tamanio];
                for (int i = 0; i < arrayEnteros.length; i++) {
                    System.out.println("Indique el valor " + (i+1));
                    arrayEnteros[i]=leerEnteroSinErroresScanner();
                    arrayString[i]=generadorCaracteres(arrayEnteros[i]);
                }
                mostrarArray(arrayEnteros);
                System.out.println(" ");
                mostrarArray(arrayString);
                   System.out.println(" ");
                
            }
            
            
            
        } while (opcion!=2);
        
        
       
    }

}
