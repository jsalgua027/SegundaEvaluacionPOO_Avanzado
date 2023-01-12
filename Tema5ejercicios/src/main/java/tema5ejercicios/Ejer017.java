/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Ejer017 {

    /**
     * @param args the command line arguments
     * 
     * 
     * Implementa un programa que lea un String, 
     * lo pase a minúscula, lo introduzca en un array de caracteres y ordene dicho array siguiendo el orden Unicode (a<b<c<d...).

     * 
     * 
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la palabra o la frase");
        String palabraFrase= teclado.nextLine();
        palabraFrase.toLowerCase();
        palabraFrase.replace(" ", "");
        ArrayList<String> resultado=new ArrayList<>();
        


       

        for (int i = 0; i < palabraFrase.length(); i++) {
            for (int j = 0+1; j < palabraFrase.length(); j++) {
                resultado.add(palabraFrase.substring(i, i));
            }
            
        }
        Collections.sort(resultado);

        
        
        System.out.println("La palabra o frase a ordenar es: "+ palabraFrase);
        System.out.println(" ");
        
       
        
        
    }
    

}
