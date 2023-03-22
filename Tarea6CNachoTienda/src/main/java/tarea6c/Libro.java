/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea6c;

/**
 *
 * @author nacho
 */
public  abstract  class Libro extends Producto  implements Comparable<Libro>{
    
    private String isbn;

    public Libro(String isbn, int codigo, double precio, double iva, String descripcion) {
        super(codigo, precio, iva, descripcion);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
        sb.append("Libro{");
        sb.append("isbn=").append(isbn);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Libro o) {
       return this.isbn.compareToIgnoreCase(o.getIsbn());
    }
    
    abstract void tipoLibro();
    
}
