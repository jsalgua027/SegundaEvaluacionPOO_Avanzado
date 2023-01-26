/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoria_composicio_clases_coche;

/**
 *
 * @author nacho
 */
public class Ventana {
    
    private boolean estado; // abierta o cerrada

    public Ventana(boolean estado) {
        this.estado = estado;
    }

    public boolean getEstado() {
        return estado;
    }


    
    
    public void abrir(){
    
    this.estado=true;
    }
    
    
    public void cerrar(){
    
    this.estado=false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ventana{");
        sb.append("estado=").append(estado);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
}
