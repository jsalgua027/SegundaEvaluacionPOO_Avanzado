/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2;

import daw.Desfibrilador;
import daw.UtilesDesfibrilador;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author nacho
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Desfibrilador[] auxdes = UtilesDesfibrilador.getDesfibriladores();
        Desfibrilador desfibri = new Desfibrilador("8309", "DEA_250", "Camino Colmenar, 46", "registro@emasa.es", "683770062");

        MapDesfibrilador aux = new MapDesfibrilador(auxdes, true);
        Map<String, Integer> mapContando = new TreeMap<>();

        System.out.println(aux.toString());

        System.out.println("Esta contenido el objeto en el map= " + aux.estaContenido(desfibri));

        List<Desfibrilador> listaAux = new ArrayList<>();

        listaAux = MapDesfibrilador.devuelvoLista(aux.getMap());

        for (Desfibrilador d : listaAux) {
            System.out.println(d.toString());
        }

//        mapContando = aux.devulvoCantidad("registro@mesa.es");
//
//        for (String key : mapContando.keySet()) {
//            System.out.println(key);
//
//        }
//
//        for (Integer value : mapContando.values()) {
//            System.out.println(value);
//
//        }

    }

}
