/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio24_cancion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Windows10
 */
public class ListaReproduccion {
    
    private List<Cancion> canciones;
    
    public ListaReproduccion(int tamanio) {
        
        tamanio = Math.abs(tamanio);
        
        this.canciones = new ArrayList<>(tamanio);
        
        for (int i = 0; i < tamanio; i++) {
            this.canciones.add(new Cancion());
        }
        
    }

    // numero de canciones
    public int numeroCanciones() {
        
        return this.canciones.size();
    }

    // si esta vacio
    public boolean estaVacia() {
        boolean siLoEsta;// true es vacia

        if (numeroCanciones() == 0) {
            siLoEsta = true;
        } else {
            siLoEsta = false;
        }
        
        return siLoEsta;
        
    }

    // ecuchar cancion segun posición
    public Cancion escucharCancion(int posicion) {
        if(posicion>0 && posicion<=canciones.size()){
       
        }
         return canciones.get(posicion);
    }

    // cambiar canción de la posicion inidicada por otra propocionada
    public void cambiarCancion(int posicion, Cancion c) {
        
        if(posicion>0&&posicion<= this.canciones.size()){
        
        }
        this.canciones.set(posicion, c);
        
    }

    // añadir cancion al final de la lista
    public void añadirCancion(Cancion c) {
        if(this.canciones!=null){
            this.canciones.add(c);
        }
    
    }

    //borrar cancion posición indicada
    public boolean borraCancionPosicion(int posicion) {
        
        if (posicion > 0&& posicion<=this.canciones.size()) {
            this.canciones.remove(this.canciones.get(posicion));
            return true;
        }
        return false;
    }

    // borrar pasando la cancion
    public boolean borraCancion(Cancion c) {
        
        if (this.canciones.contains(c)) {
            this.canciones.remove(c);
            return true;
        }
        return false;
        
    }

    // imprimir lista
    public String imprimirLista() {
        
        String tmp = "";
        
        for (Cancion v : this.canciones) {
            
            tmp += v.toString() + "\n";
            
        }
        
        return tmp;
    }

    // buscar cancion ¿¿¿¿tengo que crear el objeto dentro del metodo????
    public int buscarCancion(Cancion c) {
        
        return this.canciones.indexOf(c);
    }

    //ordenar por titulo
    public void ordenarListaTitulo() {
        
        Collections.sort(this.canciones, (c1, c2) -> c1.getTitulo().compareToIgnoreCase(c2.getTitulo()));
        
    }

    //ordenar por cantante
    public void ordenarListaCantante() {
        
        Collections.sort(this.canciones, (c1, c2) -> c1.getCantante().compareToIgnoreCase(c2.getCantante()));
    }
    
    //ordenar lista
//    public void ordenar(){
//    
//    Collections.sort(this.canciones);
//    }
    
//    //busqueda por titulo
//   public int  buscarPorTitulo(String titulo){
//       Cancion aux = new Cancion();
//       aux.setTitulo(titulo);
//      ordenarListaTitulo();
//
//   return Collections.binarySearch( this.canciones, aux.getTitulo());
//   }
    
//    public int busquedaPorCantante(Cancion c){
//        ordenarListaCantante();
//        
//        return Collections.binarySearch(this.canciones,c);
//    }
    
    
}
