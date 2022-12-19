/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5ejercicios;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

/**
 *
 * @author Windows10
 */
public class Ejer023 {

    /**
     * @param args the command line arguments
     */
    private static Random aleatorio = new Random();

    public static int aleatorioDentroRango(int min, int max) {
        int numeroGenerado;

        numeroGenerado = aleatorio.nextInt(max - min + 1) + min;

        return numeroGenerado;

    }

    public static void main(String[] args) {

        int tamanio1 = aleatorioDentroRango(5, 15);
        int tamanio2 = aleatorioDentroRango(10, 20);
        int valoresArray = 0;
        System.out.println(tamanio1);
        ArrayList<Integer> lista1 = new ArrayList<>(tamanio1);
        ArrayList<Integer> lista2 = new ArrayList<>(tamanio2);
        ArrayList<Integer> lista3 = new ArrayList<>();
        ArrayList<Integer> lista4 = new ArrayList<>();

        // agrego valores aleatorios a lista 1
        for (int i = 0; i < tamanio1; i++) {
            valoresArray = aleatorioDentroRango(50, 100);
            lista1.add(valoresArray);
        }

        // agrego valores aleatorios a lista 2
        for (int i = 0; i < tamanio2; i++) {
            valoresArray = aleatorioDentroRango(50, 100);
            lista2.add(valoresArray);
        }

        System.out.println("*****IMPRIMO LAS DOS LISTAS***************");
        System.out.println("Imprimo la lista 1");
        lista1.forEach(System.out::println);
        System.out.println("***************************************************");
        System.out.println("Imprimo la lista 2");
        lista2.forEach(System.out::println);

        System.out.println("*************************************************");
        for (int i = 0; i < lista1.size(); i++) {
            lista3.add(lista1.get(i));

        }


            for (Integer integer : lista2) {
            if(!lista3.contains(integer)){
            lista3.add(integer);
            }
        }
     
            


        System.out.println( "Imprimo la lista 3 con los valores de lista 1 y lista 2 sin que se repitan");
        lista3.forEach(System.out::println);

        System.out.println(  "********************************************************");

        for (int i = 0; i < lista1.size(); i++) {
            if (lista1.get(i) % 2 == 0) {// elementos pares de lista 1

                lista4.add(lista1.get(i));
            }
        }

        for (int i = 0; i < lista2.size(); i++) {
            if (!(lista2.get(i) % 2 == 0)) {// elementos pares de lista 1

                lista4.add(lista2.get(i));
            }
        }

        System.out.println(
                "Imprimo la lista 4 con valores pares(lista1) y valores impares (lista2)");
        lista4.forEach(System.out::println);

    }

}
