/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listas;

import java.util.ArrayList;

/**
 *
 * @author nacho
 */
public class ListaNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Integer> listaEnteros = new ArrayList<>();

        listaEnteros.add(10);
        listaEnteros.add(9);
        listaEnteros.add(8);
        listaEnteros.add(7);
        listaEnteros.add(6);
        System.out.println("El tamaño de lista: " + listaEnteros.size());

        for (int i = 0; i < listaEnteros.size(); i++) {
            System.out.println("Elemento " + (i + 1) + " - >" + listaEnteros.get(i));
            System.out.println("Posicion " + (i) + "->" + listaEnteros.get(i));

        }

        if (listaEnteros.contains(7)) {
            System.out.println("El 7 esta en la lista");

        }
        // en que posicion esta el si
        int posicion = listaEnteros.indexOf(6);
        System.out.println("Posicion del 6 esta en:  " + posicion);

        // borrar OJO QUE EL METODO NO DISITINGE ENTRE UN INT DE POSICION O EL INTEGER OBJETO
        // borro el objeto
        Integer numero = 10;

        listaEnteros.remove(numero);

        // muestro 
        listaEnteros.forEach(System.out::println);

        System.out.println("-------------------------");

        // otra forma 
        for (Integer num : listaEnteros) {
            System.out.println(num);
        }

        // para cambiar el valor dando la posicion y el valor 
        listaEnteros.set(0, 200);

        for (Integer num : listaEnteros) {
            System.out.println(num);
        }

    }

}
