/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1;

import daw.Desfibrilador;
import daw.UtilesDesfibrilador;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author nacho
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    
    public static Map<String, Desfibrilador> apartadoA( Desfibrilador[] aux){
        Map<String, Desfibrilador> auxMap = new TreeMap<>();
        
        for (int i = 0; i < aux.length; i++) {
            auxMap.put(aux[i].getId(), aux[i]);
        }
    
        return auxMap;
    }
    
    
//   public static Map<String, Desfibrilador> apartadoB(Desfibrilador[] aux){
//   Map<String, Desfibrilador> auxMap = new TreeMap<>();
//   List<Desfibrilador> listAux = Arrays.asList(aux);
//   Iterator<Desfibrilador> it = listAux.iterator();
//   while (it.hasNext()) {
//       Desfibrilador d = it.next();
//    //auxMap.put(listAux.get(num).getId(), listAux.get(num));
//   
//}
//   
//   }
    
    
    public static void main(String[] args) {
        
        Desfibrilador[] aux = UtilesDesfibrilador.getDesfibriladores();
       
         Map<String, Desfibrilador> auxMap = apartadoA(aux);
         
            for (String key : auxMap.keySet()) {
            System.out.println(key);

        }

        for (Desfibrilador value : auxMap.values()) {
            System.out.println(value);

        }
         
         
         
        
        
    }
    
}
