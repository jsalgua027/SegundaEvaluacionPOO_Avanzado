/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11_figura;

/**
 *
 * @author Windows10
 */
public class Romboide extends Figura {

    public Romboide() {
    }

    public Romboide(double base, double altura) {
        super(base, altura);
    }
    
    
   @Override
    public void calcularArea() {
        double resultado = 0;
        resultado = super.getAltura() * super.getBase();
        System.out.println("El Area del Romboide = " + resultado);
    }
    
    
}
