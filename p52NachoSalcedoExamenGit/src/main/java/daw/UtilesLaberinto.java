/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.Random;

/**
 *
 * @author nacho
 */
public class UtilesLaberinto {
    
     private static Random ale = new Random();

    // lanzo la excepción  y genero la matriz de caracteres usando el metedo letras aleatorias
    
    public static Character[][] generadorLaberinto(int n) {

        if (n < 3 || n > 10) {
            throw new IllegalArgumentException();

        }
        Character aux[][] = new Character[n][n];
        for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux[i].length; j++) {

                aux[i][j] = letrasAleatorias();

            }
        }
        return aux;
    }

    // divide y venceras!!!! 
    public static char letrasAleatorias() {
            boolean aleatorio= ale.nextBoolean();
            
            return aleatorio?'b':'c';
//        int numAleatorio = ale.nextInt(1, 3);
//        char letra = '.';
//        switch (numAleatorio) {
//            case 1 -> {
//                letra = 'b';
//            }
//
//            case 2 -> {
//                letra = 'c';
//            }
//            default -> {
//            }
//
//        }
//
//        return letra;
    }

    public static void imprimirMatirz(Character[][] aux) {

        for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux[i].length; j++) {
                System.out.print(" "+"(" +i+","+j+")"+ aux[i][j]);
            }
            System.out.println(" ");
        }

    }

    //Metodo solicitado en el apartado B
    
    public static Casilla[][] generadorLaberintoCasillas(Character[][] aux) {
        int numero = aux.length;

        Casilla[][] matriz = new Casilla[numero][numero];

        for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux[i].length; j++) {
                if (aux[i][j] == 'c') {
                        // Creo un objeto casilla dependiendo del caracter de la matriz aux
                    matriz[i][j] = new Casilla(i, j, TipoCasilla.CAMINO);
                }
            
             else{

                      matriz[i][j] = new Casilla(i, j, TipoCasilla.BOSQUE);

                }

            }
        }
        return matriz;
    }

      public static void imprimirMatirzCasillas(Casilla[][] aux) {

        for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux[i].length; j++) {
                System.out.print(" "+"(" +i+","+j+")"+ aux[i][j].toString2());
            }
            System.out.println(" ");
        }

    }
    
    
}
