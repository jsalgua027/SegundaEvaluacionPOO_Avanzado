/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parteCejercito;

import java.util.Objects;

/**
 *
 * @author Windows10
 */
public class Soldado implements Comparable<Soldado>{
    
    private String nif;
    private String nombre;
    private String apell1;
    private String apell2;
    private int edad;

    public Soldado() {
    }

    public Soldado(String nif, String nombre, String apell1, String apell2, int edad) {
        this.nif = nif;
        this.nombre = nombre;
        this.apell1 = apell1;
        this.apell2 = apell2;
        this.edad = edad;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApell1() {
        return apell1;
    }

    public void setApell1(String apell1) {
        this.apell1 = apell1;
    }

    public String getApell2() {
        return apell2;
    }

    public void setApell2(String apell2) {
        this.apell2 = apell2;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Soldado{");
        sb.append("nif=").append(nif);
        sb.append(", nombre=").append(nombre);
        sb.append(", apell1=").append(apell1);
        sb.append(", apell2=").append(apell2);
        sb.append(", edad=").append(edad);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.nif);
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
        final Soldado other = (Soldado) obj;
        return Objects.equals(this.nif, other.nif);
    }

    @Override
    public int compareTo(Soldado o) {
      return this.nif.compareToIgnoreCase(o.nif);
    }
    
    
    
    
    
}

