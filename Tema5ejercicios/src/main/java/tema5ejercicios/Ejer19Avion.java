/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5ejercicios;

import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class Ejer19Avion {

    /**
     * @param args the command line arguments
     *
     *
     *
     *
     * Crear un programa que, mediante un menú, permita reservar o cancelar
     * asientos de un avión, así como mostrar qué asientos están ocupados y
     * libres actualmente. El avión tendrá 25 filas de 4 asientos cada una.
     *
     *
     */
    public static void imprimirAvion(char[][] origen) {

        for (char[] row : origen) {
            for (char c : row) {

                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char ocupado = 'x';
        char libre = ' ';
        int numeroPersonas=0;
        String opcion = "";
        String menu = """
                                1.Para reservar  asientos
                                2.Para cancelar asientos
                                3.Para mostrar asientos
                                4.Salir
                             """;
         char[][] asientosAvion = new char [25][4];
        do {
            System.out.println(menu);
            System.out.println("Indique la opcion");
            opcion = teclado.nextLine();

            switch (opcion) {
                case "1" -> {
                    System.out.println("¿Cuantas personas?");
                    numeroPersonas=teclado.nextInt();
                    for (int i = 0; i < numeroPersonas; i++) {
                        
                    }
                }
                case "2" -> {
                }
              
                default -> {
                }

            }

        } while (!opcion.equalsIgnoreCase("4"));

    
//        imprimirAvion(asientosAvion);
    }

}
