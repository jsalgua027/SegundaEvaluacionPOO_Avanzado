/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MatrizAleatorios;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author Windows10
 */
public class MatrizAleatoria {

    /**
     * @param args the command line arguments
     */
    private static Random aleatorio = new Random();

    public static int aleatorioDentroRango(int min, int max) {
        int numeroGenerado;

        numeroGenerado = aleatorio.nextInt(max - min + 1) + min;

        return numeroGenerado;

    }

    public static int[][] rellenarMatriz(int numero) {
        double valorMaximo= Math.pow(numero, 2);
        int[][] aux = new int[numero][numero];
        Set<Integer> generados = new HashSet<>();
        for (int i = 0; i < aux.length; i++) {

            for (int j = 0; j < aux[i].length; j++) {
                int numeroAle;
                boolean generado = false;
                while (!generado) {
                    int valorProvisional = aleatorioDentroRango(1,(int)valorMaximo);
                    if (!generados.contains(valorProvisional)) {
                        generados.add(valorProvisional);
                        numeroAle = valorProvisional;
                        generado = true;
                        aux[i][j] = numeroAle;
                    }

                }

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

        int[][] matriz = rellenarMatriz(5);

        imprimirMatriz(matriz);
    }

}
