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

//      //  catalogo.mostrarCatalogo();
//      
            System.out.println("La cantidad de vehiculos es :"+catalogo.getNumeroVehiculos());
            System.out.println(catalogo);
            
     
      catalogo.borrarVehiculo(catalogo.getListaVehiculos()[3]);
        System.out.println("*******************despues de borrar 3 -----------------");
        System.out.println("La cantidad de vehiculos es :"+catalogo.getNumeroVehiculos());
        System.out.println(catalogo);
        
        Vehiculo aux = new Vehiculo();
        aux.setBastidor("13234563");
        catalogo.añadirVehiculo(aux);
        
        
         System.out.println("*******************despues de añadir-----------------");
        System.out.println("La cantidad de vehiculos es :"+catalogo.getNumeroVehiculos());
        System.out.println(catalogo);
        
        
        aux.setBastidor("999999999");
        catalogo.añadirVehiculo(aux);
        
        
         System.out.println("*******************despues de añadir otro-----------------");
        System.out.println("La cantidad de vehiculos es :"+catalogo.getNumeroVehiculos());
        System.out.println(catalogo);
        
        
        
        CatalogoClientes catalogoClientes = new CatalogoClientes(3);
      // Cliente c1= new Cliente("", nombre, Nombre);
        
        
        
        
        
//        //array[0].setBastidor("123A");
//        catalogo.getListaVehiculos()[0].setBastidor("123A");
//
//        System.out.println("------------------------------------------------------");
//       // catalogo.mostrarCatalogo();
//
//        Vehiculo v = new Vehiculo();
//        v.setBastidor("123A");
//        System.out.println(v);
//        int posicion = catalogo.buscarVehiculo(v);
//        System.out.println("La posicio de v es: " + posicion);
//        
//        // borramos 
//        catalogo.borrarVehiculo(catalogo.getListaVehiculos()[4]);
//        
//        System.out.println("***************despues de borrar****************");
//        
//      //  catalogo.mostrarCatalogo();
    

// 

        
            

    }

}
