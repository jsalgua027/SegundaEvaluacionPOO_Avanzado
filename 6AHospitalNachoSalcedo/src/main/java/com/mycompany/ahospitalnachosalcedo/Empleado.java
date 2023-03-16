/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ahospitalnachosalcedo;

/**
 *
 * @author Windows10
 */
public abstract class Empleado extends Persona {
    
    private String numeroSeguridadSocial;
    private double salario;

    public Empleado() {
    }

    public Empleado(String numeroSeguridadSocial, double salario, String nombre, String apellidos, NIF dni) {
        super(nombre, apellidos, dni);
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.salario = salario;
    }

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public double getSalario() {
        return salario;
    }
// solo pongo el setter del salario pq el numero de la seguridad social lo considero que no se pude modificar una vez creado
    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("numeroSeguridadSocial=").append(numeroSeguridadSocial);
        sb.append(", salario=").append(salario);
        sb.append('}');
        return sb.toString();
    }
    
   //metodo abstracto que me servira para calcular el IRPF segun el tipo de empleado
    public abstract double calcularIRPF();
    
}
