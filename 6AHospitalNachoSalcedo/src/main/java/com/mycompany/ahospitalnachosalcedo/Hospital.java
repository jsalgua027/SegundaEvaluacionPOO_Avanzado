/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ahospitalnachosalcedo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Windows10
 */
public class Hospital {

    private String nombre;
    private String direccion;
    private int numeroCamas;
    private List<Empleado> listaEmpelados;
    private List<Paciente> listaPacinetes;

    public Hospital() {
    }

    public Hospital(String nombre, String direccion, int numeroCamas, List<Empleado> listaEmpelados, List<Paciente> listaPacinetes) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroCamas = numeroCamas;
        this.listaEmpelados = listaEmpelados;
        this.listaPacinetes = listaPacinetes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public List<Empleado> getListaEmpelados() {
        return listaEmpelados;
    }

    public void setListaEmpelados(List<Empleado> listaEmpelados) {
        this.listaEmpelados = listaEmpelados;
    }

    public List<Paciente> getListaPacinetes() {
        return listaPacinetes;
    }

    public void setListaPacinetes(List<Paciente> listaPacinetes) {
        this.listaPacinetes = listaPacinetes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hospital{");
        sb.append("nombre=").append(nombre);
        sb.append(", direccion=").append(direccion);
        sb.append(", numeroCamas=").append(numeroCamas);
        sb.append(", listaEmpelados=").append(listaEmpelados);
        sb.append(", listaPacinetes=").append(listaPacinetes);
        sb.append('}');
        return sb.toString();
    }

    public void contratarEmpleado(Empleado emp) {

        this.listaEmpelados.add(emp);

    }

    public void ingresarPaciente(Paciente pacinete) {

        this.listaPacinetes.add(pacinete);
    }

}
