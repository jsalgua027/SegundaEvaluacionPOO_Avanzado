/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c;

/**
 *
 * @author Windows10
 */
public class Silla extends Mueble {

    private int numeroPatas;

    public Silla() {
    }

    public Silla(int numeroPatas, String color, double peso) {
        super(color, peso);
        this.numeroPatas = numeroPatas;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Silla{");
        sb.append("numeroPatas=").append(numeroPatas);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void pesoTotal(double cantidad) {

        this.setPeso(cantidad);

    }

    public void laSilla(){
    
        System.out.println("La silla es bonita");
    }
    
}
