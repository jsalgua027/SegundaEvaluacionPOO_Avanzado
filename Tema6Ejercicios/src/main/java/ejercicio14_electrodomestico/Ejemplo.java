/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14_electrodomestico;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nacho
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      List <Silencioso> listaSilencioso = new ArrayList<>();
      
      listaSilencioso.add(new Microondas(300, 40, "jjjjj"));
      listaSilencioso.add(new Frigorifico(3, 200, "oppppp"));
      
      
      // no puedo crer una campana extractora por que no implementa la interface Silenciosos
      
      
      
    }
    
}
