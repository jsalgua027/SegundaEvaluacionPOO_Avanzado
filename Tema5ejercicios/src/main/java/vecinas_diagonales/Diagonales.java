/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vecinas_diagonales;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class Diagonales {

    /**
     * @param args the command line arguments
     */
    private static Random aleatorio = new Random();
       private static Scanner teclado = new Scanner(System.in);
    
    
    
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
    
    public static void imprimirMatriz(char[][] origen) {
        
        for (int i = 0; i < origen.length; i++) {
            for (int j = 0; j < origen[i].length; j++) {
                //System.out.print("|" + origen[i][j] + "|");
                 System.out.print("|" + "(" + i + "-" + j + ")" + ":" + origen[i][j] + "|");
            }
            System.out.println("");
        }
    }
    
    public static char[][] rellenarMatrizAleatorioa(char[][] origen, int min, int max) {
        for (int i = 0; i < origen.length; i++) {
            for (int j = 0; j < origen[i].length; j++) {
                origen[i][j] = (char) aleatorioDentroRango(min, max);
            }
        }
        
        return origen;
    }
    
    public static void diagonalPrincipal(char[][] origen) {
        
        for (int i = 0; i < origen.length; i++) {
         
                System.out.print("|"  + origen[i][i] + "|");
                
            
            }
            
            System.out.println("");
        
           
        }
    
     public static void diagonalSecundaria(char[][] origen) {
       
         int fila=origen.length-1;
        for (int i = 0; i < origen.length; i++) {
         
                System.out.print("|"  + origen[fila][i] + "|");
                
            fila--;
            }
            
            System.out.println("");
        
           
        }
        
    
    
    public static void main(String[] args) {
       int tamanio=0;
       
        System.out.println("indique el tamaño de la matriz, es cuadrada");
       tamanio=leerEnteroSinErroresScanner();
        
        char[][] diagonales = new char[tamanio][tamanio];
        rellenarMatrizAleatorioa(diagonales, 61, 79);
        imprimirMatriz(diagonales);
        System.out.println("*******DIAGONALES************");
        System.out.println("Diagonal Principal");
        diagonalPrincipal(diagonales);
        System.out.println("Diagonal Secundaria ");
        diagonalSecundaria(diagonales);
    }
    
}
