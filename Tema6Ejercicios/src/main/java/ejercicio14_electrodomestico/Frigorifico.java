/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14_electrodomestico;

/**
 *
 * @author nacho
 */
public class Frigorifico extends Electrodomestico implements Silencioso {

    private double capacidad; // litros;

    public Frigorifico(double capacidad, double consumo, String modelo) {
        super(consumo, modelo);
        this.capacidad = capacidad;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Frigorifico{");
        sb.append("capacidad=").append(capacidad);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void silencio() {
        System.out.println("El frigorifico emite 50dB");
    }

}
