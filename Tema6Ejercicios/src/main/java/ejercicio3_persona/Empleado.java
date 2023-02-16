/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3_persona;

/**
 *
 * @author Windows10
 */
public   abstract class  Empleado extends Persona {
    
    private double salario;

    public Empleado() {
    }

    public Empleado(double salario, String nombre, String nif, int edad) {
        super(nombre, nif, edad);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
             sb.append(super.toString());
        sb.append("Empleado{");
        sb.append("salario=").append(salario);
        sb.append('}');
        return sb.toString();
    }
    // metodo aumentar salario
    public abstract void aumentarSalario (double cantidad);
   
    
    
    
    
    
}
