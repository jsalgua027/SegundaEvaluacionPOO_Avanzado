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

    //    catalogo.mostrarCatalogo();
   
//            System.out.println("La cantidad de vehiculos es :"+catalogo.getNumeroVehiculos());
//            System.out.println(catalogo);
//            
//     
//      catalogo.borrarVehiculo(catalogo.getListaVehiculos()[3]);
//        System.out.println("*******************despues de borrar 3 -----------------");
//        System.out.println("La cantidad de vehiculos es :"+catalogo.getNumeroVehiculos());
//        System.out.println(catalogo);
//        
//        Vehiculo aux = new Vehiculo();
//        aux.setBastidor("13234563");
//        catalogo.añadirVehiculo(aux);
//        
//        
//         System.out.println("*******************despues de añadir-----------------");
//        System.out.println("La cantidad de vehiculos es :"+catalogo.getNumeroVehiculos());
//        System.out.println(catalogo);
//        
//        
//        aux.setBastidor("999999999");
//        catalogo.añadirVehiculo(aux);
//        
//        
//         System.out.println("*******************despues de añadir otro-----------------");
//        System.out.println("La cantidad de vehiculos es :"+catalogo.getNumeroVehiculos());
//        System.out.println(catalogo);
//        
//        
//     
//        
//        
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
//
//// 

           
        CatalogoClientes catalogoClientes = new CatalogoClientes(3);
       Cliente c1= new Cliente("75465464","Nacho","Salcedo");
       Cliente c2= new Cliente("75465464","Pepe","Perez");
       Cliente c3= new Cliente("75465464","Maria","Hernandez");
        catalogoClientes.añadirCliente(c1);
        catalogoClientes.añadirCliente(c2);
        catalogoClientes.añadirCliente(c3);
      
        System.out.println(catalogoClientes);
        System.out.println("La cantidad de clientes es: " + catalogoClientes.getNumeroClientes());
        
        catalogoClientes.borrarCliente(c2);
        
        
        System.out.println("***************************borramos cliente c2******************************");
         System.out.println(catalogoClientes);
        System.out.println("La cantidad de clientes es: " + catalogoClientes.getNumeroClientes());
        
        System.out.println("**********************creo cliente c4  y lo añado**************************");
           Cliente c4= new Cliente("75465464","Juan","XXXXXXXXX");
           catalogoClientes.añadirCliente(c4);
            System.out.println(catalogoClientes);
        System.out.println("La cantidad de clientes es: " + catalogoClientes.getNumeroClientes());
        
            

    }

}
