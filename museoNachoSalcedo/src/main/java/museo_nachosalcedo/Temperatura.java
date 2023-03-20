/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo_nachosalcedo;

/**
 *
 * @author Windows10
 */
public final class Temperatura extends Sensor {

    private final double MAX_TEM = 25;
    private final double MIN_TEM = 15;

    public Temperatura(String id) {
        super(id);
    }

    public double getMAX_TEM() {
        return MAX_TEM;
    }

    public double getMIN_TEM() {
        return MIN_TEM;
    }
    
    
       public void max_tem(double humedad) {

        if (humedad > this.MAX_TEM) {
            alarma();
        }
    }

    public void min_tem(double humedad) {

        if (humedad < this.MIN_TEM) {
            alarma();
        }
    }
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Temperatura{");
        sb.append("MAX_TEM=").append(MAX_TEM);
        sb.append(", MIN_TEM=").append(MIN_TEM);
        sb.append('}');
        return sb.toString();
    }

    @Override
    void alarma() {
        System.out.println("ALARMA!!!!!!!  LA TEMPERATURA ESTA FUERA DE RANGO");
    }

}
