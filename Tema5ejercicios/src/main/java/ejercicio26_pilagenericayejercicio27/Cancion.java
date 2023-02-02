/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio26_pilagenericayejercicio27;

import java.util.Objects;

/**
 *
 * @author nacho
 */
public class Cancion {
    
    
    private String titulo;
    private String cantante;

    private double duracion;// minutos 

    public Cancion() {
    }

    public Cancion(String titulo, String cantante, double duracion) {
        this.titulo = titulo;
        this.cantante = cantante;
     
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    

  

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cancion{");
        sb.append("titulo=").append(titulo);
        sb.append(", cantante=").append(cantante);
        sb.append(", duracion=").append(duracion);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.titulo);
        hash = 83 * hash + Objects.hashCode(this.cantante);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.duracion) ^ (Double.doubleToLongBits(this.duracion) >>> 32));
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
        final Cancion other = (Cancion) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return Objects.equals(this.cantante, other.cantante);
    }

    

    }

