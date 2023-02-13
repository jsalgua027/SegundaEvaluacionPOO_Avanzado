/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2_vehiculo;

/**
 *
 * @author nacho
 */
public class Electrico extends Vehiculo{
    
    private int numBaterias;
    private int duraciCarga; //minutos

    public Electrico() {
    }

    
    
    public Electrico(int numBaterias, int duraciCarga, Long bastidor, String matricula, String marca, String modelo, String color, double tarifa, boolean disponible) {
        super(bastidor, matricula, marca, modelo, color, tarifa, disponible);
        this.numBaterias = numBaterias;
        this.duraciCarga = duraciCarga;
    }

  

    
    
    public int getNumBaterias() {
        return numBaterias;
    }

    public void setNumBaterias(int numBaterias) {
        this.numBaterias = numBaterias;
    }

    public double getDuraciCarga() {
        return duraciCarga;
    }

    public void setDuraciCarga(int  duraciCarga) {
        this.duraciCarga = duraciCarga;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
          sb.append(super.toString());
        sb.append("Electrico{");
        sb.append("numBaterias=").append(numBaterias);
        sb.append(", duraciCarga=").append(duraciCarga);
        sb.append('}');
        return sb.toString();
    }
    
    //cargar bateria
    public void cargarBateria(){
    
        System.out.println("Se esta cargando la bateria del Vehículo "+ this.getMatricula());
    }
    
    //cambiar bateria
    public void cambiarBateria(){
    
        System.out.println("el Vehículo con la matricula: "+ this.getMatricula()+" se está cambiando la bateria");
    }
    @Override
    public void arrancar(){
    
        System.out.println("Soy un vehículo electrico "+ this.getBastidor()+ " y voy a arrancar");
    
    }

    @Override
    public void parar() {
       System.out.println("Soy un vehículo electrico "+ this.getBastidor()+ " y voy a parar");
    }
    
}
