/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RepasoListasCasaChatGpt;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Windows10
 */
public class TestTienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Tienda tienda = new Tienda();
     
     Map <LocalDate, Venta> aux = new TreeMap<>();
     
        Producto producto1 = new Producto("Smartphone", 899.9, 1);
        Producto producto2 = new Producto("Smart TV", 1499.99, 1);
        Producto producto3 = new Producto("Laptop", 1299.99, 1);
        Producto producto4 = new Producto("Tablet", 599.99, 1);
        Producto producto5 = new Producto("Audífonos inalámbricos", 349.99,1);
        Producto producto6 = new Producto("Altavoz Bluetooth", 99.99, 1);
        Producto producto7 = new Producto("Cámara digital", 1999.99, 1);
        Producto producto8 = new Producto("PlayStation 5", 499.99, 1);
        Producto producto9 = new Producto( "Thermomix TM6", 1499.99, 1);
        Producto producto10 = new Producto( "Dell UltraSharp U2720Q", 649.99, 1);
        
        List<Producto> listaProductos1= new ArrayList<>();
        List<Producto> listaProductos2= new ArrayList<>();
        List<Producto> listaProductos3= new ArrayList<>();
        List<Producto> listaProductos4= new ArrayList<>();
        
        
        listaProductos1.add(producto1);
        listaProductos1.add(producto2);
        listaProductos1.add(producto3);
        
        
        listaProductos2.add(producto4);
        listaProductos2.add(producto5);
        listaProductos2.add(producto6);
        
        
        listaProductos3.add(producto7);
        listaProductos3.add(producto8);
        listaProductos3.add(producto9);
        listaProductos3.add(producto10);
        
        
        
        Venta v1 = new Venta(listaProductos1, LocalDate.of(2020, 2, 3));
        Venta v2 = new Venta(listaProductos2, LocalDate.of(2022, 2, 4));
        Venta v3 = new Venta(listaProductos3, LocalDate.of(2021, 1, 3));
        
        aux.put(v1.getFecha(), v1);
        aux.put(v2.getFecha(), v2);
        aux.put(v3.getFecha(), v3);
        
        
//        for (Map.Entry<LocalDate, Venta> entry : aux.entrySet()) {
//            LocalDate key = entry.getKey();
//            Venta  val = entry.getValue();
//            
//            System.out.println("La fecha de la venta es:  "
//                    + key.format(DateTimeFormatter.ISO_DATE)+" y los productos son: " + val.getProductos());
//            
//        }
        
        
        
        
        tienda.agregarVenta(v1);
        tienda.agregarVenta(v2);
        tienda.agregarVenta(v3);
        
            for (Map.Entry<LocalDate, Venta> entry : tienda.getVentas().entrySet()) {
            LocalDate key = entry.getKey();
            Venta  val = entry.getValue();
            
            System.out.println("La fecha de la venta es:  "
                    + key.format(DateTimeFormatter.ISO_DATE)+" y los productos son: " + val.getProductos());
            
        }
            
        
        
        
          
        
    }

}
