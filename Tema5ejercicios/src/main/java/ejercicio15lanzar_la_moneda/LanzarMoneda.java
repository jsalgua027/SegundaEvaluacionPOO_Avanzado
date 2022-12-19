/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15lanzar_la_moneda;

import java.util.Random;
import static tema5ejercicios.Ejer015_Lanzar_la_moneda.aleatorioDentroRango;

/**
 *
 * @author nacho
 */
public class LanzarMoneda {
    
   
        boolean[] monedas;
          private static Random aleatorio= new Random();

    public LanzarMoneda( int tamanio) {
    //    this.monedas rellenarArray(tamanio);
    }
        
        
          public static void rellenarArray(int tamanio) {
        boolean cara = true;//cara
        boolean cruz = false;// cruz
        boolean[] a = new boolean[tamanio];
        for (int i = 0; i < a.length; i++) {
                int numero=aleatorioDentroRango(1, 2);
          if(numero==1){
           a[i]=cara;
          }else if (numero==2){
          a[i]=cruz;
          
          }
        }

    }

    public static int contadorCaras(boolean[] a) {
        int contador = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]) {
                contador++;
            }
        }

        return contador;
    }
    
    
     public static int contadorCruces(boolean[] a) {
        int contador = 0;
        for (int i = 0; i < a.length; i++) {
            if (!a[i]) {
                contador++;
            }
        }

        return contador;
    }
    
     public static void imprimir(boolean [] a){
     
         for (int i = 0; i < a.length; i++) {
             System.out.println("En el lanzamiento: "+ (i+1) + " Ha salido: " +a[i]);
         }
     
     }
     
    
}
