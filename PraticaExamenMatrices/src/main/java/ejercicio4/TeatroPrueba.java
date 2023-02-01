/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author Windows10
 */
public class TeatroPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Teatro falla = new Teatro(4, 7);
      falla.imprimirTeatro();
      
      falla.reservar(1, 1);
        System.out.println("*************");
      falla.imprimirTeatro();
      
      falla.cancelar(1, 2);
    }
    
}
