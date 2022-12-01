/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5ejercicios;

import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Ejer02 {

    /**
     * @param args the command line arguments
     *
     *
     * Escribe un programa para leer la altura de un número determinado de
     * personas y calcular la altura media. El número de personas se pide por
     * teclado y debe ser entero un entero mayor que cero. Posteriormente el
     * programa irá pidiendo la altura, en cm, de cada una de las personas y las
     * guardará en una estructura de almacenamiento. Si la altura leída no es
     * positiva, el programa la pasará a número positivo. También es necesario
     * saber cuántas personas tienen una altura superior a la media e inferior a
     * la media.      *
     *
     *
     *
     */
    public static void main(String[] args) {
        
        Scanner teclado= new Scanner(System.in);
      int numeroPersonas=0;
      int alturaPersona=0;
      int  totalAlturas=0;
      int [] alturasDeCadaPersona={};
      int mediaTotal=0;
      int contadorPorEncima=0;
      int contadorPorDebajo=0;
        System.out.println("Indica cuantas personas van a participar");
        numeroPersonas=teclado.nextInt();
        if(numeroPersonas>0){
            for (int i = 0; i < numeroPersonas; i++) {
                System.out.println("Indica la altura de la persona " + i);
                alturaPersona=teclado.nextInt();
                if (alturaPersona<0){
                alturaPersona= Math.abs(alturaPersona);
                    alturasDeCadaPersona[i]=alturaPersona;
                totalAlturas+=alturaPersona;
            
                }
            }
         mediaTotal=totalAlturas/numeroPersonas;
        }else{
            System.out.println("El numero de personas es erroneo");
        
        }
      
        for (int i = 0; i < alturasDeCadaPersona.length; i++) {
            
            if (alturasDeCadaPersona[i]>mediaTotal){
              contadorPorEncima++;
            }else{
            contadorPorDebajo++;
            }
            
            
        }
      
        
      
    }

}
