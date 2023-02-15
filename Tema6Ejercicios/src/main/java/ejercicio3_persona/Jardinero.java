/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3_persona;

/**
 *
 * @author nacho
 */
public class Jardinero extends Empleado {
    
    private int antiguedad;

    public Jardinero() {
    }

    public Jardinero(int antiguedad, double salario, String nombre, String nif, int edad) {
        super(salario, nombre, nif, edad);
        this.antiguedad = antiguedad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
          sb.append(super.toString());
        sb.append("Jardinero{");
        sb.append("antiguedad=").append(antiguedad);
        sb.append('}');
        return sb.toString();
    }
    
    
    public int compareTo(Jardinero o) {
       return Integer.compare(antiguedad, o.getAntiguedad());
    }
    
    
    
}
