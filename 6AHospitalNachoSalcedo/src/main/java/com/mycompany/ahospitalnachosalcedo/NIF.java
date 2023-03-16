/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ahospitalnachosalcedo;

import java.time.LocalDate;
import java.time.Year;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author Windows10
 */
public class NIF {

    private long numero;
    private char letra;
    private LocalDate fechaCaducidad;

    public NIF(long numero, LocalDate fechaCaducidad) {
        this.numero = numero;
        this.letra = calcularLetra();
        this.fechaCaducidad = fechaCaducidad;
    }

    public NIF() {
    }

    public long getNumero() {
        return numero;
    }

    public char getLetra() {
        return letra;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NIF{");
        sb.append("numero=").append(numero);
        sb.append(", letra=").append(letra);
        sb.append(", fechaCaducidad=").append(fechaCaducidad);
        sb.append('}');
        return sb.toString();
    }

    private char calcularLetra() {
        String c = RandomStringUtils.randomAlphabetic(1).toUpperCase();
        char aux = c.charAt(0);
        return aux;
    }

    public LocalDate renovar(LocalDate fechaSolicitudRenovacion) {

        return this.fechaCaducidad = fechaSolicitudRenovacion.plusYears(10);
    }

}
