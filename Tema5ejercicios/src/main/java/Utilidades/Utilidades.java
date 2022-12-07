/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author Windows10
 */
public class Utilidades {

    private static Scanner teclado = new Scanner(System.in);
    private static Random numAle = new Random();

    // LEER DATOS VIA ESCANER******************************************
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
            System.out.println("Introduce el numero entero");
            try {

                num = teclado.nextDouble();
                repetir = false;

            } catch (InputMismatchException ime) {
                System.out.println("No has introducido un numero entero");
                //limpio buffer
                teclado.nextLine();
            }

        } while (repetir);

        return num;
    }

    //LEER DATOS VIA JOPTIONPANEL
    //leer enteros y decimales con JOptionPane (NUMBERFORMATEXCEPTION)
    public static int leerNumeroEnteroSinErroresJOptionPane() {

        boolean repetir = true;
        int numero = 0;  // -1; // Edad no válida

        do {
            String tmp = JOptionPane.showInputDialog("Introduce el número: ");
            try {
                numero = Integer.parseInt(tmp);
                repetir = false;
            } catch (NumberFormatException nfe) {
                JOptionPane.showConfirmDialog(null, "No has introducido un número entero.");
            }
        } while (repetir);

        return numero;
    }

    public static double leerNumeroDecimalesSinErroresJOptionPane() {

        boolean repetir = true;
        double numero = 0;  // -1; // Edad no válida

        do {
            String tmp = JOptionPane.showInputDialog("Introduce el número: ");
            try {
                numero = Double.parseDouble(tmp);
                repetir = false;
            } catch (NumberFormatException nfe) {
                JOptionPane.showConfirmDialog(null, "No has introducido un número entero.");
            }
        } while (repetir);

        return numero;
    }

    // INT DIVIDIOS ENTRE CERO
    // dividir enteros, si divides entre cero te da el error (ARITHMETICEXCEPTION)
    private static int dividirExcepcion(int numerador, int denominador) {
        int resultado;
        // El código susceptible de provocar la excepción se engloba en el 
        // bloque try{}
        try {
            resultado = numerador / denominador;
        } catch (ArithmeticException ae) {
            resultado = numerador;
            System.out.println("Error. Se ha intentado dividir por cero.");
        }

        return resultado;
    }

    // numero aleatorio dentro de un rango
    public static int aleatorioDentroRango(int min, int max) {
        int numeroGenerado;

        numeroGenerado = numAle.nextInt(max - min + 1) + min;

        return numeroGenerado;

    }

    //USO DE RANDOMSTRINGUTILS***********************************
    // introduzco el número de digitos aleatorios que quiero sacar (saca números) ejemplo código pin
    public static String numerosAleatoiosDandoCantidadDigitos(int numeroDigitos) {
        String aleatorio = "";

        aleatorio = RandomStringUtils.randomNumeric(numeroDigitos);

        return aleatorio;
    }

    // introduzco el número de digitos aleatorios que quiero sacar (saca números y caracteres) ejemplo password.
    public static String numerosYCaracteresAleatoiosDandoCantidadDigitos(int numeroDigitos) {
        String aleatorio = "";

        aleatorio = RandomStringUtils.randomAlphanumeric(numeroDigitos);

        return aleatorio;
    }

    // recibe un array de char , le damos la cantidad de caracteres que quieres sacar de ese char
    public static String generadorSecuencia(char[] arrayAux, int cantidadCaracteres) {
        String aux = "";

        aux = RandomStringUtils.random(cantidadCaracteres, arrayAux);

        return aux;
    }

    //************************************************METODOS ARRAYS**********************************************************
    // imprimir diferentes tipos de arrays
    public static void mostrarArray(char[] origen) {
        for (int i = 0; i < origen.length; i++) {
            System.out.print(" - " + origen[i]);
        }
    }

    public static void mostrarArray(int[] origen) {
        for (int i = 0; i < origen.length; i++) {
            System.out.print(" - " + origen[i]);
        }
    }

    public static void mostrarArray(double[] origen) {
        for (int i = 0; i < origen.length; i++) {
            System.out.print(" - " + origen[i]);
        }
    }

    public static void mostrarArray(String[] origen) {
        for (int i = 0; i < origen.length; i++) {
            System.out.print(" - " + origen[i]);
        }
    }

    // ************************************************lecturas de medias aritmeticas*********************************************
    //método que devulve los que están por encima valores enteros*******
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

    //contadores de valores positivos, negativos y ceros**********
    public static int arrayPositivos(int[] origen) {
        int contador = 0;
        for (int i = 0; i < origen.length; i++) {
            if (origen[i] > 0) {
                contador++;
            }
        }

        return contador;

    }

    //cantidad de negativos
    public static int arrayNegativos(int[] origen) {
        int contador = 0;
        for (int i = 0; i < origen.length; i++) {
            if (origen[i] < 0) {
                contador++;
            }
        }

        return contador;

    }
    // cantidad de ceros

    public static int arrayCeros(int[] origen) {
        int contador = 0;
        for (int i = 0; i < origen.length; i++) {
            if (origen[i] == 0) {
                contador++;
            }
        }

        return contador;

    }

    // multiplico dos arrays de enteros
    public static int[] multiplicar(int[] array1, int[] array2) {
        int[] resultado = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            resultado[i] = array1[i] * array2[i];
        }

        return resultado;

    }

    // método para comprobar si contiene un valor 
    public static boolean comprobarSiContiene(int[] origen, int indice, int valor) {
        for (int i = 0; i < indice; i++) {
            if (origen[i] == valor) {
                return true;
            }
        }
        return false;
    }

    // Generar arrays******************************************************** 
    // almaceno datos en el array leyendo los datos con el metodo de leeEnterosSinErroresScanner()
    public static void almacenarArray(int[] origen) {
        for (int i = 0; i < origen.length; i++) {
            origen[i] = leerEnteroSinErroresScanner();
        }

    }

    //genero array con valores aleatorios paso por parametro el tamaño del array y el rango de valores
    public static int[] generoArrayEnterosValoresRandom(int tamanio, int rangoMax, int rangoMin) {
        int[] aux = new int[tamanio];
        for (int i = 0; i < aux.length; i++) {
            aux[i] = numAle.nextInt(rangoMax - rangoMin + 1) + rangoMin;
        }
        return aux;
    }

}
