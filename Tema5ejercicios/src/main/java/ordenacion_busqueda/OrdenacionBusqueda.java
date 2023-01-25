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
        paises.add(new Pais("Italia", 46, 505_400, "Euro"));

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
        System.out.println("Criterio por superficie****************************");
        Comparator<Pais> criterioSuperfice = (p1, p2) -> Long.compare(p1.getSuperficie(), p2.getSuperficie());
        Collections.sort(paises, criterioSuperfice);//usamos los metodos del objeto
        paises.forEach(System.out::println);
        
        //ordenamos por superfice y si se repite la superfice que se ordene por nombre
          Comparator<Pais> criterioNombre = (p1, p2) -> p1.getNombre().compareToIgnoreCase(p2.getNombre());
          Collections.sort(paises, criterioSuperfice.thenComparing(criterioNombre)); // enlazamos los criterios de comparacion
          paises.forEach(System.out::println);
        
    }

}
