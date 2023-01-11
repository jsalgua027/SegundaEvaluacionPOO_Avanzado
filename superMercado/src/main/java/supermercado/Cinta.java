/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercado;

import java.util.ArrayList;

/**
 *
 * @author nacho
 */
public class Cinta {

    private ArrayList<Producto> listaProductos;

    public Cinta() {
        this.listaProductos = new ArrayList<>();
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Cinta{");
//        sb.append("cinta=").append(listaProductos);
//        sb.append('}');
//        return sb.toString();
//    }

    // numero de productos
    public int getNumeroProductos() {
        return this.listaProductos.size();

    }

    //añadir producto
    public void añadirProducto(Producto p) {
        this.listaProductos.add(p);

    }

    // buscar producto
    public int buscarProducto(Producto p) {
        if (p != null) {
            for (int i = 0; i < this.listaProductos.size(); i++) {
                if (p.equals(this.listaProductos.get(i))) {
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
            this.listaProductos.remove(p);
            return true;
        }
        return false;
    }

    // esta vacia la listaProductos?
    public boolean estaVacia() {
        return this.listaProductos.isEmpty();
    }

      public String impresionListadoProductos() {
        String tmp = "";
        for (int i = 0; i < this.listaProductos.size(); i++) {
            tmp += this.listaProductos.get(i).ToString2() + "\n";
        }
        return tmp;
    }
    
    
}
