/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanaAbstracta;

/**
 *
 * @author nacho
 * 
 * 
 * al ser abstracta es una plantilla, no se hace Ventana v = new Ventana 
 * sino Ventana v = new VAbatible() o los otros tipos
 * 
 * Te obliga a implimentar los metodos de la clase abstracta en la clase hija
 * 
 * 
 * 
 */
public abstract class Ventana {

    private boolean estado;

    public Ventana() {
    }

    public Ventana(boolean estado) {
        this.estado = estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
    
    
    
    // obligas a que se sobreescriba el metodo en las clases que lo heredab
    public  abstract  void abrir(int numero);

     

    public abstract void cerrar(int numero) ;
   

    public boolean isEstado() {
        return estado;
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
