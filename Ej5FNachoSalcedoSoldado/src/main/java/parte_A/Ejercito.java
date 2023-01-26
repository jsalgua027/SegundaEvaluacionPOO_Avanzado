/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte_A;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Windows10
 */
public class Ejercito {
    private Set<Soldado> ejercito;

    public Ejercito() {
    }

    public Ejercito(int tamanio) {
        tamanio=Math.abs(tamanio);
        this.ejercito = new HashSet<>();
        for (int i = 0; i < tamanio; i++) {
            this.ejercito.add(new Soldado());
        }
    }
    
    // metodo para saber cuantos soldados
    public int getNumeroSoldados(){
    
    return this.ejercito.size();
    }
    
    // metodo para añadir soldado
    
    public void añadirSoldado(Soldado s){
    
    this.ejercito.add(s);
    }
    
    public boolean estaVacio(){
    boolean si;
    si = this.ejercito.size()<=0;
     return si;
    }
    
}
