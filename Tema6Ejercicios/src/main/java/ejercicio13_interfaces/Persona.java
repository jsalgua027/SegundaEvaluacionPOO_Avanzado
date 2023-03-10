/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13_interfaces;

/**
 *
 * @author nacho
 */
// Una clase abstracta no esta obligada a implementra  los metodos abstrac de la interfaces que implementa
public abstract class Persona implements Identificable {
    
     private String nombre;
     private String apellido;
     private String nif;
     private String direccion;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String nif, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nif = nif;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", nif=").append(nif);
        sb.append(", direccion=").append(direccion);
        sb.append('}');
        return sb.toString();
    }
     
     
    
    
    
}
