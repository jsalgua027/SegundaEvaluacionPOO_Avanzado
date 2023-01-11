/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5ejercicios;

/**
 *
 * @author Windows10
 */
public class Ejer12 {

    /**
     * @param args the command line arguments
     * 
     * Declara e inicializa una matriz de caracteres de 2x3, con los valores que tú quieras.
     * Implementa un método, en la misma clase que el método main()
     * , que reciba una matriz de caracteres y la imprima por consola.

     */
    public static void main(String[] args) {
        
     //   char [][] carateres= new char[2][3];
        
      char [][]  carateres ={{'a','e','i'},{'B','C','D'}};
      
        for (int i = 0; i < carateres.length; i++) {
            for (int j = 0; j < carateres[i].length; j++) {
                System.out.println("el carater [" + i+ "] [" +j+ "] "+ "es "+ carateres[i][j]);
            }
            
        }
    }
    
}
