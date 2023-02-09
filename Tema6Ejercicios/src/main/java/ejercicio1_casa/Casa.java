/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1_casa;

/**
 *
 * @author Windows10
 */
public class Casa {
    
    private  int numPlantas ;
    private double metrosCuadrados;

    public Casa(int numPlantas, double metrosCuadrados) {
        this.numPlantas = numPlantas;
        this.metrosCuadrados = metrosCuadrados;
    }

    public Casa() {
    }

    public int getNumPlantas() {
        return numPlantas;
    }

    public void setNumPlantas(int numPlantas) {
        this.numPlantas = numPlantas;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Casa{");
        sb.append("numPlantas=").append(numPlantas);
        sb.append(", metrosCuadrados=").append(metrosCuadrados);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.numPlantas;
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.metrosCuadrados) ^ (Double.doubleToLongBits(this.metrosCuadrados) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Casa other = (Casa) obj;
        return Double.doubleToLongBits(this.metrosCuadrados) == Double.doubleToLongBits(other.metrosCuadrados);
    }
    
    
    
    
}
