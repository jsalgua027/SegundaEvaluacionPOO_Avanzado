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

        // 6 Recorre la lista de productos y guarda todos los libros en una lista de libros.
        List<Libro> listaLibros = new ArrayList<>();

        for (Producto p : listaProductos) {
            if (p instanceof Libro) {
                listaLibros.add((Libro) p); // conversion explicita

            }

        }

        //7 Muestra los datos de la lista de libros usando un objeto Iterator. 
        System.out.println("Muestro lista usando iterator");
        Iterator<Libro> it = listaLibros.iterator();

        while (it.hasNext()) {
            Libro lib = it.next();
            System.out.println(lib.toString());

        }

        // 8 Ordena los libros según ISBN, haciendo uso de <<Comparable>>
        System.out.println("Ordenado  por  Isb la lista de libros y los muestro");
        Comparator<Libro> criterioIsb = (pr1, pr2) -> pr1.getIsbn().compareToIgnoreCase(pr2.getIsbn());
        Collections.sort(listaLibros, criterioIsb);
        listaLibros.forEach(System.out::println);

        //9 Recorre de nuevo la lista de libros y en cada iteración, ejecuta enviar() o descargar() en función del tipo de libro.
        System.out.println("Recorro lista libros y uso los metdos según tipo de libro");

        for (Libro l : listaLibros) {

            if (l instanceof LibroDigital) {
                ((LibroDigital) l).descargar(); // conversion explicita
            }

            if (l instanceof LibroPapel) {// conversion explicita
                ((LibroPapel) l).enviar("Casa vico");
            }

        }

        // 10. Indica las líneas de código donde se realizan conversiones implícitas y/o explícitas. REALIZADO
        //11 Utiliza el método contains(Object) sobre la lista de libros para comprobar si existe un libro o no existe.
        System.out.println("La lista de libros contiene: " + listaLibros.contains(p6));

        //12 Usando la lista de productos inicial, crea una nueva lista con todos los objetos que Se Envian.
        List<SeEnvia> listaObjetos = new ArrayList<>();
        for (Producto p : listaProductos) {

            if (p instanceof SeEnvia) {
                listaObjetos.add((SeEnvia) p);
            }
        }
        //13 Recorre la lista de objetos que Se Envian y llama al método de la interfaz.
        System.out.println("Recorro la nueva lista de objetos y llamo al metodo enviar");
        for (SeEnvia ob : listaObjetos) {
            ob.enviar("A una dirección cualquiera");
        }

        //14.Inventa un método abstracto en Libro que tenga comportamientos diferentes en las subclases. Implementa los métodos en las clases hijas.
        System.out.println("Recorro la lista de libros y uso el nuevo método tipoLibro()");
        for (Libro li : listaLibros) {
            li.tipoLibro();
        }

    }
}
