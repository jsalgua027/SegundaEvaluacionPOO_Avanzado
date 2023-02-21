/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package a;

import javax.swing.JOptionPane;

/**
 *
 * @author Windows10
 */

  


public class ArrayRecursivo {
  public static int leerNumeroEnteroSinErroresJOptionPane() {

        boolean repetir = true;
        int numero = 0;  // -1; // Edad no válida

        do {
            String tmp = JOptionPane.showInputDialog("Introduce el número: ");
            try {
                numero = Integer.parseInt(tmp);
                repetir = false;
            } catch (NumberFormatException nfe) {
                JOptionPane.showInputDialog(null, "No has introducido un número entero.");
            }
        } while (repetir);

        return numero;
    }
  
//  public static char[] capicuaRecusrivo(char[]aux, int longitud){
//   
//      if (longitud==0){
//      return 
//      
//      }
//  return .
//  
 // }
  
  
  
    public static void main(String[] args) {
       
        int numero= leerNumeroEnteroSinErroresJOptionPane();
        //trasformo el int en un String
        String numeroLetra=String.valueOf(numero);
        //trasformo el string en un array de chars
        char[] arrayChar= numeroLetra.toCharArray();
     
        
    }
}
