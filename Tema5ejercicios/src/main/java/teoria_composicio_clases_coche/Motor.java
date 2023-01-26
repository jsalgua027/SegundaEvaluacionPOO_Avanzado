/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoria_composicio_clases_coche;

/**
 *
 * @author nacho
 */
public class Motor {
    
    
    private int cc;
    private boolean estado;// encendido true;

    public Motor(int cc, boolean estado) {
        this.cc = cc;
        this.estado = estado;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public boolean getEstado() {
        return estado;
    }

  public void arrancar(){
  this.estado=true;
  
  }
  
  public void apagar(){
  this.estado=false;
  
  }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Motor{");
        sb.append("cc=").append(cc);
        sb.append(", estado=").append(estado);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
