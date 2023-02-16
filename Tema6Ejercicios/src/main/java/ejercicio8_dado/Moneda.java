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
public class Moneda extends Azar {
    
    private  String  tipo;  // tipo de moneda
    
      private static Random aleRandom = new Random();

    public Moneda() {
    }

    public Moneda(String tipo) {
        super(2);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Moneda{");
        sb.append("tipo=").append(tipo);
        sb.append('}');
        return sb.toString();
    }

    

   

    @Override
    public int lanzar() {
        int numero = aleRandom.nextInt(1, 3);
        
        return numero;
    }
      
      
      
    
    
    
}
