/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea6c;

/**
 *
 * @author nacho
 */
public class LibroDigital extends Libro  implements SeDescarga{
    
    private int numKbytes;

    public LibroDigital(int numKbytes, String isbn, int codigo, double precio, double iva, String descripcion) {
        super(isbn, codigo, precio, iva, descripcion);
        this.numKbytes = numKbytes;
    }

    public int getNumKbytes() {
        return numKbytes;
    }

    public void setNumKbytes(int numKbytes) {
        this.numKbytes = numKbytes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
        sb.append("LibroDigital{");
        sb.append("numKbytes=").append(numKbytes);
        sb.append('}');
        return sb.toString();
    }
    
    

    @Override
    public void descargar() {
        System.out.println("http://NachoSalcedo.daw/"+this.hashCode());
    }
    
}
