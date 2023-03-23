/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p61nachosalcedo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author nacho
 */
public class Geometria {

    /**
     * @param args the command line arguments
     *
     */
    private static Scanner teclado = new Scanner(System.in);

    public static int leerEnteroSinErroresScanner() {
        int num = 0;
        boolean repetir = true;

        do {
            System.out.println("Introduce el numero entero");
            try {

                num = teclado.nextInt();
                repetir = false;

            } catch (InputMismatchException ime) {
                System.out.println("No has introducido un numero entero");
                //limpio buffer
                teclado.nextLine();
            }

        } while (repetir);

        return num;
    }

    public static void main(String[] args) {

        //1
        Figura f1 = new Triangulo(new Point(0, 0), new Point(3, 0), new Point(0, 4), 4, 3, 3, "1", "Rojo");  // conversiones implicitas
        Figura f2 = new Triangulo(new Point(0, 0), new Point(3, 0), new Point(0, 4), 4, 3, 3, "2", "Verde"); // conversiones implicitas

        Figura f3 = new Rectangulo(new Point(0, 0), new Point(3, 0), new Point(3, 4), new Point(0, 4), 4, 3, 4, "3", "Negro");// conversiones implicitas
        Figura f4 = new Rectangulo(new Point(0, 0), new Point(3, 0), new Point(3, 4), new Point(0, 4), 4, 3, 4, "4", "Amarillo");// conversiones implicitas

        Figura f5 = new Circulo(2, new Point(3, 3), "5", "Naranja");// conversiones implicitas
        Figura f6 = new Circulo(4, new Point(3, 3), "6", "Rosa");// conversiones implicitas

        Set<Figura> conjuntoFiguras = new HashSet<>();

        conjuntoFiguras.add(f1);
        conjuntoFiguras.add(f2);
        conjuntoFiguras.add(f3);
        conjuntoFiguras.add(f4);
        conjuntoFiguras.add(f5);
        conjuntoFiguras.add(f6);

        //2
        conjuntoFiguras.forEach(System.out::println);

        //3    
        List<Figura> listaFiguras = new ArrayList<>(conjuntoFiguras);

        //4
        Comparator<Figura> criterioId = (fr, fr2) -> fr.getId().compareToIgnoreCase(fr2.getId());
        Comparator<Figura> criterioColor = (fr, fr2) -> fr.getColor().compareToIgnoreCase(fr2.getColor());

        Collections.sort(listaFiguras, criterioId.thenComparing(criterioColor));

        System.out.println("Lista de figuras ordenadas");
        listaFiguras.forEach(System.out::println);

        /*
       5.Solicita al usuario por teclado que introduzca un id de una figura. 
       Realiza la búsqueda binaria según el id introducido, 
       mostrando la posición que ocupa en la lista, si existe.
              
         */
        System.out.println("Indique el numero de id a buscar");
        String solitar = teclado.nextLine();
        int pos = 1;

        for (Figura lista : listaFiguras) {

            if (lista instanceof Circulo) {
                pos = Collections.binarySearch(listaFiguras, new Circulo(1, new Point(0, 0), solitar, ""), criterioId);

            }

            if (lista instanceof Rectangulo) {
                pos = Collections.binarySearch(listaFiguras, new Rectangulo(new Point(0, 0), new Point(3, 0),
                        new Point(3, 4), new Point(0, 4), 4, 3, 4, solitar, "Negro"), criterioId);

            }

            if (lista instanceof Triangulo) {
                pos = Collections.binarySearch(listaFiguras, new Triangulo(new Point(0, 0),
                        new Point(3, 0), new Point(0, 4), 4, 3, 3, solitar, "Verde"), criterioId);

            }
        }

        System.out.println("La posicion es : " + pos);

        /*
           
           6
           Recorre la lista de figuras y guarda en una nueva 
           lista todas aquellas que sean dibujables,
           en otra todas aquellas que sean movibles y aquellas que sean Comparable. 

         
          
         */
        List<Figura> listaDibujables = new ArrayList<>();
        List<Figura> listaMovibles = new ArrayList<>();
        List<Figura> listaComparables = new ArrayList<>();

        for (Figura lista : listaFiguras) {
            if (lista instanceof Dibujable) {

                listaDibujables.add(lista);
            }
            if (lista instanceof Comparable) {
                listaComparables.add(lista);
            }
            if (lista instanceof Movible) {
                listaMovibles.add(lista);
            }

        }

        //7  Recorre la lista de objetos Dibujable y llama al método dibujar de cada uno.
        for (Figura lis : listaDibujables) {
            if (lis instanceof Dibujable) {
                ((Dibujable) lis).dibujar(); // conversiones explicitas
            }
        }

        //8 Recorre la lista de objetos Movible y mueve a la derecha dos unidades aquellos objetos Rectángulo y tres unidades arriba los objetos Circulo.
        for (Figura lis : listaMovibles) {
            if (lis instanceof Rectangulo) {
                ((Rectangulo) lis).moverDer(2); // conversiones explicitas
            }

            if (lis instanceof Circulo) {

                ((Circulo) lis).moverArr(3);// conversiones explicitas

            }

        }

    }
}
