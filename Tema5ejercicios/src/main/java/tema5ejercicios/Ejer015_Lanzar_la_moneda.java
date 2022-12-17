/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5ejercicios;

import java.util.Random;

/**
 *
 * @author Windows10
 */
public class Ejer015_Lanzar_la_moneda {

    /**
     * @param args the command line arguments
     *
     * Escribe una clase LanzarMoneda que tenga como único atributo un array de
     * booleanos de tamaño 1000. La clase tendrá los siguientes métodos: un
     * método para rellenar el array, de forma que simule 1000 lanzamientos de
     * una moneda. El método debe almacenar el resultado de cada tirada en el
     * array. un método para saber cuántas “caras” salieron después de los
     * lanzamientos. un método para saber cuántas “cruces” salieron después de
     * los lanzamientos. un método para imprimir el resultado de los 1000
     * lanzamientos, de forma que aparezca el número de lanzamiento y el
     * resultado (cara o cruz)
     *
     */
    private static Random aleatorio= new Random();
    
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
            if (a[i] == true) {
                contador++;
            }
        }

        return contador;
    }
    
    
     public static int contadorCruces(boolean[] a) {
        int contador = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == false) {
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
     

    public static void main(String[] args) {
        int tamanio = 100;
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
