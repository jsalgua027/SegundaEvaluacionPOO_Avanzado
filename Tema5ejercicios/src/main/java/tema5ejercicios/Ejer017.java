/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Ejer017 {

    /**
     * @param args the command line arguments
     *
     *
     * Implementa un programa que lea un String, lo pase a minúscula, lo
     * introduzca en un array de caracteres y ordene dicho array siguiendo el
     * orden Unicode (a<b<c<d...).
     *
     *
     *
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la palabra o la frase");
        String palabraFrase = teclado.nextLine();
        // convierto el String en minusculas
        String pMinusculas = palabraFrase.toLowerCase();
        // si es una frase junto todos los carateres 
        pMinusculas = pMinusculas.replace(" ", "");

        System.out.println("La palabra o frase a ordenar es: " + pMinusculas);
        //trasformo el String en array de chars para poder usar el metodo Arrays.sort
        char aux[] = pMinusculas.toCharArray();
        // ordeno de forma natural el array
        Arrays.sort(aux);

        System.out.println(aux);

    }

}
