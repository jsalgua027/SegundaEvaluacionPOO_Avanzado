/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5ejercicios;

import java.util.Arrays;

/**
 *
 * @author nacho
 */
public class Ejer06 {

    /**
     *
     *
     *
     * Hacer un programa que determine si dos arrays son iguales.Probarlo con
     * los arrays [1,2,3] y [1,2,3], [1,2,3,4] y [1,2,3] , [1,2,3] y
     * [1,2,2].Este ejercicio hay que hacerlo de dos formas: la primera, usando
     * la clase Arrays; la segunda, creando un método que vaya comparando los
     * valores de los arrays y devuelva true si todos son iguales o false en
     * caso contrario.
     *
     *
     *
     *
     * @param origen1
     * @param origen2
     * @return
     */
    public static boolean sonIguales(int[] origen1, int[] origen2) {
        boolean igual = true;
        if (origen1.length != origen2.length) {
            igual = false;

        } else {
            for (int i = 0; i < origen1.length; i++) {

                if (origen1[i] != origen2[i]) {
                    igual = false;
                    break;
                } else {
                    igual = true;
                }

            }

        }

        return igual;
    }

    public static void main(String[] args) {

        //Probarlo con los arrays:
        // A [1,2,3] y [1,2,3]
        // B [1,2,3,4] y [1,2,3] 
        // C [1,2,3] y [1,2,2]
        String pruebas = """
                                            ¿Son iguales?
                                            A   [1,2,3] y [1,2,3]
                                            B   [1,2,3,4] y [1,2,3] 
                                            C   [1,2,3] y [1,2,2]
                                           """;

        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        int[] array3 = {1, 2, 3, 4};

        int[] array4 = {1, 2, 2};

        System.out.println(" Usamos el método estatico de la clase Array para ver si son iguales las tres opciones: ");
        System.out.println(pruebas);
       
        System.out.println("Opcion A: " + Arrays.equals(array1, array2));
        System.out.println(" ");
        System.out.println("Opcion B: " + Arrays.equals(array3, array2));
        System.out.println(" ");
        System.out.println("Opcion C: " + Arrays.equals(array1, array4));

        System.out.println(" ");
        System.out.println("Usamos el método que hemos creado para la segunda parte del ejercicio");
        System.out.println("Opcion A: " + sonIguales(array1, array2));
        System.out.println(" ");
        System.out.println("Opcion B: " + sonIguales(array3, array2));
        System.out.println(" ");
        System.out.println("Opcion C: " + sonIguales(array1, array4));

    }

}
