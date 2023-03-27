/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61nachosalcedo;

/**
 *
 * @author nacho
 */
public final class Triangulo extends Poligono implements Comparable<Triangulo> {

    private Point punto1;
    private Point punto2;
    private Point punto3;

    public Triangulo(Point punto1, Point punto2, Point punto3, int base, int altura, int numeroLados, String id, String color) {
        super(base, altura, numeroLados, id, color);
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
    }

   
    public Point getPunto1() {
        return punto1;
    }

    public void setPunto1(Point punto1) {
        this.punto1 = punto1;
    }

    public Point getPunto2() {
        return punto2;
    }

    public void setPunto2(Point punto2) {
        this.punto2 = punto2;
    }

    public Point getPunto3() {
        return punto3;
    }

    public void setPunto3(Point punto3) {
        this.punto3 = punto3;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Triangulo{");
        sb.append("punto1=").append(punto1);
        sb.append(", punto2=").append(punto2);
        sb.append(", punto3=").append(punto3);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    @Override
    double area() {
        double resultado = 0;

        resultado = (super.getBase() * super.getAltura()) / 2;

        return resultado;

    }

    @Override
    public int compareTo(Triangulo o) {
        return Integer.compare(this.getBase(), o.getBase());
    }

}