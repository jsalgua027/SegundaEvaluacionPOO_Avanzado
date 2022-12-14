/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresa_catalogos;

import java.sql.SQLOutput;

/**
 *
 * @author Windows10
 */
public class EjemploEmpresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empresa rentAcar = new Empresa("RENTCAR");

        System.out.println(rentAcar);
        System.out.println("REGISTRO VEHICULO****************************");
        rentAcar.registarVehiculo();
        System.out.println(rentAcar);
        System.out.println("REGISTRO NUEVO VEHICULO****************");
        rentAcar.registarCliente();
        System.out.println(rentAcar);
        
        System.out.println( "Se encuentra el cliente en la posicion: "+rentAcar.buscarCliente("2")); 
        
         System.out.println( "Se encuentra el vehiculo  en la posicion: "+rentAcar.buscarVehiculo("2"));
        

    }

}
