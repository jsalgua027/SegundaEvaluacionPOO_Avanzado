/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1_casa;

/**
 *
 * @author nacho
 */
public class Abatible extends Ventana {
    
    private int angulo;

    public Abatible() {
    }

    public Abatible(int angulo, boolean estadoVentana) {
        super(estadoVentana);
        this.angulo = angulo;
    }

    public int getAngulo() {
        return angulo;
    }

    public void setAngulo(int angulo) {
        this.angulo = angulo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
         sb.append(super.toString());
        sb.append("Abatible{");
        sb.append("angulo=").append(angulo);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
