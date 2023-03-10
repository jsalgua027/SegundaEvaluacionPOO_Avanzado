/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13_interfaces;

/**
 *
 * @author nacho
 */
public abstract class Profesor extends Persona {
    
    
     private String especialidad;

    public Profesor(String especialidad, String nombre, String apellido, String nif, String direccion) {
        super(nombre, apellido, nif, direccion);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Profesor{");
        sb.append("especialidad=").append(especialidad);
        sb.append('}');
        return sb.toString();
    }
     
         @Override
     public final void identificable(){
         System.out.println("Soy un profesor");
     
     }
     
     
}
