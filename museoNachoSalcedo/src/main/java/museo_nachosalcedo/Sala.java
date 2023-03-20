/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo_nachosalcedo;

import java.lang.reflect.Array;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author Windows10
 */
public abstract class Sala {
    
    private String nombreSala;
    private int codigoSala;
    private List<Obra> listadoObras;
   private Sensor senorTemp;
   private Sensor senorHum;;

    public Sala(String nombreSala, int codigoSala, List<Obra> listadoObras, Temperatura sensorTemp, Humedad sensorHum) {
        this.nombreSala = nombreSala;
        this.codigoSala = codigoSala;
        this.listadoObras = listadoObras;
        this.senorTemp = sensorTemp;
        this.senorHum = sensorHum;
    }

    public String getNombreSala() {
        return nombreSala;
    }

    public void setNombreSala(String nombreSala) {
        this.nombreSala = nombreSala;
    }

    public int getCodigoSala() {
        return codigoSala;
    }

    public void setCodigoSala(int codigoSala) {
        this.codigoSala = codigoSala;
    }

    public List<Obra> getListadoObras() {
        return listadoObras;
    }

    public void setListadoObras(List<Obra> listadoObras) {
        this.listadoObras = listadoObras;
    }

    public Sensor getSenorTemp() {
        return senorTemp;
    }

    public void setSenorTemp(Sensor senorTemp) {
        this.senorTemp = senorTemp;
    }

    public Sensor getSenorHum() {
        return senorHum;
    }

    public void setSenorHum(Sensor senorHum) {
        this.senorHum = senorHum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nSALA{");
        sb.append("nombreSala=").append(nombreSala);
        sb.append(", codigoSala=").append(codigoSala);
        sb.append("\nOBRAS").append(listadoObras);
        sb.append("\nSenorTemp=").append(senorTemp);
        sb.append("\nSenorHum=").append(senorHum);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.nombreSala);
        hash = 73 * hash + this.codigoSala;
        hash = 73 * hash + Objects.hashCode(this.listadoObras);
        hash = 73 * hash + Objects.hashCode(this.senorTemp);
        hash = 73 * hash + Objects.hashCode(this.senorHum);
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
        final Sala other = (Sala) obj;
        return this.codigoSala == other.codigoSala;
    }
   

 abstract  void horariosSala();
  

 
 
   
   
    
}
