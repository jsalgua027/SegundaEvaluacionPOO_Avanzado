/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package renAcar_catalogos_genericos_ejer5C;

import java.time.LocalDate;
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

  
    public Alquiler buscarAlquiler(int id) {
        //crear un alquiler con datos  aleatorios
        Alquiler aux = new Alquiler();
        aux.setAlquilerID(id); //fuezo a que el alquiler tenga el id que busco
        int posicion = buscarElemento(aux);

        return (posicion >= 0) ? this.lista.get(posicion) : null;

    }

    //metodos para devolver una lista de alquleres con ese nif
    public List<Alquiler> buscarAlquilerNif(String nif) {
        List<Alquiler> listaClientes = new ArrayList<Alquiler>();

        Cliente clienteAux = new Cliente();
        clienteAux.setNIF(nif);

        for (int i = 0; i < this.lista.size(); i++) {
            if (this.lista.get(i).getCliente().equals(clienteAux)) {
                listaClientes.add(this.lista.get(i));
            }
        }
        return listaClientes;
    }
// metodo que devuleve lista de alquilres con ese numero de bastidor
    public List<Alquiler> buscarAlquilerBastidor(String bastidor) {
        List<Alquiler> listaVehiculos = new ArrayList<Alquiler>();
        Vehiculo vehiculoAux = new Vehiculo();
        vehiculoAux.setBastidor(bastidor);
        for (int i = 0; i < this.lista.size(); i++) {
            if (this.lista.get(i).getVehiculo().equals(vehiculoAux)) {
                listaVehiculos.add(this.lista.get(i));
            }
        }
        return listaVehiculos;
    }
    
    //metodo que devuelve lista de vehiculos que deben de ser devueltos con la fecha dada
    public List<Vehiculo> vehiculosDevueltos(LocalDate fecha){
    List<Vehiculo> listaVehiculosEntregados= new ArrayList<>();
    Alquiler aux = new Alquiler();
      aux.setFechaEntrega(fecha);
        for (int i = 0; i < this.lista.size(); i++) {
            if(this.lista.get(i).equals(aux)){
            listaVehiculosEntregados.add(this.lista.get(i).getVehiculo());
            
            }
        }
    return listaVehiculosEntregados;
    
    }
    
}
