/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea6c;

/**
 *
 * @author nacho
 */
public final class LibroPapel extends Libro implements SeEnvia{
    
    private int numeroPaginas;

    public LibroPapel(int numeroPaginas, String isbn, int codigo, double precio, double iva, String descripcion) {
        super(isbn, codigo, precio, iva, descripcion);
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
        sb.append("LibroPapel{");
        sb.append("numeroPaginas=").append(numeroPaginas);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void enviar(String direccion) {
        System.out.println("La direccion de enio del pedido es: "
        + direccion+ " y el producto es: "+super.toString());
    }
    
    
    
}
