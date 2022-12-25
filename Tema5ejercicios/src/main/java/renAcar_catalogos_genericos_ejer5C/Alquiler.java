/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package renAcar_catalogos_genericos_ejer5C;

import rentAcar.*;
import empresa_catalogos.*;
import java.time.LocalDate;

/**
 *
 * @author nacho
 */
public class Alquiler {

    private int alquilerID;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private LocalDate fechaInicio;
    private int duracionDias;

    private static int contador = 0;

    public Alquiler(Cliente cliente, Vehiculo vehiculo, LocalDate fechaInicio, int duracionDias) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fechaInicio = fechaInicio;
        this.duracionDias = duracionDias;
        contador++;
        this.alquilerID = contador;

    }

    public Alquiler() {
    }

    public int getAlquilerID() {
        return alquilerID;
    }

    public int getDuracionDias() {
        return duracionDias;
    }

    public void setDuracionDias(int duracionDias) {
        this.duracionDias = duracionDias;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setAlquilerID(int alquilerID) {
        this.alquilerID = alquilerID;
    }

//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("\n---------------- ");
//        sb.append("Alquiler: ");
//        sb.append("\nAlquilerID: ").append(alquilerID);
//        sb.append("\nNIF cliente: ").append(cliente.getNIF());
//        sb.append("\nBastidor vehiculo: ").append(vehiculo.getBastidor());
//        sb.append("\nFecha inicio alquiler: ").append(fechaInicio);
//        sb.append("\nDuracion del alquiler: ").append(duracionDias);
//        sb.append("\n---------------- ");
//        return sb.toString();
//    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alquiler{");
        sb.append("alquilerID=").append(alquilerID);
        sb.append(", cliente=").append(cliente);
        sb.append(", vehiculo=").append(vehiculo);
        sb.append(", fechaInicio=").append(fechaInicio);
        sb.append(", duracionDias=").append(duracionDias);
        sb.append('}');
        return sb.toString();
    }
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + this.alquilerID;
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
        final Alquiler other = (Alquiler) obj;
        return this.alquilerID == other.alquilerID;
    }

}
