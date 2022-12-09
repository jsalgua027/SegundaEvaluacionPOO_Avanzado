/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjercicioPropuesyo;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class EjerPropuestoCapicuas {

    /**
     * @param args the command line arguments
     *
     * 1.Leer numero por teclado en int el int lo pasamos a String de string a
     * array de char[]
     *
     * recorrer el array desde los dos extremos y comprobamos si es capicua
     *
     *
     * ****************************** otro ejecicio rellenar un array con
     * letras mayusculas array de char[] (25 letras) generamos un array d tamaño
     * aleatorio entre 0y 25 pero que no se salga del array de char generamos un
     * numero aleatorio para que coja las posiciones del array de char[] y meta
     * el char valido en el nuevo array
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
            } while (num <= 0);

        } while (repetir);

        return num;
    }

    public static void mostrarArray(char[] origen) {
        for (int i = 0; i < origen.length; i++) {
            System.out.print(" - " + origen[i]);
        }
    }

    public static char[] tranformamosTipo(int numero) {
        char[] resultado = {' '};
        String numeroString = " ";
        //Transformo el numero a string
        numeroString = Integer.toString(numero);
        //meto ek String en un array de char[]
        resultado = numeroString.toCharArray();

        return resultado;

    }

    public static boolean esCapicua(char[] origen) {
      
        char[] aux =new char[origen.length];
        for (int i = origen.length-1; i >=0; i--) {

            aux[i]=origen[origen.length-1-i];
            
        }
       return  Arrays.equals(origen, aux);

      

    }
  // otra forma de hacerlo mas eficiente.
    public static boolean capicua(char[] origen){
        for (int i = 0; i < origen.length/2; i++) {
            if (origen[i]!= origen[origen.length-i-1]){
            return false;
            }
        }
    return true;
    }
    
    public static void main(String[] args) {
        int numero = leerEnteroSinErroresScanner();
        char[] numeroChar = tranformamosTipo(numero);
        mostrarArray(numeroChar);
        System.out.println("");

        System.out.println("Es capicua el numero: " + esCapicua(numeroChar));

 
    }

}
