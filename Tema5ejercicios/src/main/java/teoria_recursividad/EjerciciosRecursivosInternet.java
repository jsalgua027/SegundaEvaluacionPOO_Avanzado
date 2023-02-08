/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoria_recursividad;

import javax.sound.midi.Soundbank;

/**
 *
 * @author Windows10
 */
public class EjerciciosRecursivosInternet {

    /**
     * @param args the command line arguments
     */
    //Sumar los números números naturales hasta N (se lo damos nosotros) de forma recursiva.
    public static int sumaRecursiva(int numero) {

        int res;

        if (numero == 1) {
            //Se termina la recursion
            return 1;
        } else {
            //Se llama a si misma la función con el parametro numero menos 1
            res = numero + sumaRecursiva(numero - 1);
        }

        //Devuelve el resultado
        return res;
    }

    //. Recorrer un array de forma recursiva.
    public static void mostrarArrayRecursivo(int[] array, int indice) {

        /*1º forma*/
 /*
        if (indice == (array.length-1)){
           System.out.println(array[indice]);
        }else{
            System.out.println(array[indice]);
            mostrarArrayRecursivo(array, indice+1);
        }
         */
 /*2º forma*/
        if (indice != array.length) {
            //Mostramos el valor en ese indice
            System.out.println(array[indice]);
            //Llamamos recursivamente a la función
            mostrarArrayRecursivo(array, indice + 1);
        }

    }
// Buscar un elemento de un array de forma recursiva.
 public static int posicionElementoRecursivo(int[] array, int elementoBuscar ,int indice){
         
       if(indice==array.length || array[indice]==elementoBuscar){
             
            if(indice==array.length){
               return -1; 
            }else{
                return indice;
            }
             
        }else{
            return posicionElementoRecursivo(array, elementoBuscar, indice+1);
        }
 }

public static void main(String[] args) {
       int resultado= sumaRecursiva(10);
       
        System.out.println("Suma recursiva de: " + resultado);
        
        int[] array={1,2,3,4,5}; //Creamos un array
        mostrarArrayRecursivo(array, 0); //Pasamos el array y la posicion donde empieza
         int elementoBuscar=3;
        int posElementoEncontrado=posicionElementoRecursivo(array, elementoBuscar,0);
        System.out.println("El elemnto a buscar  es:");
        System.out.println(posElementoEncontrado);
         
        
        
    }
    
}
