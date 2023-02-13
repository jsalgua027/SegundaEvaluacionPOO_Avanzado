/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2_vehiculo;

/**
 *
 * @author nacho
 */
public class Deportivo  extends Vehiculo{
    
    private int cilindrada; // Atributo específico para Deportivo

    public Deportivo(int cilindrada, Long bastidor, String matricula, String marca, String modelo, String color, double tarifa, boolean disponible) {
        super(bastidor, matricula, marca, modelo, color, tarifa, disponible);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Deportivo{");
        sb.append("cilindrada=").append(cilindrada);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void arrancar() {
      System.out.println("El Deportivo"+super.getBastidor()+" esta arracado");
    }

    @Override
    public void parar() {
         System.out.println("El Deportivo"+super.getBastidor()+" esta apagado");
    }

    
    
    
}
