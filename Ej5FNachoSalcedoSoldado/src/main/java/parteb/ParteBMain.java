/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parteb;

import java.util.ArrayList;
import parte_A.Ejercito;

/**
 *
 * @author nacho
 */
public class ParteBMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creo los ejercitos
        EjercitoOrdenado ejercitoA = new EjercitoOrdenado();
        EjercitoOrdenado ejercitoB = new EjercitoOrdenado();
        int numeroSoldados;

        Soldado s1 = new Soldado("1234", "Nacho", "Salcedo", "Guarde", 18);
        Soldado s2 = new Soldado("1234", "Pepe", "Rodriguez", "Perez", 25);
        Soldado s3 = new Soldado("5678", "Juan ", "Hernandez", "Sanchez", 17);
        Soldado s4 = new Soldado("8754", "Antonio", "Lucas", "Tenorio", 45);
        Soldado s5 = new Soldado("7775", "Alvaro", "Trujillo", "Isaias", 32);
        Soldado s6 = new Soldado("9856", "Teresa", "Rodiguez", "Sainz", 35);
        Soldado s7 = new Soldado("0589", "Iñaqui", "Elias", "Judas", 55);
        Soldado s8 = new Soldado("0000", "pepe", "pepe", "pepe", 101);

        System.out.println("****************Alistar soldados*******************");
        System.out.println("Tengo un soldado repetido para comprobar que no lo añade");
        ejercitoA.añadirSoldado(s1);
        ejercitoA.añadirSoldado(s2);
        ejercitoA.añadirSoldado(s3);
        ejercitoA.añadirSoldado(s4);
        ejercitoA.añadirSoldado(s5);
        ejercitoA.añadirSoldado(s6);
        ejercitoA.añadirSoldado(s7);

        ejercitoA.getEjercitoOrdenado().forEach(System.out::println);
        System.out.println("Metodo esta vacio probado en dos ejercitos------------------------");
        System.out.println("El Ejercito A tiene soldados?  " + ejercitoA.estaVacio());
        System.out.println("El Ejercito B tiene soldados?  " + ejercitoB.estaVacio());

        System.out.println("");
        System.out.println("Metodo que comprueba que el soldado este en el ejercito, el primero con un soldado que si y el segundo caso con uno que no");
        System.out.println("");
        System.out.println("El soldado s7 se encuentra en la lista? " + ejercitoA.buscarSoldado(s7));
        System.out.println("El soldado s8 se encuentra en la lista? " + ejercitoA.buscarSoldado(s8));

        // creo un ArrayList para usar el metodo devolver lista
        System.out.println("");
        System.out.println("Imprimo la lista obtenida con le metodo de devolver lista");
        ArrayList<Soldado> listaSoldados = new ArrayList<>();
        listaSoldados = ejercitoA.devolverLista();
        listaSoldados.forEach(System.out::println);

        // metodo borrar soldado
        System.out.println("");
        System.out.println("Metodo borrar soldado y imprimo el ejercito");

        ejercitoA.dematricularSoldado("5678");
        ejercitoA.getEjercitoOrdenado().forEach(System.out::println);

    }

}
