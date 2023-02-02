/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio26_pilagenericayejercicio27;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nacho
 */
public class Pila<T> {
    
    private List<T> pila ;
    
// constructo generico
    public Pila() {
        this.pila = new ArrayList<>();
    }

    public List<T> getPila() {
        return pila;
    }

    public void setPila(List<T> pila) {
        this.pila = pila;
    }
    
    
    
}
