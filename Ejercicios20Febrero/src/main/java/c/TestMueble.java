/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Windows10
 */
public class TestMueble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Mueble> objetos = new ArrayList<>();

        objetos.add(new Mesa()); // conversiones implicitas
        objetos.add(new Silla());

        for (Mueble ob : objetos) {
            if (ob instanceof Mesa) {

                ((Mesa) ob).estabarnizada();// conversion explicita

            } else if (ob instanceof Silla) {

                ((Silla) ob).laSilla();

            }

        }

         List<Mueble> objetosOrdenados = new ArrayList<>();
        Silla s1 = new Silla (4, "verde", 5);
        Silla s2 = new Silla (4, "azul", 5);
        Mesa m1 = new Mesa("redonda", "roja", 13);
        Mesa m2 = new Mesa("cuadrada", "turquesa", 9);
        
        objetosOrdenados.add(m2);
        objetosOrdenados.add(m1);
        objetosOrdenados.add(s1);
        objetosOrdenados.add(s2);
        // hago la ordenacion por criterio natural, indicado con la interface comparable y el metodo comparator
        Collections.sort(objetosOrdenados);
        for (Mueble obj: objetosOrdenados) {
            System.out.println(obj.toString());
        }
    }

}
