/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoria_recursividad;

import java.util.ArrayList;

/**
 *
 * @author nacho
 */
public class Fibobacci {

    /**
     * @param args the command line arguments
     */
    public static int fiboItera(int n) {
        int numero = Math.abs(n);
        int resultado = 0;
        int n1 = 0;
        int n2 = 1;

        for (int i = 0; i < numero; i++) {
            resultado = n1 + n2;
            n2 = n1;
            n1 = resultado;
        }

        return resultado;
    }

    public static int fiboRecut(int n) {

        if (n > 2) {
            return n;

        } else {

            return fiboRecut(n - 1) + fiboRecut(n - 2);
        }

    }

    public static int fibonacciIteractivo(int numero) {
        ArrayList<Integer> fibo = new ArrayList<>();
        for (int i = 0; i <= numero; i++) {

            switch (i) {
                case 0 ->
                    fibo.add(0);
                case 1 ->
                    fibo.add(1);
                default ->
                    fibo.add(fibo.get(i - 1) + fibo.get(i - 2));

            }

        }
        return fibo.get(numero);
    }

    public static int fibonacciRecursivo(int numero) {

        if (numero == 0) {
            return 0;

        }
        if (numero == 1) {
            return 1;

        } else {

            return (fibonacciRecursivo(numero - 1) + fibonacciRecursivo(numero - 2));
        }

    }

    public static void main(String[] args) {
        int resultado = fibonacciIteractivo(6);
        System.out.println("El iteractivo es: " + resultado);

        int resultadoFibo = fibonacciRecursivo(6);

        System.out.println("El recursivo es : " + resultadoFibo);
    }

}
