/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RepasoListas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author nacho
 *
 *
 * a- apartir la lista de vuelos . hace return de un Map que para cada ciudad de
 * destino diga cuanta gente en total.
 *
 * b_ a partir de la lista de vuelos quiero un map que para codigo de vuelo el
 * conjunto de pasajeros (set)
 *
 *
 *
 *
 */
public class Prueba {

    public static Map<String, Integer> apartadoA(List<Vuelo> listaVuelos) {
        Map<String, Integer> aux = new HashMap<>();

        for (int i = 0; i < listaVuelos.size(); i++) {
            if (aux.containsKey(listaVuelos.get(i).getDestino())) {
                aux.replace(listaVuelos.get(i).getDestino(),// seleccionamos el destino del vuelo actual
                        aux.get(listaVuelos.get(i).getDestino()) // seleccionamos el value ya asociado con esa key 
                        + listaVuelos.get(i).getListaPasajeros().size());// sumamos al value los pasajeros del vuelo actual

            } else {
                aux.put(listaVuelos.get(i).getDestino(), listaVuelos.get(i).getListaPasajeros().size());
            }

        }

        return aux;
    }

    public static Map<Integer, Set<Pasajero>> apartadoB(List<Vuelo> listaVuelos) {
        Map<Integer, Set<Pasajero>> aux = new TreeMap<>();

        for (Vuelo v : listaVuelos) {
            Set<Pasajero> auxPasajeros = new TreeSet<>();

            for (int i = 0; i < v.getListaPasajeros().size(); i++) {
                auxPasajeros.add(v.getListaPasajeros().get(i));
            }
            aux.put(v.getCodigo(), auxPasajeros);
        }

        return aux;

    }

    public static void main(String[] args) {

        Pasajero p1 = new Pasajero("nacho", "salcedo", TipoPasajero.TURISTA);
        Pasajero p2 = new Pasajero("pepe", "perez", TipoPasajero.TURISTA);
        Pasajero p3 = new Pasajero("maria", "jimenez", TipoPasajero.TURISTA);
        Pasajero p4 = new Pasajero("lucas", "hernandez", TipoPasajero.TURISTA);
        Pasajero p5 = new Pasajero("miguel", "duran", TipoPasajero.TURISTA);
        Pasajero p6 = new Pasajero("antonio", "lopez", TipoPasajero.PRIMERA);
        Pasajero p7 = new Pasajero("juan", "lopez", TipoPasajero.PRIMERA);
        Pasajero p8 = new Pasajero("ester", "rodriguez", TipoPasajero.PRIMERA);
        Pasajero p9 = new Pasajero("ismael", "sanchez", TipoPasajero.PRIMERA);
        Pasajero p10 = new Pasajero("laura", "cendan", TipoPasajero.PRIMERA);

        List<Pasajero> lista1 = new ArrayList<>();
        List<Pasajero> lista2 = new ArrayList<>();
        List<Pasajero> lista3 = new ArrayList<>();

        lista1.add(p1);
        lista1.add(p2);

        lista2.add(p2);
        lista2.add(p3);
        lista2.add(p7);
        lista2.add(p8);

        lista3.add(p6);
        lista3.add(p4);
        lista3.add(p5);

        Vuelo v1 = new Vuelo("Malaga", "Madrid", 3, lista1);
        Vuelo v2 = new Vuelo("Malaga", "Bali", 10, lista2);
        Vuelo v3 = new Vuelo("Mallorca", "Madrid", 3, lista3);
        Vuelo v4 = new Vuelo("Paris", "Jerez", 6, lista1);
        Vuelo v5 = new Vuelo("Bilbao", "Madrid", 1, lista2);
        Vuelo v6 = new Vuelo("Barcelona", "Malaga", 2, lista3);

        //  lista de  vuelos 
        List<Vuelo> listaVuelos = new ArrayList<>();

        listaVuelos.add(v1);
        listaVuelos.add(v2);
        listaVuelos.add(v3);
        listaVuelos.add(v4);
        listaVuelos.add(v5);
        listaVuelos.add(v6);

        // imprimo la lista
        Map<String, Integer> map1 = apartadoA(listaVuelos);

        for (String key : map1.keySet()) {
            System.out.println(key);

        }

        for (Integer value : map1.values()) {
            System.out.println(value);

        }

        System.out.println("***********APARTADO B******************");
        // imprimo la lista
        Map<Integer, Set<Pasajero>> map2 = apartadoB(listaVuelos);

        for (Integer key : map2.keySet()) {
            System.out.println(key);

        }

        for (Set<Pasajero> value : map2.values()) {
            System.out.println(value);

        }

    }

}
