/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5ejercicios;

/**
 *
 * @author Windows10
 */
public class Ejer18 {

    /**
     * @param args the command line arguments
     *
     *
     * Implementa el algoritmo de búsqueda binaria que hay en los apuntes y
     * aplícalo sobre un array de números enteros ordenado. El programa debe
     * devolver si ha encontrado o no el número y el número de comparaciones con
     * elementos del array que ha requerido para encontrarlo. Probarlo con el
     * vector int v[] = {2,3,4,5,6,7,8,9,10,11,12} y los números 11 y 13.
     */
    public static void main(String[] args) {
        int[] numeros = {2,3,4,5,6,7,8,9,10,11,12};

        int mitad;
        int limiteInferior = 0;
        int limiteSuperior = numeros.length - 1;
        int numeroBusqueda = 11;
         int numeroBusqueda2 = 13;
        boolean encontrado = false;

        while ((limiteInferior <= limiteSuperior) && (!encontrado)) {
            mitad = (limiteInferior + limiteSuperior) / 2;

            if (numeros[mitad] == numeroBusqueda) {
                encontrado = true;          // ¡encontrado!
            } else if (numeros[mitad] > numeroBusqueda) {
                limiteSuperior = mitad - 1; // buscar en la primera mitad
            } else {
                limiteInferior = mitad + 1; // buscar en la segunda mitad
            }
        }

        if (encontrado) {
            System.out.println("He encontrado el número");
        } else {
            System.out.println("No he encontrado el número");
        }

    }

}


