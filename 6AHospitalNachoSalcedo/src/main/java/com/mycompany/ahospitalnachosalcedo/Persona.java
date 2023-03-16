/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ahospitalnachosalcedo;

import java.time.LocalDate;

/**
 *
 * @author Windows10
 */
public abstract class Persona {
    
    private String nombre;
    private String apellidos;
    private NIF dni;
    
    public Persona(String nombre, String apellidos, NIF dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }
    
    public Persona() {
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellidos() {
        return apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public NIF getDni() {
        return dni;
    }
    
    public void setDni(NIF dni) {
        this.dni = dni;
    }
    
    public final void renovarNif(LocalDate fechaSolicitud) {
        
        System.out.println("LA fecha de renovacion es: " + getDni().renovar(fechaSolicitud));
        
    }
    
}
