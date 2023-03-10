/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13_interfaces;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nacho
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Persona> lista = new ArrayList<>();
        
        List<Identificable> objetosIdentificables = new ArrayList<>();
        
        
        lista.add(new Estudante("1", "Pepito", "Grillo", "1", "calle del cielo"));
        lista.add(new Titular(LocalDate.now(), "Maestro", "Jaimito", "Perez", "3", "calle sin numero"));
        lista.add(new Interino(LocalDate.now(), "Matematicas", "Pablo", "JJJJJ", "345", "calle azul"));
        
        
          objetosIdentificables.add(new Estudante("1", "Pepito", "Grillo", "1", "calle del cielo"));
          
          
          
          
          
        
        
        for (Persona persona : lista) {
            persona.identificable();
        }
        
        
        
        for (Persona persona : lista) {
            if(persona instanceof Interino){
            
             var tmp=((Interino) persona).getFechaInicioSustitucion();
             
                System.out.println(tmp);
            }
            if (persona instanceof  Titular){
            
            var tmp =((Titular)persona).getFechaJubilacion();
                System.out.println(tmp);
            }
            
            if (persona instanceof  Estudante){
            
            ((Estudante) persona).estudiar();
            }
            
        }
        
      
        
        
        
        
        
    }
    
}
