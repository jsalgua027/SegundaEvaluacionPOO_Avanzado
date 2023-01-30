/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ParteAtraductor;

import java.util.Collection;
import java.util.Set;

/**
 *
 * @author Windows10
 */
public class Prueba {

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Traductor diccionario = new Traductor();

        String extranjera1 = "Hello";
        String extranjera2 = "Bye";
        String extranjera3 = "Welcome";
        String extranjera4 = "Number";
        String extranjera5 = "Maybe";

        String espaniola1 = "Hola";
        String espaniola2 = "Adios";
        String espaniola3 = "Bienvenido";
        String espaniola4 = "Número";
        String espaniola5 = "Quizas";

        diccionario.guardarEntrada(extranjera1, espaniola1);
        diccionario.guardarEntrada(extranjera2, espaniola2);
        diccionario.guardarEntrada(extranjera3, espaniola3);
        diccionario.guardarEntrada(extranjera4, espaniola4);
        diccionario.guardarEntrada(extranjera5, espaniola5);

        System.out.println("*******************Imprimo el Map***************");
        diccionario.imprimirMap();
        System.out.println("***************Borro adios**************");
        diccionario.borrarEntrada("Bye", "Adios");
        System.out.println("Imprimo para ver que borra ");
        diccionario.imprimirMap();

        System.out.println("Paso las palabras extranjeras a la lista y las imprimo");
        Set<String> palabrasExtranjeras = diccionario.listaDePalabrasExtrangeras();
        palabrasExtranjeras.forEach(System.out::println);

        System.out.println("Paso las palabras extranjeras a la lista y las imprimo");
        Collection<String> palabrasEspa = diccionario.listaDePalabrasEspaniolas();
        palabrasEspa.forEach(System.out::println);

    }

}
