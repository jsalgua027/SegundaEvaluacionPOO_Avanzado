/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13_interfaces;

import java.time.LocalDate;

/**
 *
 * @author nacho
 */
public  final class Interino extends Profesor  implements Comparable<Interino>{
    
    private LocalDate fechaInicioSustitucion;

    public Interino(LocalDate fechaInicioSustitucion, String especialidad, String nombre, String apellido, String nif, String direccion) {
        super(especialidad, nombre, apellido, nif, direccion);
        this.fechaInicioSustitucion = fechaInicioSustitucion;
    }

    public LocalDate getFechaInicioSustitucion() {
        return fechaInicioSustitucion;
    }

    public void setFechaInicioSustitucion(LocalDate fechaInicioSustitucion) {
        this.fechaInicioSustitucion = fechaInicioSustitucion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Interino{");
        sb.append("fechaInicioSustitucion=").append(fechaInicioSustitucion);
        sb.append('}');
        return sb.toString();
    }

 

    @Override
    public int compareTo(Interino o) {
      return this.fechaInicioSustitucion.compareTo(o.fechaInicioSustitucion);
    }
    
    
    
    
    
    
}
