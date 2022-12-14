/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplos_vico_clase;

import java.time.LocalDate;

/**
 *
 * @author nacho
 * 
 * 
 * 
 * 
 * 
 */
public class AlquilerVehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        CatalogoVehiculos cv = new CatalogoVehiculos(5);
        CatalogoClientes cc = new CatalogoClientes(5);
        Cliente c = cc.buscarCliente("3");
        Vehiculo v = cv.buscarVehiculo("4");
        
        Cliente c1 = new Cliente();
        Vehiculo v2 = new Vehiculo();
        Alquiler alq2 = new Alquiler(c, v, LocalDate.now(), 8);
        System.out.println(alq2);
        
        CatalogoAlquileres ca = new CatalogoAlquileres(10);
        ca.añadirAlquiler(alq2);
        System.out.println("Lista alquileres");
        System.out.println(ca);
    }
    
}
