/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2_vehiculo;

/**
 *
 * @author nacho
 */
public class Furgoneta extends Vehiculo{
    
   
	// Atributos específicos
private int carga;
private int volumen;

    public Furgoneta(int carga, int volumen, Long bastidor, String matricula, String marca, String modelo, String color, double tarifa, boolean disponible) {
        super(bastidor, matricula, marca, modelo, color, tarifa, disponible);
        this.carga = carga;
        this.volumen = volumen;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
           sb.append(super.toString());
        sb.append("Furgoneta{");
        sb.append("carga=").append(carga);
        sb.append(", volumen=").append(volumen);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void arrancar() {
         System.out.println("La Furgoneta S"+super.getBastidor()+" esta arracado");
    }

    @Override
    public void parar() {
        System.out.println("La Furgoneta S"+super.getBastidor()+" esta parada");
    }


    
}
