/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5ejercicios;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import static tema5ejercicios.Ejer015_Lanzar_la_moneda.contadorCaras;
import static tema5ejercicios.Ejer015_Lanzar_la_moneda.contadorCruces;
import static tema5ejercicios.Ejer015_Lanzar_la_moneda.imprimir;
import static tema5ejercicios.Ejer015_Lanzar_la_moneda.rellenarArray;

/**
 *
 * @author nacho
 */
public class Ejer16 {

    /**
     * @param args the command line arguments
     */
    
     private static Random aleatorio= new Random();
    private static Scanner teclado = new Scanner(System.in);
    
    
     public static int leerEnteroSinErroresScanner() {
        int num = 0;
        boolean repetir = true;

        do {
            System.out.println("Introduce el numero de tiradas");
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
        public static int aleatorioDentroRango(int min, int max) {
        int numeroGenerado;

        numeroGenerado = aleatorio.nextInt(max - min + 1) + min;

        return numeroGenerado;

    }
    
    public static void rellenarArray(boolean[] a) {
        boolean cara = true;//cara
        boolean cruz = false;// cruz
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
    
     public static int solicitarLanzamientos(){
     int lanzamientos=0;
     
       
         lanzamientos=leerEnteroSinErroresScanner();
         return lanzamientos;
     } 
    
    public static void main(String[] args) {
            int tamanio = solicitarLanzamientos();
        boolean[] monedas = new boolean[tamanio];

        rellenarArray(monedas);
        imprimir(monedas);
        
        System.out.println("");
        System.out.println("*******************contadores: *****************************");
        int contadorCaras= contadorCaras(monedas);
        System.out.println("El array tiene: "+ contadorCaras+ " caras");
        
        int contadorCruces = contadorCruces(monedas);
        System.out.println("El array tiene: " +contadorCruces+ " cruces");
    }
    
}
