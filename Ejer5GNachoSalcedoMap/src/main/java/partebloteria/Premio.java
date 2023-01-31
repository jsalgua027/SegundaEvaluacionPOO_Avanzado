/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partebloteria;

import java.util.Random;

/**
 *
 * @author Windows10
 */
public class Premio {
    
    
      
    
             
    private int cantidadPremiada;// en euros
    private static Random aleatorio = new Random();

    
    
    
    
public  Premio() {
        this.cantidadPremiada =generarPremioAleaorio();
    }

    public int getCantidadPremiada() {
        return cantidadPremiada;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.cantidadPremiada;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Premio other = (Premio) obj;
        return this.cantidadPremiada == other.cantidadPremiada;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
    
        sb.append("Cantidad premiada con: ").append(cantidadPremiada);
       
        return sb.toString();
    }
        



 public static int aleatorioDentroRango(int min, int max) {
        int numeroGenerado;

        numeroGenerado = aleatorio.nextInt(max - min + 1) + min;

        return numeroGenerado;

    }    

public int    generarPremioAleaorio(){
int opcion= aleatorioDentroRango(1, 10);
int cantidad=0;
    switch (opcion) {
          case 1 -> {
            cantidad=5000;
            }
             case 2 -> {
                cantidad=2500;
            }
             case 3 -> {
                  cantidad=1000;
            }
             case 4 -> {
                cantidad=500;
            }
             case 5 -> {
                 cantidad=250;
            }
             case 6 -> {
                cantidad=0;
            }
              case 7 -> {
                cantidad=0;
            }
               case 8 -> {
                cantidad=0;
            }
                case 9 -> {
                cantidad=0;
            }
                 case 10 -> {
                cantidad=0;
            }
        default -> {
            }
    }
      
        return this.cantidadPremiada=cantidad;
    }
    
}
