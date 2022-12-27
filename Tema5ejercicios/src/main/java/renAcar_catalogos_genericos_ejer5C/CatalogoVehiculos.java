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
public class CatalogoVehiculos extends Catalogo <Vehiculo>{
    
    
    public CatalogoVehiculos (int tamanio){
    super (tamanio);
        for (int i = 0; i < tamanio; i++) {
            this.añadirElemento(new Vehiculo());
        }
    
    }
    public Vehiculo buscarVehiculo(String bastidor) {
        //creo un dato con clientes aleatorios
        Vehiculo aux = new Vehiculo();
        aux.setBastidor(bastidor); //fuezo a que el cliente tenga el nif que busco
        int posicion = buscarElemento(aux);

        return (posicion >= 0) ? this.lista.get(posicion) : null;

    }
    
  
//    public List<Vehiculo> listaVehiculosFecha(LocalDate fechaEntrega){
//     List
//    
//    }
    
    
//   public List<Alquiler> buscarAlquilerBastidor(String bastidor) {
//        List<Alquiler> listaVehiculos = new ArrayList<Alquiler>();
//        Vehiculo vehiculoAux = new Vehiculo();
//        vehiculoAux.setBastidor(bastidor);
//        for (int i = 0; i < this.lista.size(); i++) {
//            if (this.lista.get(i).getVehiculo().equals(vehiculoAux)) {
//                listaVehiculos.add(this.lista.get(i));
//            }
//        }
//        return listaVehiculos;
//    }
    
}
