/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package partebloteria;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class PruebaLoteria {

    public static Map<NumeroLoteria, Premio> generarMapLoteria(int cantidadNumeros) {
        Map<NumeroLoteria, Premio> aux = new HashMap<>();

        for (int i = 0; i < cantidadNumeros; i++) {
            aux.put(new NumeroLoteria(), new Premio());
        }

        return aux;
    }

    public static Premio tienePremio(Map<NumeroLoteria, Premio> lista, NumeroLoteria aux) {

        return lista.get(aux);

    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Premio solicitado;
        NumeroLoteria numeroPremiado = new NumeroLoteria();

        Map<NumeroLoteria, Premio> loteria = generarMapLoteria(1000);

        for (Map.Entry<NumeroLoteria, Premio> entry : loteria.entrySet()) {
            System.out.println("El boleto es: " + entry.getKey() + " -- " + entry.getValue());

        }

        System.out.println("¿Cuantos numeros hay:  ? " + loteria.size());

        System.out.println("Indique el numero que quiere comprobar");
        numeroPremiado.setNumero(teclado.nextLine());
        solicitado = tienePremio(loteria, numeroPremiado);
        if (loteria.containsKey(numeroPremiado)) {
            System.out.println("El: " + numeroPremiado.toString() + " tiene el premio de: " + solicitado.toString());
        } else {

            System.out.println("El Número indicado no existe");
        }

    }

}
