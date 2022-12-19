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
public class CatalogoVehiculos {

    private List<Vehiculo> lista;

    // el construcutor recibe el tamaño del catalogo
    //inicializa la estructura de datos con vehiuclos aleatorios
    public CatalogoVehiculos(int tamanio) {

        tamanio = Math.abs(tamanio);

        this.lista = new ArrayList<>(tamanio);// creo estructura
        for (int i = 0; i < tamanio; i++) {

            this.lista.add(new Vehiculo());// meto vehiculos en la estructura

        }

    }

//    public void mostrarCatalogo() {
//
//        for (Vehiculo v : listaVehiculos) {
//            System.out.println(v);
//        }
//          }
    //ojo que hay que controlar los null para que no de error
    @Override
    public String toString() {

        String tmp = "";

        for (Vehiculo v : this.lista) {

            tmp += v.toString() + "\n";

        }

        return tmp;
    }

    //numero de vehiculos, no el tamaño del array
    public int getNumeroVehiculos() {
        return this.lista.size();
    }

    // busqueda secuencial
    public boolean borrarVehiculo(Vehiculo v) {
        int posicion = buscarVehiculo(v);
        if (posicion >= 0) {

            this.lista.remove(posicion);
            return true;
        }
        return false;
    }
    // te da la posicion si se encuntra el objeto

    public int buscarVehiculo(Vehiculo v) {
        if (v != null) {
            for (int i = 0; i < this.lista.size(); i++) {
                if (v.equals(this.lista.get(i))) {
                    return i;

                }
            }
        }

        return -1;
    }

    public void añadirVehiculo(Vehiculo v) {

        this.lista.add(v);

    }

    public Vehiculo buscarVehiculo(String bastidor) {
        //creo un dato con clientes aleatorios
        Vehiculo aux = new Vehiculo();
        aux.setBastidor(bastidor); //fuezo a que el cliente tenga el nif que busco
        int posicion = buscarVehiculo(aux);

        return (posicion >= 0) ? this.lista.get(posicion) : null;

    }

}
