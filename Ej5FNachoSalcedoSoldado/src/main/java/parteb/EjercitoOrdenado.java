package parteb;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;
import parteb.Soldado;

/**
 *
 * @author nacho
 */
public class EjercitoOrdenado {
    
    private SortedSet<Soldado> ejercitoOrdenado = new TreeSet<>();

    public EjercitoOrdenado() {
        
        this.ejercitoOrdenado= new TreeSet<>();
    }

    public SortedSet<Soldado> getEjercitoOrdenado() {
        return ejercitoOrdenado;
    }

    
// metodo para saber cuantos soldados
    public int getNumeroSoldados() {

        return this.ejercitoOrdenado.size();
    }

    // metodo para añadir soldado
    public void añadirSoldado(Soldado s) {

        this.ejercitoOrdenado.add(s);
    }
// saber si el ejercito está vacio

    public boolean estaVacio() {
        return this.ejercitoOrdenado.isEmpty();
    }

    // buscar soldado
    public boolean buscarSoldado(Soldado aux) {
        return this.ejercitoOrdenado.contains(aux);

    }

    //sacar los soldados en forma de ArrayList
    public ArrayList<Soldado> devolverLista() {
        ArrayList<Soldado> aux = new ArrayList<>(this.ejercitoOrdenado);

        return aux;

    }

    // borrar soldado
    public String dematricularSoldado(String nif) {

        return this.ejercitoOrdenado.remove(new Soldado(nif, " ", " ", " ", 0))
                ? "El soldado con el nif: " + nif + " ha sido borrado " : "No se puede borrar un soldado que no existe";
    }

    
    
    
    
    
    
    
}
