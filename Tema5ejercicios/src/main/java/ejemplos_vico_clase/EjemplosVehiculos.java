/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplos_vico_clase;

/**
 *
 * @author nacho
 */
public class EjemplosVehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CatalogoVehiculos catalogo = new CatalogoVehiculos(10);

        catalogo.mostrarCatalogo();

        //Vehiculo[ ] array= catalogo.getListaVehiculos();
        //array[0].setBastidor("123A");
        catalogo.getListaVehiculos()[0].setBastidor("123A");

        System.out.println("------------------------------------------------------");
        catalogo.mostrarCatalogo();

        Vehiculo v = new Vehiculo();
        v.setBastidor("123A");
        System.out.println(v);
        int posicion = catalogo.buscarVehiculo(v);
        System.out.println("La posicio de v es: " + posicion);
        
        // borramos 
        catalogo.borrarVehiculo(catalogo.getListaVehiculos()[4]);
        
        System.out.println("***************despues de borrar****************");
        
        catalogo.mostrarCatalogo();

    }

}
