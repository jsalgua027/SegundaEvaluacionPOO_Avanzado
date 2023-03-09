/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15_legislador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Windows10
 */
public class PruebaLegislador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    List<Legislador> listaLegisladores = new ArrayList<>();
    
    listaLegisladores.add(new Diputado(2, "Cadiz", "PSOE", "Pedro", "Perez"));
    listaLegisladores.add(new Diputado(2, "Málaga", "PSOE", "Antonio", "Sanchez"));
    listaLegisladores.add(new Diputado(2, "Almeria", "PP", "Perico", "Palotes"));
    listaLegisladores.add(new Diputado(2, "Cordoba", "PP", "Laura", "Hernandez"));
  listaLegisladores.add(new Senador(1000, "Madrid", "Podemos", "Juan", "Lucas"));
  listaLegisladores.add(new Senador(100, "Bilbao", "Podemos", "Miguel", "Izeta"));
  listaLegisladores.add(new Senador(10, "Cantabria", "Mas", "Iñigo", "Sanchez"));
  listaLegisladores.add(new Senador(1000, "Asturias", "Mas", "Ernesto", "Aguado"));
  
  
        for (Legislador l: listaLegisladores) {
            System.out.println(l.toString()); 
            System.out.println("Trabaja como:  ");
            l.getCamaraEnQueTrabaja();
        }
    
    
    
    
    
    }
    
}
