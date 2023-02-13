/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2_vehiculo;

/**
 *
 * @author nacho
 */
public class Combustion  extends Vehiculo{
    
    private int capacidadLitros;
    private TipoCombustible tipo;

    public Combustion(int capacidadLitros, TipoCombustible tipo, Long bastidor, String matricula, String marca, String modelo, String color, double tarifa, boolean disponible) {
        super(bastidor, matricula, marca, modelo, color, tarifa, disponible);
        this.capacidadLitros = capacidadLitros;
        this.tipo = tipo;
    }

    public Combustion() {
    }

    public int getCapacidadLitros() {
        return capacidadLitros;
    }

    public void setCapacidadLitros(int capacidadLitros) {
        this.capacidadLitros = capacidadLitros;
    }

    public TipoCombustible getTipo() {
        return tipo;
    }

    public void setTipo(TipoCombustible tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
         sb.append(super.toString());
        sb.append("Combustion{");
        sb.append("capacidadLitros=").append(capacidadLitros);
        sb.append(", tipo=").append(tipo);
        sb.append('}');
        return sb.toString();
    }
    
    
    
public void repostar(){

    System.out.println("El vehiculo "+ this.getMatricula()+ "esta repostando");

}

    @Override
    public void arrancar() {
         System.out.println("El Vehiculo de  combustión "+super.getBastidor()+" está arracado");
    }

    @Override
    public void parar() {
         System.out.println("El Vehiculo de  combustión "+super.getBastidor()+" está  apagado");
    }
  
    
    
    
    
    
    
}
