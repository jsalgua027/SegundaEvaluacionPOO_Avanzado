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
public class CatalogoClientes {

    private List<Cliente> lista;

//constructor con clientes a null
//    public CatalogoClientes(int tamanio) {
//        tamanio = Math.abs(tamanio);
//        this.numeroClientes = tamanio;
//
//        this.listaClientes = new Cliente[tamanio];
//        for (int i = 0; i < listaClientes.length; i++) {
//
//            this.listaClientes[i] = new Cliente();
//
//        }
//    }
    public CatalogoClientes(int tamanio) {
        tamanio = Math.abs(tamanio);

        this.lista = new ArrayList<>(tamanio);
        for (int i = 0; i < tamanio; i++) {

            this.lista.add(new Cliente());

        }
    }

    @Override
    public String toString() {

        String tmp = "";

        for (Cliente c : this.lista) {

            tmp += c.toString() + "\n";

        }

        return tmp;
    }

    // para saber el numero clientes
    public int getNumeroClientes() {

        return this.lista.size();
    }

    // buscar un cliente
    private int buscarCliente(Cliente c) {
        if (c != null) {

            for (int i = 0; i < lista.size(); i++) {
                if (c.equals(this.lista.get(i))) { //ojo con los null con esta condicion lo controlo
                    return i;
                }
            }
        }

        return -1;

    }

    public void añadirCliente(Cliente c) {

        this.lista.add(c);

    }

    //borrar clientes
    public boolean borrarCliente(Cliente c) {
        int posicion = buscarCliente(c);
        if (posicion >= 0) {

            this.lista.remove(posicion);
            return true;
        }
        return false;
    }

    public Cliente buscarCliente(String nif) {
        //creo un dato con clientes aleatorios
        Cliente aux = new Cliente();
        aux.setNIF(nif); //fuezo a que el cliente tenga el nif que busco
        int posicion = buscarCliente(aux);

        return (posicion >= 0) ? this.lista.get(posicion) : null;

    }

}
