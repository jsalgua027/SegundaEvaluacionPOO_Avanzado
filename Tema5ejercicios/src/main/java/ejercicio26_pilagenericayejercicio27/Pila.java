/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio26_pilagenericayejercicio27;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nacho
 */
public class Pila<T> {

    private List<T> pila;

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

    // metodo push
    public void push(T aux) {
        this.pila.add(aux);

    }

    //metedo pop
    public void pop(T aux) {
        this.pila.remove(this.pila.size() - 1);

    }

    // esta vacia
    public boolean estaVacia() {
        return this.pila.isEmpty();

    }

    // esta llena 
    public boolean estaLlena() {
        return this.pila.isEmpty();

    }
    // cuantos elementos

    public int cuantosElementos() {

        return this.pila.size();
    }

    // mostrar elemtos de la pila según orden de salida{
    public void mostrarElementosSegunSalida() {

        for (int i = this.pila.size() - 1; i >= 0; i--) {
            System.out.print(this.pila.get(i));

        }

    }

    // rellenar pila con array
    public void rellenar(T[] aux) {
        for (int i = 0; i < aux.length; i++) {
            this.pila.add(aux[i]);
        }

    }

    // sacarElementos dentro de un array
    public Object[] sacarElementos() {

        Object[] aux = this.pila.toArray();
        this.pila.clear();
        return aux;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pila{");
        sb.append("pila=").append(pila);
        sb.append('}');
        return sb.toString();
    }

    //
}
