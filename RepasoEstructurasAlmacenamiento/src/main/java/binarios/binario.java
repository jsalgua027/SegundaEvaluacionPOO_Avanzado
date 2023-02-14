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

    public static int[][] generarMatriz(int filas, int columnas) {
        int[][] aux = new int[filas][columnas];
        for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux[i].length; j++) {
                aux[i][j] = aleatorioDentroRango(0, 1);
            }
        }

        return aux;
    }

    public static void imprimirMatriz(int[][] aux) {

        for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux[i].length; j++) {
                System.out.print("|" + aux[i][j] + "|");
            }
            System.out.println(" ");
        }

    }

   

    public static void comprobarEsquinas(int[][] m) {
    
        for (int i = 1; i < m.length - 1; i++) {
            for (int j = 1; j < m[i].length - 1; j++) {
                if ((m[i - 1][j - 1] == 1) && (m[i - 1][j + 1] == 1) && (m[i + 1][j - 1] == 1) && (m[i + 1][j + 1] == 1)) {

                    System.out.println("La casilla que reune las caracteristicas es: " + i + "-" + j);
                }
            }
        }
    }

    public static void busquedaBinaria(int[][] m) {

        for (int i = 1; i < m.length - 1; i++) {
            for (int j = 1; j < m[i].length - 1; j++) {
                if (m[i][j] == 0) {
                    comprobarEsquinas(m);
                    break;
                }
                break;
            }
        }
    }

    public static void main(String[] args) {
    int[][] matriz = generarMatriz(5, 5);
        imprimirMatriz(matriz);
        busquedaBinaria(matriz);

        int[][] prueba
                = {
                    {0, 1, 0, 1, 0},
                    {1, 0, 0, 0, 1},
                    {0, 1, 0, 1, 0},
                    {0, 0, 0, 0, 0}
                };
        imprimirMatriz(prueba);

        busquedaBinaria(prueba);

    }

}
