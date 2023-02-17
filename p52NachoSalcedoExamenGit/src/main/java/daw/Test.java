/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw;

/**
 *
 * @author nacho
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 10;
        // recojo la excepción
        try {
               System.out.println("***********Genero la Matrix de Caracteres*****************");
            Character[][] matriz = UtilesLaberinto.generadorLaberinto(numero);
            UtilesLaberinto.imprimirMatirz(matriz);

            System.out.println("***********Genero la Matrix de casillas*****************");

            Casilla[][] casillas = UtilesLaberinto.generadorLaberintoCasillas(matriz);
            UtilesLaberinto.imprimirMatirzCasillas(casillas);

        } catch (IllegalArgumentException iae) {
            // si salta la excepción muestro por pantalla este sout
            System.out.println("El número está fuera del rango indicado");
            
        }

    }
    
}
