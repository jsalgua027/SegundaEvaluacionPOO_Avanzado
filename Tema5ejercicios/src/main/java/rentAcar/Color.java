/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package rentAcar;

import empresa_catalogos.*;
import java.util.Random;

/**
 *
 * @author nacho
 */
public enum Color {
    ROJO, NEGRO, AZUL, AMARILLO, BLANCO;

    public static Color getAleatorio() {

        var r = new Random();
        Color[] colores = Color.values();
        int posicion = r.nextInt(0, colores.length);

        return colores[posicion];

    }

    public static Color getROJO() {
        return ROJO;
    }

    public static Color getNEGRO() {
        return NEGRO;
    }

    public static Color getAZUL() {
        return AZUL;
    }

    public static Color getAMARILLO() {
        return AMARILLO;
    }

    public static Color getBLANCO() {
        return BLANCO;
    }

}
