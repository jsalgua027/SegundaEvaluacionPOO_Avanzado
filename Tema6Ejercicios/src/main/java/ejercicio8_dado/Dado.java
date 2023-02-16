/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8_dado;

import java.util.Random;

/**
 *
 * @author nacho
 */
public class Dado extends Azar {
    
  
   private static Random aleRandom = new Random();
 
 
    public Dado() {
    }

    public Dado(int numCaras) {
        super(6);
      
    }
    
    // un dado  de mas caras
     public Dado(int numCaras, int posibilidades) {
        super(posibilidades);
      
    }
    

   
    
    
    
    
    
    
    

//    @Override
//    public int lanzar() {
//     int numero = aleRandom.nextInt(1, 7);
//        
//        return numero;
//    }
    
    
    // usando el atributo posibilidades 
    
     @Override
    public int lanzar() {
     return new Random().nextInt(1, this.getPosibilidades()+1);
    }
    
    
    public void metodoDado(){
    
        System.out.println("dado");
    }
    
    
}
