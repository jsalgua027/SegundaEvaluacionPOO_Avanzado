/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RobotVicoAPIStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.Stream;

/**
 *
 * @author nacho
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Robot> lista = getListaRobores(20);

        lista.forEach(System.out::println);

        // ordenar por vida menor mayor
        Collections.sort(lista, (r1, r2) -> Integer.compare(r1.vida(), r2.vida()));
        System.out.println("Ordenados por vida de menor a mayor");
        lista.forEach(System.out::println);

        // mayor a menor
        Comparator<Robot> menorMayor = (r1, r2) -> Integer.compare(r1.vida(), r2.vida());
        System.out.println("Ordenados por vida de mayor a menor");
        Collections.sort(lista, menorMayor.reversed());
        lista.forEach(System.out::println);

        System.out.println("Robots con más del 50%");

        for (Robot robot : lista) {
            if (robot.vida() > 50) {

                System.out.println(robot);
            }
        }

        System.out.println("Robots con más del 50% usando API Stream");

        // STREAM!!!!!!!!!!!!
        Stream<Robot> streamRobot = lista.stream();
        Stream<Robot> streamRobotFiltrados = streamRobot.filter(r -> r.vida() >= 50);// filtro segun criterio
        streamRobotFiltrados.forEach(System.out::println);

        System.out.println("3 Robots con mayor orcentaje de  vida");

        lista.stream()
                .limit(3) // me quedo con los 3 primeros com ya los tengo ordenados
                .forEach(r -> System.err.println(r.numeroSerie())); // imprimo sus numeros de serie

    }

    public static ArrayList<Robot> getListaRobores(int num) {
        var listaRobots = new ArrayList<Robot>();

        Random random = new Random();

        if (num <= 0) {

            throw new IllegalArgumentException("El numero de robots a crear no es valido");
        }
        for (int i = 0; i < num; i++) {

            listaRobots.add(new Robot(random.nextInt(0, 5000), random.nextInt(1, 101)));
        }

        return listaRobots;
    }

}
