/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61nachosalcedo;

/**
 *
 * @author nacho
 */
public final class Rectangulo extends Poligono implements Dibujable, Movible {

    private Point punto1;
    private Point punto2;
    private Point punto3;
    private Point punto4;

    public Rectangulo(Point punto1, Point punto2, Point punto3, Point punto4, int base, int altura, int numeroLados, String id, String color) {
        super(base, altura, numeroLados, id, color);
        this.punto1 = punto1; // comienzo de abajo izquierda y va en sentido de las agunas del reloj
        this.punto2 = punto2;
        this.punto3 = punto3;
        this.punto4 = punto4;
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

    public Point getPunto4() {
        return punto4;
    }

    public void setPunto4(Point punto4) {
        this.punto4 = punto4;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Rectangulo{");
        sb.append("punto1=").append(punto1);
        sb.append(", punto2=").append(punto2);
        sb.append(", punto3=").append(punto3);
        sb.append(", punto4=").append(punto4);
        sb.append('}');
        return sb.toString();
    }

    @Override
    double area() {
        double resultado = 0;

        resultado = this.getBase() * this.getAltura();

        return resultado;

    }

    @Override
    public void dibujar() {
        System.out.println("Dibujo rectangulo");

        char[][] figura = new char[this.getBase()][this.getAltura()];

        for (int i = 0; i < figura.length; i++) {
            for (int j = 0; j < figura[i].length; j++) {
                if (i == 0 || i == this.getBase() - 1 || j == 0 || j == this.getAltura() - 1) {
                    figura[i][j] = '#';
                } else {
                    figura[i][j] = ' ';
                }
            }
        }

        for (int i = 0; i < figura.length; i++) {
            for (int j = 0; j < figura[i].length; j++) {
                System.out.print(figura[i][j]);
            }
            System.out.println();
        }

    }

    @Override
    public void moverIzq(int x) {
        this.getPunto1().setY(-x);
        this.getPunto2().setY(-x);
        this.getPunto3().setY(-x);
        this.getPunto4().setY(-x);
    }

    @Override
    public void moverDer(int x) {
        this.getPunto1().setY(+x);
        this.getPunto2().setY(+x);
        this.getPunto3().setY(+x);
        this.getPunto4().setY(+x);
    }

    @Override
    public void moverArr(int y) {
        this.getPunto1().setX(+y);
        this.getPunto2().setX(+y);
        this.getPunto3().setX(+y);
        this.getPunto4().setX(+y);
    }

    @Override
    public void moverAbb(int y) {
        this.getPunto1().setX(-y);
        this.getPunto2().setX(-y);
        this.getPunto3().setX(-y);
        this.getPunto4().setX(-y);
    }

}
