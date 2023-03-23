/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61nachosalcedo;

/**
 *
 * @author nacho
 */
public abstract class Poligono extends Figura {
    
    private int base;
    private int altura;
    private int numeroLados;

    public Poligono(int base, int altura, int numeroLados, String id, String color) {
        super(id, color);
        this.base = base;
        this.altura = altura;
        this.numeroLados = numeroLados;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    public void setNumeroLados(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Poligono{");
        sb.append("base=").append(base);
        sb.append(", altura=").append(altura);
        sb.append(", numeroLados=").append(numeroLados);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
