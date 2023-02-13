/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binarios;

import java.util.Random;

/**
 *
 * @author Windows10
 */
public class binario {

    /**
     * @param args the command line arguments
     */
    
     private static Random aleatorio = new Random();

    public static int aleatorioDentroRango(int min, int max) {
        int numeroGenerado;

        numeroGenerado = aleatorio.nextInt(max - min + 1) + min;

        return numeroGenerado;

    }

    public static int[][] generarMatriz(int filas, int columnas){
            int[][] aux = new int [filas][columnas];
            for (int i = 0; i < aux.length; i++) {
                for (int j = 0; j < aux[i].length; j++) {
                    aux[i][j]=aleatorioDentroRango(0, 1);
                }
        }
            
            return aux;
    }
    
       public static void imprimirMatriz(int[][] aux) {

        for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux[i].length; j++) {
                System.out.print("|"+aux[i][j]+"|");
            }
            System.out.println(" ");
        }

    }
    public static void main(String[] args) {
      int[][] matriz = generarMatriz(5, 5);
        imprimirMatriz(matriz);
        
         int[][] prueba
                = {
                    {0, 1, 0, 1, 0},
                    {1, 0, 1 ,0, 1},
                    {0, 1, 0, 1,0},
                    {0, 0, 0, 0, 0}
                };
        
        
        
        
    }
    
}
