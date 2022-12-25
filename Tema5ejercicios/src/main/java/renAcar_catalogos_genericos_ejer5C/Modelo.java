/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package renAcar_catalogos_genericos_ejer5C;

import rentAcar.*;
import empresa_catalogos.*;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public enum Modelo {

    SEAT_PANDA("Seat", "Panda", "48"),
    FORD_KUGA("Ford", "Kuga", "120"),
    CUPRA("Seat", "Cupra", "95");

    String marca;
    String modelo;
    String cilindrada;

    private Modelo(String marca, String modelo, String cilindrada) {

        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;

    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" (");
        sb.append("Marca: ").append(marca);
        sb.append(", Modelo: ").append(modelo);
        sb.append(", Cilindrada: ").append(cilindrada);
        sb.append(')');
        return sb.toString();
    }

  

    public static Modelo getAleatorio() {
        Random r = new Random();
        Modelo[] modelos = Modelo.values();
        
        int posicionValida = r.nextInt(0, modelos.length);

        return modelos[posicionValida];

    }
    
//    public static  Modelo generarModelo(){
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Indica la marca:");
//        String marcaAux=teclado.nextLine();
//        System.out.println("Indica el modelo:");
//        String modeloAux=teclado.nextLine();
//        System.out.println("Indica la cilindrada:");
//        String cilindradaAux=teclado.nextLine();
//        
//    Modelo aux = new Modelo(marcaAux, modeloAux, modeloAux);
//    
//    
//    
//    }

}
