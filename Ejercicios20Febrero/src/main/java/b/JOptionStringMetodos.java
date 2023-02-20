/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b;

import javax.swing.JOptionPane;

/**
 *
 * @author Windows10
 */
public class JOptionStringMetodos {

    /**
     * @param args the command line arguments
     */
    
    public static int indiceString(String aux, char busqueda){
    int posicion =0;
    
 posicion=   aux.indexOf(aux,busqueda);
    return posicion;
    
    }
    
    public static void main(String[] args) {
       String frase=JOptionPane.showInputDialog("Introduce una frase cualquiera");
       
       
       
        System.out.println(frase);
        
        System.out.println(indiceString(frase, 'a'));
    }
    
}
