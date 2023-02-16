/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3_persona;

/**
 *
 * @author Windows10
 */
public class Programador extends Empleado {
    
    private CategoriaProgamador categoria;

    public Programador() {
    }

    public Programador(CategoriaProgamador categoria, double salario, String nombre, String nif, int edad) {
        super(salario, nombre, nif, edad);
        this.categoria = categoria;
    }

    public CategoriaProgamador getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProgamador categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
             sb.append(super.toString());
        sb.append("Programador{");
        sb.append("categoria=").append(categoria);
        sb.append('}');
        return sb.toString();
    }
    
    
     @Override
    public void aumentarSalario(double cantidad) {
       double can= Math.abs(cantidad*0.4);
       
       this.setSalario(this.getSalario()+can);
       
    }

    
    
}
