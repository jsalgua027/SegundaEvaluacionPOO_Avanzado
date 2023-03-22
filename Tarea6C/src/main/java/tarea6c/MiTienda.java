/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea6c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author nacho
 */
public class MiTienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Producto> listaProductos = new ArrayList<>();

        //1
        Producto p1 = new Pantalon(42, "levis", 1, 60, 12.5, "Pantalon Vaquero");// coversiones implicitas
        Producto p2 = new Pantalon(39, "levis", 2, 55, 12.5, "Pantalon Vaquero");
        Producto p3 = new Musica("ACDC", 3, 15, 8, "Musica Rock");
        Producto p4 = new Musica("EXTREMO DURO", 4, 15, 8, "Musica Rock");
        Producto p5 = new LibroDigital(45, "1234", 5, 10, 4, "Clean code");
        Producto p6 = new LibroDigital(50, "5678", 6, 10, 4, "Java code");
        Producto p7 = new LibroPapel(100, "4567", 7, 20, 8, "El señor de los anillos");
        Producto p8 = new LibroPapel(150, "9875", 8, 20, 8, "Git para torpes");
        //2
        listaProductos.add(p1);
        listaProductos.add(p2);
        listaProductos.add(p3);
        listaProductos.add(p4);
        listaProductos.add(p5);
        listaProductos.add(p6);
        listaProductos.add(p7);
        listaProductos.add(p8);

        //2
        listaProductos.forEach(System.out::println);

        //3 le doy criterio por precio y lo ordeno
        System.out.println("Ordenado  por precio");
        Comparator<Producto> criterioPrecio = (pr1, pr2) -> Double.compare(pr1.getPrecio(), pr2.getPrecio());
        Collections.sort(listaProductos, criterioPrecio);

        listaProductos.forEach(System.out::println);

        // 4 ordeno  segun por codigo
        System.out.println("Ordenado  por codigo");
        Comparator<Producto> criterioCodigo = (pr1, pr2) -> Integer.compare(pr1.getCodigo(), pr2.getCodigo());
        Collections.sort(listaProductos, criterioCodigo);
        listaProductos.forEach(System.out::println);

        // 5 busqueda segun codigo
        System.out.println("Busqueda según codigo; buscamos el producto p5");
        int posicion = Collections.binarySearch(listaProductos, p5, criterioCodigo);
        System.out.println("Se encuentra en la posicion: " + posicion);

        // 6
        List<Libro> listaLibros = new ArrayList<>();

        for (Producto p : listaProductos) {
            if (p instanceof Libro) {
                listaLibros.add((Libro) p); // conversion explicita

            }

        }

        //7
        Iterator<Libro> it = listaLibros.iterator();

        while (it.hasNext()) {
            Libro lib = it.next();
            System.out.println(lib.toString());

        }

        // 8
        System.out.println("Ordenado  por  Isb la lista de lisbros");
        Comparator<Libro> criterioIsb = (pr1, pr2) -> pr1.getIsbn().compareToIgnoreCase(pr2.getIsbn());
        Collections.sort(listaLibros, criterioIsb);
        listaLibros.forEach(System.out::println);

        for (Libro l : listaLibros) {

            if (l instanceof LibroDigital) {
                ((LibroDigital) l).descargar(); // conversion explicita
            }

            if (l instanceof LibroPapel) {// conversion explicita
                ((LibroPapel) l).enviar("Casa vico");
            }

        }

        // 10 comentado
        
        
        //11
          System.out.println("La lista de libros contiene: "+listaLibros.contains(p6));
          
          
          //12
          
        
    }

}
