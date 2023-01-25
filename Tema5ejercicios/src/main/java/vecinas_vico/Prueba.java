/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vecinas_vico;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nacho
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    
    
    public static List<Casilla> casillasVecinas(int fila, int columna, int[][] m) {
        List<Casilla> lista = new ArrayList<>();
        // comprobamos fila  y columna  para que sean validos

        if (filaValida(fila, m) && ColumnaValida(columna, m)) {
            for (int i = fila - 1; i < fila + 1; i++) {
                if (filaValida(i, m)) { 
                    for (int j = columna - 1; j < columna + 1; j++) {
                        if (ColumnaValida(j, m)) {

                            if (j == fila && j == columna) {
                                continue;// se salta la iteracion del bucle for 
                            }
                            System.out.println("casilla " + i + " " + j);
                            lista.add(new Casilla(i,j,m[i][j]));
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

    public static boolean ColumnaValida(int columna, int[][] matriz) {

        return columna >= 0 && columna < matriz.length;

    }

    public static void main(String[] args) {

        int[][] numeros = {
            {1, 2, 4, 3},
            {4, 5, 6, 7},
            {8, 9, 10, 11},
            {3, 5, 8, 9}
        };
        casillasVecinas(2, 3, numeros).forEach(System.out::println);
    }

}
