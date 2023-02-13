/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ventanaAbstracta;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author nacho
 */
public class TestAbstra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Ventana v1 = new VAbatible(90, true);
        Ventana v2 = new VCorredera(50, true);
        
        
        Set<Ventana> conjuntoVentanas =new HashSet<>();
        
        conjuntoVentanas.add(v1);
        conjuntoVentanas.add(v2);
        
        for (Ventana v : conjuntoVentanas) {
            v.abrir(100);
        }
        
        
    }
    
}
