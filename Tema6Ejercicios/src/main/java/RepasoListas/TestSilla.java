/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RepasoListas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author nacho
 */
public class TestSilla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<Silla, Double> aux = new TreeMap<>();

        Silla s1 = new Silla(12, "Ana");
        Silla s2 = new Silla(10, "Pepe");
        Silla s3 = new Silla(1, "Nacho");
        Silla s4 = new Silla(3, "Lucas");
        Silla s5 = new Silla(8, "Iñigo");
        Silla s6 = new Silla(3, "Lucas");
        Silla s7 = new Silla(6, "Eva");

        aux.put(s1, s1.getPeso());
        aux.put(s2, s2.getPeso());
        aux.put(s3, s3.getPeso());
        aux.put(s4, s4.getPeso());
        aux.put(s5, s5.getPeso());
        aux.put(s6, s6.getPeso());
        aux.put(s7, s7.getPeso());

//        for (Silla s : aux.keySet()) {
//            System.out.println(s);
//        }
//  
//        for (Double p : aux.values()) {
//            System.out.println(p);
//        }
//      
//      
        for (Map.Entry<Silla, Double> entry : aux.entrySet()) {
            Silla key = entry.getKey();
            Double val = entry.getValue();

            System.out.println("Key: " + key.getNombre() + " tienen el peso=  " + val);

        }

        List<Silla> listaSillas = new ArrayList<>();

        listaSillas.add(s1);
        listaSillas.add(s2);
        listaSillas.add(s3);
        listaSillas.add(s4);
        listaSillas.add(s5);
        listaSillas.add(s6);
        listaSillas.add(s7);

        System.out.println("Lista de sillas según orden de insercción");

        listaSillas.forEach(s -> System.out.println("Nombre: " + s.getNombre()));

        // ordeno por orden natural -
        
        System.out.println("Lista de sillas según orden natural");
        Collections.sort(listaSillas);
        listaSillas.forEach(s -> System.out.println("Nombre: " + s.getNombre()));
        
        
        
        System.out.println("Lista de sillas según peso");
     //  Comparator<Silla> criterioPeso=(o1, o2) -> Double.compare(o1.getPeso(), o2.getPeso()); //dandole el critero
      //  Collections.sort(listaSillas, criterioPeso);
        Collections.sort(listaSillas, (o1, o2) -> Double.compare(o1.getPeso(), o2.getPeso()));
        listaSillas.forEach(s -> System.out.println("Peso: " + s.getPeso()));
        

        
        
    }

}
