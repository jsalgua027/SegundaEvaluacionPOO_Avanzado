/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package renAcar_catalogos_genericos_ejer5C;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nacho
 */
public class CatalogoAlquileres extends Catalogo<Alquiler> {

    public CatalogoAlquileres(int tamanio) {
        super(tamanio);
        for (int i = 0; i < tamanio; i++) {
            this.añadirElemento(new Alquiler());
        }

    }
    
    // estos dos metodos los he pasado a Catalogo

//    public List<Alquiler> alquiCliente(String nif) {
//        List<Alquiler> listaClientes = new ArrayList<Alquiler>();
//        Alquiler aux = new Alquiler();
//        Cliente clienteAuc = new Cliente();
//        clienteAuc.setNIF(nif);
//
//        for (int i = 0; i < this.lista.size(); i++) {
//            if (lista.contains(aux.getCliente().getNIF())) {
//                listaClientes.add(aux);
//            }
//
//        }
//        return listaClientes;
//    }
//
//    public List<Alquiler> listaAlquilerVehiculo(String bastidor) {
//        List<Alquiler> listaVehiculos = new ArrayList<Alquiler>();
//        Alquiler aux = new Alquiler();
//        Vehiculo vehiculoAux = new Vehiculo();
//
//        for (int i = 0; i < this.lista.size(); i++) {
//            if (lista.contains(aux.getVehiculo().getBastidor())) {
//                listaVehiculos.add(aux);
//            }
//
//        }
//        return listaVehiculos;
//
//    }

    public Alquiler buscarAlquiler(int id) {
        //crear un alquiler con datos  aleatorios
        Alquiler aux = new Alquiler();
        aux.setAlquilerID(id); //fuezo a que el alquiler tenga el id que busco
        int posicion = buscarElemento(aux);

        return (posicion >= 0) ? this.lista.get(posicion) : null;

    }

    //metodos de busqueda 
    public Alquiler buscarAlquilerNif(String nif) {
        Alquiler aux = new Alquiler();
        Cliente clienteAux = new Cliente();
        clienteAux.setNIF(nif);
        aux.setCliente(clienteAux);
        int posicion = buscarElemento(aux);
        return (posicion >= 0) ? this.lista.get(posicion) : null;
    }
public Alquiler buscarAlquilerBastidor(String bastidor) {
        Alquiler aux = new Alquiler();
        Vehiculo vehiculoAux = new Vehiculo();
        vehiculoAux.setBastidor(bastidor);
        aux.setVehiculo(vehiculoAux);
        int posicion = buscarElemento(aux);
        return (posicion >= 0) ? this.lista.get(posicion) : null;
    }
}
