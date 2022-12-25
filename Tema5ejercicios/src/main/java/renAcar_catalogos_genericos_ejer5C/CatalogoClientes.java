/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package renAcar_catalogos_genericos_ejer5C;

import rentAcar.*;

/**
 *
 * @author nacho
 */
public class CatalogoClientes extends Catalogo<Cliente> {

    public CatalogoClientes(int tamanio) {
        super(tamanio);
        for (int i = 0; i < tamanio; i++) {
            this.añadirElemento(new Cliente());
        }

    }

    public Cliente buscarCliente(String nif) {
        //creo un dato con clientes aleatorios
        Cliente aux = new Cliente();
        aux.setNIF(nif); //fuezo a que el cliente tenga el nif que busco
        int posicion = buscarElemento(aux);

        return (posicion >= 0) ? this.lista.get(posicion) : null;

    }
}