/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26_pilagenericayejercicio27;

/**
 *
 * @author nacho
 */
public class PruebaPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila<String> aux= new Pila<>(6);
        Pila<Cancion> canciones = new Pila<>(6);
        
        String st1="hola";
        String st2="adios";
        String st3="pepe";
        String st4="azul";
        String st5="perro";
        String st6="coche";
        
        Cancion c1 = new Cancion("hola hola", "Paco", 2.56);
        Cancion c2 = new Cancion("love", "Beatles", 2.00);
        Cancion c3 = new Cancion("Balck", "ACDC", 2.45);
        Cancion c4 = new Cancion("las mareas", "Carmona", 3.00);
        Cancion c5 = new Cancion("lucky lucky", "Los morancos", 2.56);
        Cancion c6 = new Cancion("BYe", "antonio flores", 2.56);
        
        aux.push(st1);
        aux.push(st2);
        aux.push(st3);
        aux.push(st4);
        aux.push(st5);
        aux.push(st6);
        
        canciones.push(c1);
        canciones.push(c2);
        canciones.push(c3);
        canciones.push(c4);
        canciones.push(c5);
        canciones.push(c6);
        System.out.println("******************canciones******");
        canciones.mostrarElementosSegunSalida();
        System.out.println("*******************Strings********");
        aux.mostrarElementosSegunSalida();
        
        
        
        
        
    }
    
}
