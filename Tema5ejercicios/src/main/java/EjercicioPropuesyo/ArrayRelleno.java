/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjercicioPropuesyo;

import java.util.Random;

/**
 *
 * @author nacho
 */
public class ArrayRelleno {

    /*
     * 
     * 
     * 
     *  ****************************** otro ejecicio rellenar un array con
     * letras mayusculas array de char[] (25 letras) generamos un array d tamaño
     * aleatorio entre y 25 pero que no se salga del array de char generamos un
     * numero aleatorio para que coja las posiciones del array de char[] y meta
     * el char valido en el nuevo array
     *
     * 
     * 
     *
     */
    static  Random numAle =new Random();
    
     public static void mostrarArray(char[] origen) {
        for (int i = 0; i < origen.length; i++) {
            System.out.print(" - " + origen[i]);
        }
    }
     
      public static void mostrarArray(int [] origen) {
        for (int i = 0; i < origen.length; i++) {
            System.out.print(" - " + origen[i]);
        }
    }
  
     public static int[] generarArray( ){
         int tamanio=numAle.nextInt(25-15+1)+15;
         
         int []aux =new int [tamanio];
     
         return aux;
     }
     
    
    
    
    public static void main(String[] args) {
        
        char[] abecedario=new char[26];
        String resultado=" ";
        for (int i = 0; i < abecedario.length; i++) {
            int numero=numAle.nextInt(90-65+1)+65;
            abecedario[i]=(char)numero;
            
        }
        System.out.println("El array de letras presenta el siguente orden:");
        mostrarArray(abecedario);
        
        
        int[] arrayNumeros= generarArray();
        for (int i = 0; i < arrayNumeros.length; i++) {
            arrayNumeros[i]=numAle.nextInt(26);
            
        }
        System.out.println("");
        System.out.println("El array numerico es:");
        mostrarArray(arrayNumeros);
        
        for (int i = 0; i < arrayNumeros.length; i++) {
            
            resultado+=abecedario[arrayNumeros[i]];
            
        }
        System.out.println("");
        System.out.println("El string resultante es: ");
        System.out.println(resultado);
    }
    
    // queda pendiente hacer que se generen varios string y se metan dentro de otro array
    
}
