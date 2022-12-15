/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresa_catalogos;

import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class MenuEmpresa {

    /**
     * @param args the command line arguments
     */
    

     
      
    
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        String opcion="";
         String menu="""
                                    ************RENTACAR***********
                                    
                                    1-Para añadir nuevo Cliente
                                    2-Para anadir nuevo Vehiculo
                                    3-Para registrar nuevo alquiler
                                    4-salir
                     
                                    **********************************
                                 """;
          Empresa rentAcar = new Empresa("RENTCAR");
        do {      
                System.out.println(menu);
                System.out.println("Introduzca una opción: ");
                opcion=teclado.nextLine();
            
                switch (opcion) {
                case "1":
                            rentAcar.registarCliente();
                    break;
                      case "2":
                    
                    break;
                      case "3":
                    
                    break;
                default:
                 
            }
                
            
            
        } while (!opcion.equalsIgnoreCase("4"));
         
         
         
        
        
    }
    
}
