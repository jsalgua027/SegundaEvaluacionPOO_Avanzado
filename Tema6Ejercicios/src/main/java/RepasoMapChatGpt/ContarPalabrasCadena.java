/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RepasoMapChatGpt;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Windows10
 */
public class ContarPalabrasCadena {
     public static void main(String[] args) {
     /*Ejercicio: Contar la frecuencia de palabras en una cadena de texto.
Descripción: Dada una cadena de texto, contar la frecuencia de cada palabra que aparece en ella y mostrar los resultados en orden descendente de frecuencia.
Instrucciones:
Crea una clase llamada "FrecuenciaPalabras" con un método llamado "contarFrecuencia" que reciba como parámetro una cadena de texto.
Dentro del método "contarFrecuencia", crea un Map llamado "frecuencia" que tenga como clave cada palabra que aparece en la cadena de texto y como valor la frecuencia de dicha palabra.
Recorre la cadena de texto palabra por palabra y añade cada palabra al Map "frecuencia". Si la palabra ya existe en el Map, aumenta su valor en 1. Si no existe, añádela al Map con valor 1.
Crea un Set llamado "palabrasOrdenadas" que contenga todas las palabras del Map "frecuencia" en orden descendente de frecuencia.
Recorre el Set "palabrasOrdenadas" y muestra por pantalla la frecuencia de cada palabra.
        
        */
     
     String texto= "Crea una clase llamada \"FrecuenciaPalabras\" con un método llamado \"contarFrecuencia\" que reciba como parámetro una cadena de texto.\n" +
"Dentro del método \"contarFrecuencia\", crea un Map llamado \"frecuencia\" que tenga como clave cada palabra que aparece en la cadena de texto y como valor la frecuencia de dicha palabra.\n" +
"Recorre la cadena de texto palabra por palabra y añade cada palabra al Map \"frecuencia\". Si la palabra ya existe en el Map, aumenta su valor en 1. Si no existe, añádela al Map con valor 1.\n" +
"Crea un Set llamado \"palabrasOrdenadas\" que contenga todas las palabras del Map \"frecuencia\" en orden descendente de frecuencia.\n" +
"Recorre el Set \"palabrasOrdenadas\" y muestra por pantalla la frecuencia de cada palabra.";
     
     
     String texto2= "Hola no entiendo el ejercicio hola no no";
     
        contarFrecuencia(texto2);
     
    }
    
    public static void contarFrecuencia(String texto){
    
        //clave es la palabra, el value las veces que aparece.
        Map<String,Integer>frecuencia = new HashMap<>();
    
    
        //1 separo las palabras por split ""
        String[] palabras = texto.split(" ");
        
        //2 recorremos el texto y añadimos cada palabra al map.
        //de normal tendrá value 1, si se repite aumentamos su valor.
        for (String palabra : palabras) {
            
            //si YA EXISTE, +1
            if(frecuencia.containsKey(palabra)){
            
                frecuencia.put(palabra, frecuencia.get(palabra)+ 1);
            
            }else{
            
            frecuencia.put(palabra, 1);
            }
            
        
            
            
        }
        
        System.out.println("IMPRIMIMOS EL MAP:");
        
          frecuencia.forEach((clave, valor) -> System.out.println("Clave " + clave + " -- Objeto " + valor));
          
        //PASO A SET ORDENADO
        //NO SE PUEDE PASAR TAL CUAL PORQUE AL SER ORDENADO NECESITO DECIRLE EL ORDEN
        //Set<String> conjuntoPalabrasOrdenadas = new TreeSet<>(frecuencia.values());
        
           Set<String> palabrasOrdenadas = new TreeSet<>(new Comparator<String>() {
            public int compare(String palabra1, String palabra2) {
                int frecuencia1 = frecuencia.get(palabra1);
                int frecuencia2 = frecuencia.get(palabra2);
                if (frecuencia1 != frecuencia2) {
                    return frecuencia2 - frecuencia1;
                } else {
                    return palabra1.compareTo(palabra2);
                }
            }
        });
           
           //Lo añado al set
           palabrasOrdenadas.addAll(frecuencia.keySet());
           
           //Recorremos el set y mostramos frecuencia
           
           palabrasOrdenadas.forEach(System.out::println);
           
             System.out.println("ITERADORES****************************************");
        // Se puede recorrer el set con un iterador
        Iterator<String> iterador =palabrasOrdenadas.iterator();
        
        while(iterador.hasNext()){ // No existe orden 
           String p = iterador.next();
            System.out.println(p);
        }
       
        
    }
}
