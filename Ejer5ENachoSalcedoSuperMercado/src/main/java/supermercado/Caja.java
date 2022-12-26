/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercado;

import java.util.ArrayList;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author Windows10
 */
public class Caja {

    private String IdCaja;

    private ArrayList<Producto> cinta;

    public Caja(String IdCaja) {
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
                tmp += p.toString() + "\n";
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
    
    
}
