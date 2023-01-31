/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parteCejercito;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Windows10
 */
public class Ejercito {
    
    private SortedSet<Soldado> ejercito = new TreeSet<>();

    public Ejercito() {
        
        this.ejercito= new TreeSet<>();
    }

    public SortedSet<Soldado> getEjercito() {
        return ejercito;
    }

    
// metodo para saber cuantos soldados
    public int getNumeroSoldados() {

        return this.ejercito.size();
    }

    // metodo para añadir soldado
    public void añadirSoldado(Soldado s) {

        this.ejercito.add(s);
    }
// saber si el ejercito está vacio

    public boolean estaVacio() {
        return this.ejercito.isEmpty();
    }

    // buscar soldado
    public boolean buscarSoldado(Soldado aux) {
        return this.ejercito.contains(aux);

    }

    //sacar los soldados en forma de ArrayList
    public ArrayList<Soldado> devolverLista() {
        ArrayList<Soldado> aux = new ArrayList<>(this.ejercito);

        return aux;

    }

    // borrar soldado
    public String dematricularSoldado(String nif) {

        return this.ejercito.remove(new Soldado(nif, " ", " ", " ", 0))
                ? "El soldado con el nif: " + nif + " ha sido borrado " : "No se puede borrar un soldado que no existe";
    }

    
    
    
    
    
    
    
}
