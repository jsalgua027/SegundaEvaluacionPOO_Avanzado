/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Ejer02 {

    /**
     * @param args the command line arguments
     *
     *
     * Escribe un programa para leer la altura de un número determinado de
     * personas y calcular la altura media. El número de personas se pide por
     * teclado y debe ser entero un entero mayor que cero. Posteriormente el
     * programa irá pidiendo la altura, en cm, de cada una de las personas y las
     * guardará en una estructura de almacenamiento. Si la altura leída no es
     * positiva, el programa la pasará a número positivo. También es necesario
     * saber cuántas personas tienen una altura superior a la media e inferior a
     * la media. *
     *
     *
     *
     */
    private static Scanner teclado = new Scanner(System.in);

    public static int leerEnteroSinErroresScanner() {
        int num = 0;
        boolean repetir = true;

        do {
            do {

                System.out.println("Introduce el numero entero");
                try {

                    num = teclado.nextInt();
                    repetir = false;

                } catch (InputMismatchException ime) {
                    System.out.println("No has introducido un numero entero");
                    //limpio buffer
                    teclado.nextLine();
                }
            } while (num <= 0);

        } while (repetir);

        return num;
    }

    public static double leerDecimalesSinErroresScanner() {
        double num = 0.0;
        boolean repetir = true;

        do {
            do {
                System.out.println("Introduce el numero entero");
                try {

                    num = teclado.nextDouble();
                    repetir = false;

                } catch (InputMismatchException ime) {
                    System.out.println("No has introducido un numero entero");
                    //limpio buffer
                    teclado.nextLine();
                }
            } while (num <= 0);

        } while (repetir);

        return num;
    }
    
    //método que devulve los que están por encima

    public static int estaPorEncima(int[] aux, int media) {
        int contador = 0;
        for (int i = 0; i < aux.length; i++) {

            if (aux[i] > media) {
                contador++;

            }

        }
        return contador;
    }

    public static int estaPorDebajo(int[] aux, int media) {
        int contador = 0;

        for (int altura : aux) {

            if (altura < media) {
                contador++;

            }

        }

        return contador;
    }

    public static int[] media(int[] origen, int media) {

        int[] aux = new int[2];

        aux[0] = estaPorEncima(origen, media);
        aux[1] = estaPorDebajo(origen, media);

        return aux;

    }
    
    

    public static void main(String[] args) {

        int numeroPersonas = 0; // para saber el tamaño del array 

        int totalAlturas = 0; // para poder hacer los calculos de la media 

        int mediaTotal = 0;
        int contadorPorEncima = 0; // contadores
        int contadorPorDebajo = 0;

        System.out.println("Indica cuantas personas van a participar");
        numeroPersonas = leerEnteroSinErroresScanner();
        // inicializo el array cone l tipo de valor y con el tamaño de numero de personas
        int[] alturasDeCadaPersona = new int[numeroPersonas];
        //bucle del tamaño del array para asignar valores(AlturasDeCadaPersona)
        for (int i = 0; i < numeroPersonas; i++) {
            System.out.println("Indica la altura de la persona " + (i + 1));
            alturasDeCadaPersona[i] = leerEnteroSinErroresScanner();
            // sumo los valores por cada repetición del bucle
            totalAlturas += alturasDeCadaPersona[i];

        }
        // obtengo la media
        mediaTotal = totalAlturas / numeroPersonas;
        System.out.println("La media es: " + mediaTotal);
        System.out.println(" ");

        System.out.println("Las alturas indicadas por persona son: ");

        for (int i = 0; i < alturasDeCadaPersona.length; i++) {
            System.out.println("la persona " + (i + 1) + " tiene una altura de: " + alturasDeCadaPersona[i]);
        }
        // bucle for para recorrer las alturas y mirar cual esta por encima de la media o por debajo.
        for (int i = 0; i < alturasDeCadaPersona.length; i++) {

            if (alturasDeCadaPersona[i] > mediaTotal) {
                contadorPorEncima++;
            } else {
                contadorPorDebajo++;
            }

        }
        // imprimo los contadores
        System.out.println(" las personas por encima de la media son: " + estaPorEncima(alturasDeCadaPersona, mediaTotal));
        System.out.println(" las personas por debajo de la media son: " + estaPorDebajo(alturasDeCadaPersona, mediaTotal));

    }
    

}
