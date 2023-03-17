/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ahospitalnachosalcedo;

import java.util.Random;

/**
 *
 * @author Windows10
 */
public class Paciente extends Persona implements Nadadores{
    
      private String numeroHistoria;

    public Paciente(String numeroHistoria) {
        this.numeroHistoria = numeroHistoria;
    }

    public Paciente(String numeroHistoria, String nombre, String apellidos, NIF nif) {
        super(nombre, apellidos, nif);
        this.numeroHistoria = numeroHistoria;
    }

    public Paciente() {
    }

    public String getNumeroHistoria() {
        return numeroHistoria;
    }

    public void setNumeroHistoria(String numeroHistoria) {
        this.numeroHistoria = numeroHistoria;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Paciente{");
        sb.append("numeroHistoria=").append(numeroHistoria);
        sb.append('}');
        return sb.toString();
    }

    
    
    
    //
    public void tomarMedicina(String medicamento) {
        Random random = new Random();
        boolean curado = random.nextBoolean();

        System.out.println("Yo "  + getNombre() + " " + getApellidos() + " estoy tomando " + medicamento);
        if (curado) {
            System.out.println("El paciente se ha curado");
        } else {
            System.out.println("El paciente no se ha curado");
        }
    }

    @Override
    public void nadadores() {
        System.out.println("El paciente SI es un nadador");
    }
    
}
