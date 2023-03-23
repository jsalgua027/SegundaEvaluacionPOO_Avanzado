/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61nachosalcedo;

/**
 *
 * @author nacho
 */
public class Circulo extends Figura implements Movible {

    private int longitudRadio;
    private Point punto1;

    public Circulo(int longitudRadio, Point punto1, String id, String color) {
        super(id, color);
        this.longitudRadio = longitudRadio;
        this.punto1 = punto1;
    }

   

    public int getLongitudRadio() {
        return longitudRadio;
    }

    public void setLongitudRadio(int longitudRadio) {
        this.longitudRadio = longitudRadio;
    }

    public Point getPunto1() {
        return punto1;
    }

    public void setPunto1(Point punto1) {
        this.punto1 = punto1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Circulo{");
        sb.append("longitudRadio=").append(longitudRadio);
        sb.append(", punto1=").append(punto1);
        sb.append('}');
        return sb.toString();
    }

    @Override
    double area() {
        double resultado = 0;

        resultado = Math.pow(resultado, 2) * 3.14;
        return resultado;
    }

    @Override
    public void moverIzq(int x) {
        this.getPunto1().setY(-x);
    }

    @Override
    public void moverDer(int x) {
        this.getPunto1().setY(+x);
    }

    @Override
    public void moverArr(int y) {
        this.getPunto1().setX(+y);
    }

    @Override
    public void moverAbb(int y) {
        this.getPunto1().setX(-y);
    }

    

}
