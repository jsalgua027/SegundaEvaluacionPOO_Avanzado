/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ahospitalnachosalcedo;

import java.util.Objects;

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
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.numeroSeguridadSocial);
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.salario) ^ (Double.doubleToLongBits(this.salario) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        return Objects.equals(this.numeroSeguridadSocial, other.numeroSeguridadSocial);
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
