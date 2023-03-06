/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11_figura;

/**
 *
 * @author Windows10
 */
public class Triangulo extends Figura {

    public Triangulo() {
    }

    public Triangulo(double base, double altura) {
        super(base, altura);
    }
    

    @Override
    public void calcularArea() {
        double resultado = 0;
        resultado = (super.getAltura() * super.getBase()) / 2;
        System.out.println("El Area del Triángulo = " + resultado);
    }

}
