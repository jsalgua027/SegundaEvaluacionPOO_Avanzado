/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenacion_busqueda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author nacho
 */
public class OrdenacionBusqueda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Pais> paises = new ArrayList<>();

        paises.add(new Pais("España", 46, 505_400, "Euro"));
        paises.add(new Pais("Portugal", 23, 25_400, "Euro"));
        paises.add(new Pais("EEUU", 146, 1_505_400, "Dolar Americano"));
        paises.add(new Pais("Vietnam", 46, 505_400, "Euro"));

        paises.forEach(System.out::println);
        // ordenacion usando orden natural (requiere que pais implemte Comparable)
        Collections.sort(paises);
        System.out.println("El efecto de la ordnacion**********************");
        paises.forEach(System.out::println);
        System.out.println("********************usamos comparator");
        // usamos el comparator proporcionamos el criterio mediante una lambda 

        Collections.sort(paises, (p1, p2) -> Long.compare(p1.getPoblacion(), p2.getPoblacion()));
        paises.forEach(System.out::println);

        // podemos crear un objeto para realizar el criterio
        Comparator<Pais> criterioPoblacion = (p1, p2) -> Long.compare(p1.getPoblacion(), p2.getPoblacion());
        Collections.sort(paises, criterioPoblacion.reversed());//usamos los metodos del objeto
        paises.forEach(System.out::println);
        System.out.println("**************Criterio por superficie****************************");
        Comparator<Pais> criterioSuperfice = (p1, p2) -> Long.compare(p1.getSuperficie(), p2.getSuperficie());
        Collections.sort(paises, criterioSuperfice);//usamos los metodos del objeto
        paises.forEach(System.out::println);
         System.out.println("****************Criterio por superficie y nombre****************************");
        //ordenamos por superfice y si se repite la superfice que se ordene por nombre
          Comparator<Pais> criterioNombre = (p1, p2) -> p1.getNombre().compareToIgnoreCase(p2.getNombre());
          Collections.sort(paises, criterioSuperfice.thenComparing(criterioNombre)); // enlazamos los criterios de comparacion
          paises.forEach(System.out::println);
        
           System.out.println("Criterio por superficie y poblacion****************************");
          // ordena la lista por superficie y luego por poblacion
          Collections.sort(paises, criterioSuperfice.thenComparing(criterioPoblacion));
           paises.forEach(System.out::println);
           
           
           // *********************************BUSQUEDA *********************************************
           
           //SI USAMOS BUSQUEDA POR BINARYSERCH TENEMOS QUE TENER LA LISTA ORDENADA SEGUN CRITERIO
           
           // buscamos por orden natural --> el indicado en tu método abstrato   compareTo ();
           //la lista donde biscar la información debe de estar ordenada previamente según el criterio de orden natural  (nombre) Comparable en Pais
           System.out.println("****************BUSQUEDA  BINARIA**********************");
           Collections.sort(paises); // ordeno por criterio natural
           System.out.println("ordeno de forma natural  (nombre) y imprimo la lista");
             paises.forEach(System.out::println);
           Pais objetoBuscar = new Pais();
           objetoBuscar.setNombre("Portugal");// la key que quiero buscar
           int posicion =Collections.binarySearch(paises, objetoBuscar); // si da negativo no se encuentra sino da la posición
           System.out.println("Portugal esta en la posición: "+ posicion); 
        
           //si intento buscar en la lista con un valor que no es nombre se puede obtener una posicion erronea
           System.out.println("************************* modificamos el nombre y intentamos buscar por otro criterio y no vale da negativo");
           objetoBuscar.setNombre(" ");
           objetoBuscar.setPoblacion(23);
           posicion =Collections.binarySearch(paises, objetoBuscar); 
           System.out.println("Portugal esta en la posición: "+ posicion); 
           
           // si ordeno la lista por un criterio y busco por otro el resultado es inesperado
           
           System.out.println("*********ordenación y busqueda por población**********");
           // antes de hacer la lista ordenamos
           
           Collections.sort(paises, criterioPoblacion);
            paises.forEach(System.out::println);
            objetoBuscar=new Pais();
            objetoBuscar.setPoblacion(146);
           posicion= Collections.binarySearch(paises, objetoBuscar, criterioPoblacion);
           System.out.println("el pais que tiene 146 millones habitantes es "+ paises.get(posicion));
           
    }

}
