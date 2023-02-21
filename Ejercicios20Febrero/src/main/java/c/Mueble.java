/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c;

import java.util.Objects;

/**
 *
 * @author Windows10
 */
public abstract class  Mueble implements Comparable<Mueble>{
    
    private String color;
    private double peso;

    public Mueble() {
    }

    public Mueble(String color, double peso) {
        this.color = color;
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mueble{");
        sb.append("color=").append(color);
        sb.append(", peso=").append(peso);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.color);
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
        final Mueble other = (Mueble) obj;
        return Objects.equals(this.color, other.color);
    }

    @Override
    public int compareTo(Mueble o) {
    return this.color.compareToIgnoreCase(o.getColor());
    }
    
    
    public abstract void pesoTotal(double cantidad);
    
}
