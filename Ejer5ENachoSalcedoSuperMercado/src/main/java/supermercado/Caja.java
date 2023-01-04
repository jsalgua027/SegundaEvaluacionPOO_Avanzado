/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercado;

import java.util.ArrayList;
import java.util.Objects;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author Windows10
 */
public class Caja {

    private String IdCaja;

    private ArrayList<Producto> cinta;

    public Caja() {
        this.IdCaja = RandomStringUtils.randomAlphanumeric(2);

        this.cinta = new ArrayList<>();

    }

    public String getIdCaja() {
        return IdCaja;
    }

    public void setIdCaja(String IdCaja) {
        this.IdCaja = IdCaja;
    }

    public ArrayList<Producto> getCinta() {
        return cinta;
    }

    public void setCinta(ArrayList<Producto> cinta) {
        this.cinta = cinta;
    }

    @Override
    public String toString() {

        String tmp = "";

        for (Producto p : cinta) {
            if (p != null) {
                tmp += p.ToString2()+ "\n";
            }

        }

        return tmp;
    }

    // numero de productos
    public int getNumeroProductos() {
        return this.cinta.size();

    }

    //añadir producto
    public void añadirProducto(Producto p) {
        this.cinta.add(p);

    }

    // buscar producto
    public int buscarProducto(Producto p) {
        if (p != null) {
            for (int i = 0; i < this.cinta.size(); i++) {
                if (p.equals(this.cinta.get(i))) {
                    return i;
                }
            }

        }
        return -1;

    }

    //quitar producto
    public boolean quitarProducto(Producto p) {
        int posicion = buscarProducto(p);
        if (posicion >= 0) {
            this.cinta.remove(p);
            return true;
        }
        return false;
    }

    
    // esta vacia la cinta?
    public boolean estaVacia(){
    return this.cinta.isEmpty();
    }

    
    // generar ticket
    public Ticket generarTicket(){
    Ticket aux = new Ticket(this.cinta);
    return aux;
    }
    
    
    
    
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.IdCaja);
        hash = 31 * hash + Objects.hashCode(this.cinta);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Caja other = (Caja) obj;
        return Objects.equals(this.IdCaja, other.IdCaja);
    }
    
    
    
    
}
