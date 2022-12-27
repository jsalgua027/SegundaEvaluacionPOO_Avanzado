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
 * @param <T>
 */
//clase generica
public class Catalogo<T> {

    protected List<T> lista;

    // el construcutor recibe el tamaño del catalogo
    //inicializa la estructura de datos con vehiuclos aleatorios
    public Catalogo(int tamanio) {

        tamanio = Math.abs(tamanio);

        this.lista = new ArrayList<>(tamanio);// creo estructura
        //lisa.size()es cero hasta que hagas un add
    }

    public List<T> getLista() {
        return lista;
    }

    @Override
    public String toString() {

        String tmp = "";

        for (T objeto : this.lista) {

            tmp += objeto.toString() + "\n";

        }

        return tmp;
    }

    //numero de vehiculos, no el tamaño del array
    public int getNumeroElementos() {
        return this.lista.size();
    }

    // busqueda secuencial
    public boolean borrarElemento(T elemento) {
        int posicion = buscarElemento(elemento);
        if (posicion >= 0) {

            this.lista.remove(posicion);
            return true;
        }
        return false;
    }
    // te da la posicion si se encuntra el objeto

    public int buscarElemento(T elemento) {
        if (elemento != null) {
            for (int i = 0; i < this.lista.size(); i++) {
                if (elemento.equals(this.lista.get(i))) {
                    return i;

                }
            }
        }

        return -1;
    }

    public void añadirElemento(T elemeto) {

        this.lista.add(elemeto);

    }

    public List<Alquiler> alquiCliente(String nif) {
        List<Alquiler> listaClientes = new ArrayList<Alquiler>();
        Alquiler aux = new Alquiler();
        Cliente clienteAuc = new Cliente();
        clienteAuc.setNIF(nif);

        for (int i = 0; i < this.lista.size(); i++) {
            if (lista.contains(aux.getCliente().getNIF())) {
                 listaClientes.add(aux);
            } 
               
            

        }
        return listaClientes;
    }

    public List<Alquiler> listaAlquilerVehiculo(String bastidor) {
        List<Alquiler> listaVehiculos = new ArrayList<Alquiler>();
        Alquiler aux = new Alquiler();
        Vehiculo vehiculoAux = new Vehiculo();

        for (int i = 0; i < this.lista.size(); i++) {
            if (lista.contains(aux.getVehiculo().getBastidor())) {
                listaVehiculos.add(aux);
            }

        }
        return listaVehiculos;

    }
    
//     public List<Vehiculo> buscarVehiculoPorFecha(LocalDate fecha){
//         List
//         
//         
//   
//   } 
    
    

}
