/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14_electrodomestico;

/**
 *
 * @author nacho
 */
public class Microondas extends Electrodomestico implements Silencioso {

    private double potenciaMaxima; //watios

    public Microondas(double potenciaMaxima, double consumo, String modelo) {
        super(consumo, modelo);
        this.potenciaMaxima = potenciaMaxima;
    }

    public double getPotenciaMaxima() {
        return potenciaMaxima;
    }

    public void setPotenciaMaxima(double potenciaMaxima) {
        this.potenciaMaxima = potenciaMaxima;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Microondas{");
        sb.append("potenciaMaxima=").append(potenciaMaxima);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void silencio() {
        System.out.println("El frigorifico emite 40dB");

    }

}
