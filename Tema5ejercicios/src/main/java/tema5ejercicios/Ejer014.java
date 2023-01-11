/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5ejercicios;

import java.util.Random;

/**
 *
 * @author Windows10
 */
public class Ejer014 {

    /**
     * @param args the command line arguments
     *
     *
     * Escribe un programa que dada una matriz de 3x3 enteros y realice las
     * siguientes funciones:
     *
     * Rellenar aleatoriamente todas las casillas de la matriz con números
     * enteros entre 1 y 100 Calcular la media de todos los valores Calcular el
     * valor mínimo y el máximo de todos los valores
     *
     *
     *
     *
     */
    private static Random aleatorio = new Random();

    public static int aleatorioDentroRango(int min, int max) {
        int numeroGenerado;

        numeroGenerado = aleatorio.nextInt(max - min + 1) + min;

        return numeroGenerado;

    }

    public static void main(String[] args) {

        int min = 1;
        int max = 100;
        int[][] matriz = new int[3][3];
        int totalvalores = 0;
        double media = 0;
        int valorMax = 0;
        int valorMIn = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                int num = aleatorioDentroRango(min, max);
                matriz[i][j] = num;
                totalvalores += num;

                if (matriz[i][j] > num) {

                    matriz[i][j] = valorMax;
                } else if (matriz[i][j] < num) {
                    matriz[i][j] = valorMIn;

                }

            }
        }

        //calculo la media de todos los valores
        media = totalvalores / 9;
//        //compruebo valores
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz[i].length; j++) {
//                if (matriz[i][j] > matriz[i + 1][j + 1]) {
//
//                }
//            }
//
//        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + "  ");

            }
            System.out.println(" ");
        }
        System.out.println("La media de todos los valores es: " + media);
        System.out.println("");
        System.out.println("El valor Máximo es: " + valorMax);
        System.out.println("");
        System.out.println("El valor Mínimo  es: " + valorMIn);

    }

}
