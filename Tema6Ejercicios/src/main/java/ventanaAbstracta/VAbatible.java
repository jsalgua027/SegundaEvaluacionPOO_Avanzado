/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanaAbstracta;

/**
 *
 * @author nacho
 */
public class VAbatible extends Ventana {
    
    private int gradosApertura;

    public VAbatible(int gradosApertura, boolean estado) {
        super(estado);
        this.gradosApertura = gradosApertura;
    }

    public VAbatible() {
    }

    public int getGradosApertura() {
        return gradosApertura;
    }

    public void setGradosApertura(int gradosApertura) {
        this.gradosApertura = gradosApertura;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vabatible{");
        sb.append("gradosApertura=").append(gradosApertura);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void abrir(int numero) {
        // hay que inidcar que esta abierta y  los grados  de apertura
        // los grados se calculan dividiendo el numero entre dos 
        this.setEstado(true);// accedo al atributo de la clase padre para cambiar el estado gracias al set
       this.gradosApertura=numero/2;
    }

    @Override
    public void cerrar(int numero) {
           this.setEstado(false);// accedo
          this.gradosApertura=numero/2;
    }
    
    
  
    
}
