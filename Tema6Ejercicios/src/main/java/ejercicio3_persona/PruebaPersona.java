/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3_persona;

/**
 *
 * @author Windows10
 */
public class PruebaPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Persona p1 = new Persona("Nacho", "12345F", 23);
    //  Empleado e1 = new Empleado(1200, "Pepe", "345L", 25);
      Programador pro1 = new Programador(CategoriaProgamador.JUNIOR, 3500, "Ana", "1111H", 18);
      // desde la clase programador puedo acceder al metodo subir salario
      pro1.aumentarSalario(1000);
      // desde la clase Persona no puedo acceder a subir salario
      
      
        System.out.println(  p1.toString());
    //    System.out.println(  e1.toString());
        System.out.println(  pro1.toString());
      
    }
    
}
