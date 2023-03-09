/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RepasoListas;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author nacho
 */
public class TestSilla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map <Silla, Double> aux = new TreeMap<>();
        
        Silla s1 = new Silla(12, "Ana");
        Silla s2 = new Silla(10, "Pepe");
        Silla s3 = new Silla(1, "Nacho");
        Silla s4 = new Silla(3, "Lucas");
        Silla s5 = new Silla(8, "Iñigo");
        Silla s6 = new Silla(3, "Lucas");
        Silla s7 = new Silla(6, "Eva");
        
        
      aux.put(s1, s1.getPeso());
      aux.put(s2, s2.getPeso());
      aux.put(s3, s3.getPeso());
      aux.put(s4, s4.getPeso());
      aux.put(s5, s5.getPeso());
      aux.put(s6, s6.getPeso());
      aux.put(s7, s7.getPeso());

        
        for (Silla s : aux.keySet()) {
            System.out.println(s);
        }
  
        for (Double p : aux.values()) {
            System.out.println(p);
        }
      
      
        
        
    }
    
}
