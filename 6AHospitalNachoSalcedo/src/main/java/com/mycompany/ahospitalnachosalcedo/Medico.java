/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ahospitalnachosalcedo;

/**
 *
 * @author Windows10
 */
public class Medico extends Empleado {

    private String especialidad;

    public Medico() {
    }

    public Medico(String especialidad, String numeroSeguridadSocial, double salario, String nombre, String apellidos, NIF dni) {
        super(numeroSeguridadSocial, salario, nombre, apellidos, dni);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NewClass{");
        sb.append("especialidad=").append(especialidad);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calcularIRPF() {
       
        if (this.especialidad.equalsIgnoreCase("cirujia")) {

            return this.getSalario() * 0.25;
        } else {

            return this.getSalario() * 0.235;
        }
    }

}
