/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenacion_y_busqueda_animales;

import java.util.Objects;

/**
 *
 * @author nacho
 */
public class Animal  implements Comparable<Animal>{
    
    private String raza;
    private float poblacion;
    private String localizacion;
    private String tipo;

    public Animal() {
    }

    public Animal(String raza, float poblacion, String lozalizacion, String tipo) {
        this.raza = raza;
        this.poblacion = poblacion;
        this.localizacion = lozalizacion;
        this.tipo = tipo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public float getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(float poblacion) {
        this.poblacion = poblacion;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Animal{");
        sb.append("raza=").append(raza);
        sb.append(", poblacion=").append(poblacion);
        sb.append(", lozalizacion=").append(localizacion);
        sb.append(", tipo=").append(tipo);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.raza);
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
        final Animal other = (Animal) obj;
        return Objects.equals(this.raza, other.raza);
    }

    @Override
    public int compareTo(Animal o) {
       return this.raza.compareToIgnoreCase(o.getRaza());
    }
    
    
    
    
}
