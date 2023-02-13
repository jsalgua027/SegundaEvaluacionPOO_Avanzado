/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanaAbstracta;

/**
 *
 * @author nacho
 */
public class VCorredera extends Ventana {

    private int longApertura;

    public VCorredera() {
    }

    public VCorredera(int longApertura, boolean estado) {
        super(estado);
        this.longApertura = longApertura;
    }

    public int getLongApertura() {
        return longApertura;
    }

    public void setLongApertura(int longApertura) {
        this.longApertura = longApertura;
    }
    
    
    
    
    
    @Override
    public void abrir(int numero) {
        
        this.setEstado(true);
        this.longApertura=numero;
      
    }

    @Override
    public void cerrar(int numero) {
        
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VCorredera{");
        sb.append("longApertura=").append(longApertura);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
