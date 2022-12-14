/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplos_vico_busqueda;

/**
 *
 * @author nacho
 */
public class Ejemplos {

    /**
     * @param args the command line arguments
     */
    public static int busquedaSecuencia(int[] origen, int numBuscar) {
        int indice = -1;

        for (int i = 0; i < origen.length; i++) {
            if (numBuscar == origen[i]) {
                indice = i;
                break;
            }
        }

        return indice;

    }

    public static void main(String[] args) {
        // inicializacion con valores

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        // puedo recorrer cualquier elemento entero del rango 0 y numero.length-1
        System.out.println("El elemento del indice cinco: " + numeros[5]);

        System.out.println("");

        System.out.println("Tamaño del array numeros: " + numeros.length);

        // imprimimos por consola todos los elementos del array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(" - " + numeros[i]);
        }
        System.out.println(" ");
        System.out.println("*****************************************************");
        //foreach
        // la parte izquierda recibe el dato en cuestión . dercha estructura de datos
        for (int aux : numeros) {
            System.out.print(" - " + aux);
            System.out.println("en la p");

        }
        System.out.println(" ");
        System.out.println("Modifico el valor de la posicion 5");
        System.out.println("en la p");
        numeros[5] = 90;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(" - " + numeros[i]);
        }

    }

}
