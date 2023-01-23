/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vecinas;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Vecinas {

    /**
     * @param args the command line arguments
     */
    private static Random aleatorio = new Random();
     private static Scanner teclado = new Scanner(System.in);
    
    public static int aleatorioDentroRango(int min, int max) {
        int numeroGenerado;

        numeroGenerado = aleatorio.nextInt(max - min + 1) + min;

        return numeroGenerado;

    }

    public static int[][] rellenarMatrizAleatorioa(int[][] origen, int min, int max) {
        for (int i = 0; i < origen.length; i++) {
            for (int j = 0; j < origen[i].length; j++) {
                origen[i][j] = aleatorioDentroRango(min, max);
            }
        }

        return origen;
    }
    
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
      public static void imprimirMatriz(int[][] origen) {

        for (int i = 0; i < origen.length; i++) {
            for (int j = 0; j < origen[i].length; j++) {
                System.out.print("|" + "(" + i + "-" + j + ")" + ":" + origen[i][j] + "|");
            }
            System.out.println("");
        }
    }
      
      public static void vecinas( int[][]orien, int fila, int columna){
      
      if (fila< orien.length || columna< orien[fila].length){
      
      
      
      
      }
      
      }
    
    public static void main(String[] args) {
        int filas=0;
        int columnas=0;
        int coordenadaF=0;
        int coordenadaC=0;
        System.out.println(" Indique le numero de filas");
        filas=leerEnteroSinErroresScanner();
        System.out.println("Indique el numero de columnas");
        columnas=leerEnteroSinErroresScanner();
        int [][] matrizVecinas = new int[filas][columnas];
        rellenarMatrizAleatorioa(matrizVecinas, 1, 20);
        imprimirMatriz(matrizVecinas);
        
        System.out.println("Vamos a ver las vecinas");
        System.out.println("Coordendas x: fila");
        coordenadaF=leerEnteroSinErroresScanner();
        System.out.println("Coordendas y: coolumna");
        coordenadaC=leerEnteroSinErroresScanner();
        
        
        
        
    }
    
}
