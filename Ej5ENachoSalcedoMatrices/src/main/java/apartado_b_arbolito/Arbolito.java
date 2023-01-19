/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apartado_b_arbolito;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class Arbolito {

    /**
     * @param args the command line arguments
     */
//        *                       fila 0 espacios 7
//      ***                      fila 1 espacios 6
//     *****                    fila 2 espacios 5
//    *******                  fila 3 espacios 4
//   *********                fila 5 espacios 3
//  ***********              fila 6 espacios 2
// *************            fila 7 espacios 1
//***************          fila 8 espacios 0
//          *                     fila 9 espacios 7
//          *                     fila 10 espacios 7
    private static Scanner teclado = new Scanner(System.in);

    public static int leerEnteroSinErroresScanner() {
        int num = 0;
        boolean repetir = true;

        do {
            System.out.println("Introduce la altura del arbol, Recuerda que es entre 2 y 10");
            try {

                num = teclado.nextInt();
                repetir = false;

            } catch (InputMismatchException ime) {
                System.out.println("No has introducido un numero entero");
                //limpio buffer
                teclado.nextLine();
            }

        } while (repetir);

        return num;
    }

    public static void imprimirMatriz(char[][] origen) {

        for (int i = 0; i < origen.length; i++) {
            for (int j = 0; j < origen[i].length; j++) {
                System.out.print(origen[i][j]);
            }
            System.out.println("");
        }
    }

    public static int numeroColumnas(int numero) {
        int numeroColumnas = 1;
        for (int i = 0; i < numero - 1; i++) {
            numeroColumnas = numeroColumnas + 2;
        }
        return numeroColumnas;

    }

    public static char[][] arbolNavideño(int altura) {
        int numeroFilas = altura + 2; //obtengo el numero filas
        int derecha = altura - 1;
        int izquierda = altura - 1;
        int numeroColumnas = numeroColumnas(altura); // obtengo numero columnas
        char[][] arbol = new char[numeroFilas][numeroColumnas];
        char libre = ' ';
        char relleno = '1';
        char tronco='*';
        //bucle de todas las filas
        for (int i = 0; i < arbol.length; i++) {
            //bucle  de todas las columnas de la copa
            for (int j = 0; j < arbol[i].length; j++) {

                if (j >= izquierda && j <= derecha) {
                    arbol[i][j] = relleno;

                } else {
                    arbol[i][j] = libre;
                }
            }
            izquierda -= 1;
            derecha += 1;
            // condicion para entrar en las filas del tronco
            if (i >= altura) {
                derecha = altura - 1;
                izquierda = altura - 1;
                //bucle para las columnas del tonco
                for (int j = 0; j < arbol[i].length; j++) {

                    if (j >= izquierda && j <= derecha) {
                        arbol[i][j] = tronco;

                    } else {
                        arbol[i][j] = libre;
                    }

                }

            }

        }
        return arbol;
    }

    public static void main(String[] args) {

        int altura = 0;
        do {
            altura = leerEnteroSinErroresScanner();
           
        } while (!(altura>=2&&altura<=10));
         char[][] arbol = arbolNavideño(altura);
            System.out.println("");
            imprimirMatriz(arbol);
    }

}
