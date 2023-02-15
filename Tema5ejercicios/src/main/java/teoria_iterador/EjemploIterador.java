/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoria_iterador;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author nacho
 */
public class EjemploIterador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Set<Integer> conjunto = new HashSet<>();

        conjunto.add(10);
        conjunto.add(30);
        conjunto.add(20);

        for (Integer numerico : conjunto) {
            System.out.println("Elemento " + numerico);
            // esto te da una excepcion por que no puedo borrar de un conjunto de datos si se esta recorriendo el mismo
//            if(numerico==20){
//            conjunto.remove(20);
//            
//            }

        }
        
        // para poder  borrar usamos el objeto iterador para movernos por la lista y poder borrarlo
        Iterator<Integer> it = conjunto.iterator();
        
        while (it.hasNext()) {            
            Integer numerico = it.next();
            if (numerico == 20){
            
            it.remove();
            }
            
        }
        
        conjunto.forEach(System.out::println);
        
        
    }
}
