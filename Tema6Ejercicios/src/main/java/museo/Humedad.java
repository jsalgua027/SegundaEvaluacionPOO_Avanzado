/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

/**
 *
 * @author Windows10
 */
public final class Humedad extends Sensor {

    private final double MAX = 25;
    private final double MIN = 12;

    public Humedad(String id) {
        super(id);
    }

    public double getMAX() {
        return MAX;
    }

    public double getMIN() {
        return MIN;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Humedad{");
        sb.append("MAX=").append(MAX);
        sb.append(", MIN=").append(MIN);
        sb.append('}');
        return sb.toString();
    }

    public void max_hum(double humedad) {

        if (humedad > this.MAX) {
            alarma();
        }
    }

    public void min_hum(double humedad) {

        if (humedad < this.MIN) {
            alarma();
        }
    }

    @Override
    void alarma() {
        System.out.println("ALARMA!!!!!!!  LA HUMEDAD ESTA FUERA DE RANGO");
    }

}
