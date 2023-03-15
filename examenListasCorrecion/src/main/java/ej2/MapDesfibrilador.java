/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2;

import daw.Desfibrilador;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author nacho
 */
public class MapDesfibrilador {

    private Map<String, Desfibrilador> map = new TreeMap<>();

    public MapDesfibrilador(Desfibrilador[] aux, boolean verdad) {

        if (verdad == true) {
            for (int i = 0; i < aux.length; i++) {
                this.map.put(aux[i].getId(), aux[i]);
            }

        }

    }

    public Map<String, Desfibrilador> getMap() {
        return map;
    }

    //B
    @Override
    public String toString() {
        String aux = "";
        for (Map.Entry<String, Desfibrilador> entry : map.entrySet()) {
            String key = entry.getKey();
            Desfibrilador val = entry.getValue();

            aux = key.concat(key) + val.getNombre() + val.getEmail();

        }

        return aux;
    }

    //C
    public Boolean estaContenido(Desfibrilador aux) {
        Boolean contenido = false;

        for (Map.Entry<String, Desfibrilador> entry : map.entrySet()) {
            if (entry.getKey().equals(aux)) {

                contenido = true;
            } else {

                contenido = false;
            }

        }

        return contenido;

    }

    //D
    public  static List<Desfibrilador> devuelvoLista(Map<String, Desfibrilador> aux) {

        List<Desfibrilador> listaAux = new ArrayList<>(aux.values());

        return listaAux;

    }

    //E pendiente
    public  Map<String, Integer> devulvoCantidad(String correo) {

        Map<String, Integer> mapAux = new TreeMap<>();

        for (Map.Entry<String, Desfibrilador> entry : this.map.entrySet()) {

        }

        return mapAux;

    }
}
