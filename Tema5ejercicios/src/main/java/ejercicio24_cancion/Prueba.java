/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24_cancion;

import java.util.ArrayList;

/**
 *
 * @author Windows10
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tamanio = 0;
        ListaReproduccion spotify = new ListaReproduccion(tamanio);
        Cancion c1 = new Cancion("AHORA", "NASH", 5.30);
        Cancion c2 = new Cancion("VENTE", "TOTE", 4.30);
        Cancion c3 = new Cancion("ROCK IN PARIS", "ACDC", 3.25);
        Cancion c4 = new Cancion("LIFE", "COOLPLAY", 4.00);
        Cancion c5 = new Cancion("IN SUMMER", "WUTANG", 2.48);

        System.out.println("¿Esta vacia la lista?: " + spotify.estaVacia());

        System.out.println("Añado todas las canciones creadas********");

        spotify.añadirCancion(c1);
        spotify.añadirCancion(c2);
        spotify.añadirCancion(c3);
        spotify.añadirCancion(c4);
        spotify.añadirCancion(c5);

        System.out.println("¿Esta vacia la lista?: " + spotify.estaVacia());
        System.out.println("Muestro la  lista: ");
        System.out.println("");
        System.out.println(spotify.imprimirLista());

        System.out.println("Busco una cancion");
        System.out.println("Donde esta la cancion " + spotify.buscarCancion(c2));
        System.out.println("");
        System.out.println("Ordeno las canciones por cantantes y la muestro");
        spotify.ordenarListaCantante();
        System.out.println(spotify.imprimirLista());

        System.out.println("");
        System.out.println("Ordeno las canciones por titulos y la muestro");
        spotify.ordenarListaTitulo();
        System.out.println(spotify.imprimirLista());
        
//        System.out.println("");
//        System.out.println("Borro la cancion C2 que es VENTE de TOTE");
//        spotify.borraCancion(c2);
//          System.out.println(spotify.imprimirLista());
        
        System.out.println("Busco por cantante");
       int posicion = spotify.buscarPorCantante("TOTE");
        System.out.println("Se encuentra en la posicion : "+ posicion);
    }

}
