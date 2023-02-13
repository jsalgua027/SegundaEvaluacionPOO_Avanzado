/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2_vehiculo;

/**
 *
 * @author nacho
 */
public class Turismo extends Vehiculo {

    private int puertas;
    private boolean marchaAutomatica;

    public Turismo(int puertas, boolean marchaAutomatica, Long bastidor, String matricula, String marca, String modelo, String color, double tarifa, boolean disponible) {
        super(bastidor, matricula, marca, modelo, color, tarifa, disponible);
        this.puertas = puertas;
        this.marchaAutomatica = marchaAutomatica;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public boolean isMarchaAutomatica() {
        return marchaAutomatica;
    }

    public void setMarchaAutomatica(boolean marchaAutomatica) {
        this.marchaAutomatica = marchaAutomatica;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Turismo{");
        sb.append("puertas=").append(puertas);
        sb.append(", marchaAutomatica=").append(marchaAutomatica);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void arrancar() {
         System.out.println("El Turismo "+super.getBastidor()+" esta arracado");
    }

    @Override
    public void parar() {
        System.out.println("El turismo "+super.getBastidor()+" esta parada");
    }

}


