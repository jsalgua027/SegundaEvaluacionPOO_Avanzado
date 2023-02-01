/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoria_ejemplovico_map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author nacho
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Map<String , Integer> nombreEdades = new HashMap<>();
        
        
        nombreEdades.put("vico", 25);
        nombreEdades.put("vico", 55);
        nombreEdades.put("Lucas", 25);
   
        
        System.out.println("El numero de elementos map " + nombreEdades.size());
        
        for (Map.Entry<String, Integer> filaMap : nombreEdades.entrySet()) {
            String key = filaMap.getKey();
            Integer  val = filaMap.getValue();
            System.out.println("key: " + key + "-- value: "+val);
        }
        
        
        // obtengo las claves
        
        System.out.println("Conjunto de claves únicas------------");
        
        for (String key : nombreEdades.keySet()) {
            
            System.out.println(key);
        }
        System.out.println("Conjunto de values------------");
        Collection<Integer> coleccionEdades= nombreEdades.values();
        for (Integer edad : coleccionEdades) {
            System.out.println(edad);
        }
        
        List<Integer> listaEdades= new ArrayList<>(nombreEdades.values());
        
        //ejemplo iterador------ esta obsoleto 
        
         Iterator<Integer> iterador= listaEdades.iterator();
          while (iterador.hasNext()) {
            Integer elemento = iterador.next();
            
        }
         
        
       
    }
    
}
