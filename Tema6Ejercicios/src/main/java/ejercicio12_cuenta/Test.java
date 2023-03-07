/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12_cuenta;

/**
 *
 * @author Windows10
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona p1 = new Persona("Nacho", "Salcedo", "1234L");
        Persona p2 = new Persona("Pepe", "Perez", "5678L");
        
        
       Cuenta c1 = new CuentaAhorro(1.5, 100, p1);
       Cuenta c2 = new CuentaCorriente(100, p2);
       
       
       
        System.out.println(c1.toString()); 
        System.out.println(c2.toString()); 
    }
    
}
