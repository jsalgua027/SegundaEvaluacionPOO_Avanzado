/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea6c;

/**
 *
 * @author nacho
 */
public final  class Pantalon extends Ropa {
    
    private double talla;

    public Pantalon(double talla, String marca, int codigo, double precio, double iva, String descripcion) {
        super(marca, codigo, precio, iva, descripcion);
        this.talla = talla;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
        sb.append("Pantalon{");
        sb.append("talla=").append(talla);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void enviar(String direccion) {
        System.out.println("La direccion de enio del pedido es: "
        + direccion+ " y el producto es: "+super.toString());
        
    }
    
    
    
}
