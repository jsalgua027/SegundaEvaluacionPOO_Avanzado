/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8_dado;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nacho
 */
public class TestAzar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      List<Azar> objetosAzar = new ArrayList<>();
      
      // como Azar asbtracta no se puede hace new Azar
      
      objetosAzar.add(new Moneda()); // conversion implicita
      objetosAzar.add(new Dado(6)); // conversion implicita
      
      
      
        for (Azar a : objetosAzar) {
            
            System.out.println("Lanzamiento "+ a.lanzar());
            // variable eres un dado
            if(a instanceof Dado){
            ((Dado)a).metodoDado();// conversion explicita
            
            }
            
        }
      
      
      
    }

}
