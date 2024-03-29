/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoria_ordenacion_busqueda_binarysearh;

import java.util.Objects;

/**
 *
 * @author nacho
 */
public class Pais  implements Comparable<Pais>{
    
    private String nombre;
    private long poblacion;// millones habitantes
    private long superficie;
    private String moneda;

    public Pais() {
    }

    public Pais(String nombre, long poblacion, long superficie, String moneda) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.superficie = superficie;
        this.moneda = moneda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(long poblacion) {
        this.poblacion = poblacion;
    }

    public long getSuperficie() {
        return superficie;
    }

    public void setSuperficie(long superficie) {
        this.superficie = superficie;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pais{");
        sb.append("nombre=").append(nombre);
        sb.append(", poblacion=").append(poblacion);
        sb.append(", superficie=").append(superficie);
        sb.append(", moneda=").append(moneda);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.nombre);
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
        final Pais other = (Pais) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

    
    // metodo que tenemos que implemetar al usar la interface Comparable
    @Override
    public int compareTo(Pais o) {
        return  this.nombre.compareToIgnoreCase(o.nombre);
        
    }

    
    
    
    
}
