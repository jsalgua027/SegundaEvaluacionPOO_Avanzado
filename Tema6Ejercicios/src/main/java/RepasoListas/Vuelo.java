/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RepasoListas;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author nacho
 * 
 * a- apartier la lista de vuelos . hace return de un  Map que para cada ciudad  de destino diga cuanta gente en total.
 * 
 * b_ a partir de la lista de vuelos quiero un map que para codigo de vuelo el conjunto de pasajeros (set)
 * 
 * 
 */
public class Vuelo {
    
    private int  codigo;
    private String origen;
    private String destino;
    private double duracion;
    private List<Pasajero> listaPasajeros;
    private static  int contador;
    
    public Vuelo() {
    }

    public Vuelo(String origen, String destino, double duracion, List<Pasajero> listaPasajeros) {
        this.codigo = contador++;
        this.origen = origen;
        this.destino = destino;
        this.duracion = duracion;
        this.listaPasajeros =listaPasajeros;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public List<Pasajero> getListaPasajeros() {
        return listaPasajeros;
    }

    public void setListaPasajeros(List<Pasajero> listaPasajeros) {
        this.listaPasajeros = listaPasajeros;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.codigo);
        hash = 59 * hash + Objects.hashCode(this.origen);
        hash = 59 * hash + Objects.hashCode(this.destino);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.duracion) ^ (Double.doubleToLongBits(this.duracion) >>> 32));
        hash = 59 * hash + Objects.hashCode(this.listaPasajeros);
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
        final Vuelo other = (Vuelo) obj;
        return Objects.equals(this.codigo, other.codigo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vuelo{");
        sb.append("codigo=").append(codigo);
        sb.append(", origen=").append(origen);
        sb.append(", destino=").append(destino);
        sb.append(", duracion=").append(duracion);
        sb.append(", listaPasajeros=").append(listaPasajeros);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
}
