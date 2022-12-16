/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicioclases;

/**
 *
 * @author nacho
 */
public class Rueda {
    
    private double diametro;
    private String marca;

    public Rueda(double diametro, String marca) {
        this.diametro = diametro;
        this.marca = marca;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rueda{");
        sb.append("diametro=").append(diametro);
        sb.append(", marca=").append(marca);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
