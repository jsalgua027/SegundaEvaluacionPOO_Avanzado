/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5ejercicios;



/**
 *
 * @author nacho
 */
public class Ejer01 {

    /**
     * @param args the command line arguments
     * 
     * 
     * Escribe un programa que muestre cada elemento de un array de enteros 
     * y sume todos sus elementos. Instancia e inicializa el array en el programa, 
     * sin leer nada por teclado, con los siguientes valores {1, 2, 3, 4, 5, 6}.

     * 
     * 
     */
    public static void main(String[] args) {
        int [] numeros={1,2,3,4,5,6};
        int sumaNumeros=0;   
      
        for (int i = 0; i < numeros.length; i++) {
            sumaNumeros+= numeros[i];
        }
        
        System.out.println("La suma de todos los numeros del array es : " + sumaNumeros);
        
    }
    
}
