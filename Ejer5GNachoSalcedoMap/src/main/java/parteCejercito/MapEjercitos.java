/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parteCejercito;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Windows10
 */
public class MapEjercitos {

    public static void ingresarEjercito(Map<String, Ejercito> listaEjer, String clave, Ejercito aux) {

        listaEjer.put(clave, aux);

    }

    public static  Ejercito obteneEjercito(Map<String, Ejercito> aux, Ejercito auxEjer) {

        for (Map.Entry<String, Ejercito> entry : aux.entrySet()) {
            if (auxEjer.equals(entry.getValue())) {

                return entry.getValue();
            }

        }
        return null;

    }

    public static void main(String[] args) {
        Soldado s1 = new Soldado("1234", "Nacho", "Salcedo", "Guarde", 18);
        Soldado s2 = new Soldado("1238", "Pepe", "Rodriguez", "Perez", 25);
        Soldado s3 = new Soldado("5678", "Juan ", "Hernandez", "Sanchez", 17);
        Soldado s4 = new Soldado("8754", "Antonio", "Lucas", "Tenorio", 45);
        Soldado s5 = new Soldado("7775", "Alvaro", "Trujillo", "Isaias", 32);
        Soldado s6 = new Soldado("9856", "Teresa", "Rodiguez", "Sainz", 35);
        Soldado s7 = new Soldado("0589", "Iñaqui", "Elias", "Judas", 55);
        Soldado s8 = new Soldado("0000", "pepe", "pepe", "pepe", 33);
        Soldado s9 = new Soldado("0235", "Juan", "Lopez", "Lopez", 42);

        Ejercito ejercitoTierra = new Ejercito();
        Ejercito ejercitoMar = new Ejercito();
        Ejercito ejercitoAire = new Ejercito();

        Map<String, Ejercito> listaEjercitos = new HashMap<>();

        ejercitoTierra.añadirSoldado(s1);
        ejercitoTierra.añadirSoldado(s2);
        ejercitoTierra.añadirSoldado(s3);

        ejercitoMar.añadirSoldado(s4);
        ejercitoMar.añadirSoldado(s5);
        ejercitoMar.añadirSoldado(s6);

        ejercitoAire.añadirSoldado(s7);
        ejercitoAire.añadirSoldado(s8);
        ejercitoAire.añadirSoldado(s9);

        ingresarEjercito(listaEjercitos, "01", ejercitoTierra);
        ingresarEjercito(listaEjercitos, "02", ejercitoMar);
        ingresarEjercito(listaEjercitos, "03", ejercitoAire);
        
        // imprimo lista ejercitos
        System.out.println("Imprimo la lista de ejercitos");
        for(Map.Entry<String, Ejercito> entry: listaEjercitos.entrySet()){
            System.out.println("El número de ejercito es: " +entry.getKey()+"Y su nombre es "+ entry.getValue());
        }
        
        System.out.println("Uso el metodo de obtener ejercito atraves del nombre y imprimo ");
        
       Ejercito aux = obteneEjercito(listaEjercitos, ejercitoTierra);
       
         aux.getEjercito().forEach(System.out::println);
    }

}
