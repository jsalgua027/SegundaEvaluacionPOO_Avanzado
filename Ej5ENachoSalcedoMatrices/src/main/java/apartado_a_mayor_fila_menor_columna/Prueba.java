/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apartado_a_mayor_fila_menor_columna;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class Prueba {

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

    public static void imprimirMatriz(int[][] origen) {

        for (int i = 0; i < origen.length; i++) {
            for (int j = 0; j < origen[i].length; j++) {
                System.out.print("|" + "(" + i + "-" + j + ")" + ":" + origen[i][j] + "|");
            }
            System.out.println("");
        }
    }

    public static int[][] rellenarMatrizAleatorioa(int[][] origen, int min, int max) {
        for (int i = 0; i < origen.length; i++) {
            for (int j = 0; j < origen[i].length; j++) {
                origen[i][j] = aleatorioDentroRango(min, max);
            }
        }

        return origen;
    }

    public static void main(String[] args) {
       int [][] matriz = new int [3][3];
       int valorMax= matriz[0][0];
       int valorMin = matriz[0][0];
        rellenarMatrizAleatorioa(matriz, 0, 20);
        imprimirMatriz(matriz);
       
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(valorMax< matriz[i][j]){
                valorMax= matriz[i][j];
                }if(valorMin> matriz[i][j]){
                valorMin=matriz[i][j];
                }
            }
        }
        
        System.out.println(" el valor maximo es: " +valorMax);
        System.out.println(" el valor minimo es: " +valorMin);
    }

}
