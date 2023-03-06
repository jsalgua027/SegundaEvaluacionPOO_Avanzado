/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11_figura;

/**
 *
 * @author Windows10
 */
public abstract class Figura {

 private double base;
 private double altura;

    public Figura() {
    }

    public Figura(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Figura{");
        sb.append("base=").append(base);
        sb.append(", altura=").append(altura);
        sb.append('}');
        return sb.toString();
    }
 
 
 public abstract void calcularArea();
    
}
