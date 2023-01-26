/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenacion_y_busqueda_animales;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author nacho
 */
public class ListaAnimales {

    /**
     * @param args the command line arguments
     */
    public static void ordenacionNatural(List<Animal> a) {

        Collections.sort(a);

    }
    
    public static void orenacionCriterio (List<Animal>aux, Comparator<Animal> criterio){
    
     Collections.sort(aux, criterio);
    }

    public static int busquedaBinarySearchNatural(List<Animal> aux, Animal objetobuscar) {
        int posicion = 0;
        ordenacionNatural(aux);
        posicion = Collections.binarySearch(aux, objetobuscar);

        return posicion;
    }

    public static int busquedaBinarySearchCriteriol(List<Animal> aux, Animal objetobuscar, Comparator<Animal>criterio) {
        int posicion = 0;
        orenacionCriterio(aux, criterio);
        posicion = Collections.binarySearch(aux, objetobuscar);

        return posicion;
    }
    public static void imprimirLista (List<Animal> aux){
    
    aux.forEach(System.out::println);
    
    }
    
    public static void main(String[] args) {
        List<Animal> zoologico = new ArrayList<>();
        int posicion =0;
        Animal a1 = new Animal("Tigre", 6, "Africa", "Felino");
        Animal a2 = new Animal("León", 12, "SurAfrica", "Carnivoro");
        Animal a3 = new Animal("Delfin", 30, "Oceano", "Mamifero");
        Animal a4 = new Animal("Paloma", 100, "Europa", "Omnivoro");
        Animal a5 = new Animal("Cucaracha", 200, "Iran", "Insecto");

        zoologico.add(a1);
        zoologico.add(a2);
        zoologico.add(a3);
        zoologico.add(a4);
        zoologico.add(a5);
        
        // objetos criterio
        
        Comparator<Animal> criterioPoblacion = (c1,c2)->Float.compare(c1.getPoblacion(), c2.getPoblacion());
        
        Comparator<Animal> criterioLocalizacion =(l1,l2)->l1.getLocalizacion().compareToIgnoreCase(l2.getLocalizacion());
        Comparator<Animal> criterioTipo =(t1,t2)->t1.getTipo().compareToIgnoreCase(t2.getTipo());
        
        System.out.println("-------------------------------------Impirmo la lista inicial------------------------------");
        imprimirLista(zoologico);
        System.out.println("*********************************************************************");
        System.out.println("ordeno por natual (raza) y impirmo");
        ordenacionNatural(zoologico);
        imprimirLista(zoologico);
        Animal b1= new Animal();
        b1.setRaza("Delfin");
        posicion=busquedaBinarySearchNatural(zoologico, b1);
        System.out.println("El delfin se encuentra en la posición : " +posicion);
        
        System.out.println("****************************************************************");
        System.out.println("------ordeno Por criterio de Poblacion----------");

    }

}
