/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vecinas_diagonales_vico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author nacho
 */
public class VecinasDiagonales {

    /**
     * @param args the command line arguments
     */
    public static List<Casilla> casillasVecinas(int fila, int columna, int[][] m) {
        List<Casilla> lista = new ArrayList<>();

        // Comprobamos fila y columna, para que sean válidas
        if (filaValida(fila, m) && columnaValida(columna, m)) {

            // Recorremos fila anterior a la casilla hasta fila posterior
            for (int i = fila - 1; i <= fila + 1; i++) {
                if (filaValida(i, m)) { // Si alguna fila no es válida, no la mira
                    // Recorremos columna anterior a la casilla hasta columna posterior
                    for (int j = columna - 1; j <= columna + 1; j++) {
                        // Si alguna columna no es válida, no la mira
                        if (columnaValida(j, m)) {
                            if (i == fila && j == columna) {
                                continue;
                            }
                            System.out.println("Casilla " + i + " " + j);
                            lista.add(new Casilla(i, j, m[i][j]));
                        }

                    }
                }

            }

        }

        return lista;
    }

    public static boolean filaValida(int fila, int[][] matriz) {

        return fila >= 0 && fila < matriz.length;

    }

    public static boolean columnaValida(int columna, int[][] matriz) {

        return columna >= 0 && columna < matriz.length;

    }

    public static void mostrar(int[][] m) {
        for (int[] fila : m) { // Por cada fila de la matriz m
            for (int valor : fila) { // Por cada elemento que hay en la fila
                System.out.print(valor + " ");
            }
            System.out.println("");
        }
    }

    public static int[] elementosDiagonalSecundaria(int[][] m) {
        int[] array = new int[m.length];

        for (int i = 0; i < m.length; i++) {
            array[i] = m[i][m.length - 1 - i];
        }

        return array;
    }

    public static List<Integer> elementosDiagonalPrincipal(int[][] m) {
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < m.length; i++) {
            lista.add(m[i][i]);
        }

        return lista;

    }

    public static void main(String[] args) {

        int[][] matriz = {
            {4, 6, 3, 2},
            {5, 9, 7, 6},
            {4, 4, 1, 1},
            {0, 3, 6, 8}
        };

        List<Casilla> listaCasillas = casillasVecinas(2, 2, matriz);

        for (Casilla casilla : listaCasillas) {
            System.out.println(casilla);
        }

        mostrar(matriz);
        List<Integer> diagonal = elementosDiagonalPrincipal(matriz);
        diagonal.forEach(System.out::println);

        System.out.println(Arrays.toString(elementosDiagonalSecundaria(matriz)));
    }

}
