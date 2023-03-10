/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13_interfaces;

/**
 *
 * @author nacho
 */
public class Estudante extends Persona {
    
    private String  id;

    public Estudante(String id, String nombre, String apellido, String nif, String direccion) {
        super(nombre, apellido, nif, direccion);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Estudante{");
        sb.append("id=").append(id);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
    public void estudiar(){
    
        System.out.println("Estudio poco");
    
    }
    

    @Override
    public void identificable() {
        System.out.println("Soy un Estudiante");
       
    }

 
    
    
    
}
