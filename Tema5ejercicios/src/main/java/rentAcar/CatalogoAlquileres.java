/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentAcar;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nacho
 */
public class CatalogoAlquileres {

    private List<Alquiler> lista;

    public CatalogoAlquileres(int tamanio) {
        tamanio = Math.abs(tamanio);
        this.lista= new ArrayList<>(tamanio);
        for (int i = 0; i < tamanio; i++) {
            this.lista.add(new Alquiler());
        }
        

    }

    @Override
    public String toString() {

        String tmp = "";

        for (Alquiler a : lista) {

            tmp += a.toString() + "\n";

        }

        return tmp;
    }

    // para saber el numero clientes
    public int getNumeroAlquileres() {

        return this.lista.size();
    }

    // buscar un cliente
    private int buscarAlquiler(Alquiler c) {
        if (c != null) {

            for (int i = 0; i < lista.size(); i++) {
                if (c.equals(this.lista.get(i))) { //ojo con los null con esta condicion lo controlo
                    return i;
                }
            }
        }

        return -1;

    }

    public void añadirAlquiler(Alquiler a) {
            this.lista.add(a);
    }

   

    //borrar clientes
    public boolean borrarAlquiler(Alquiler c) {
        int posicion = buscarAlquiler(c);
        if (posicion >= 0) {

         this.lista.remove(posicion);
            return true;
        }
        return false;
    }

    public Alquiler buscarAlquiler(int id) {
        //crear un alquiler con datos  aleatorios
        Alquiler aux = new Alquiler();
        aux.setAlquilerID(id); //fuezo a que el alquiler tenga el id que busco
        int posicion = buscarAlquiler(aux);

        return (posicion >= 0) ? this.lista.get(posicion) : null;

    }

}
