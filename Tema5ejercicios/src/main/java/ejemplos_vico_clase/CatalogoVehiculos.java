/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos_vico_clase;

import java.util.Arrays;

/**
 *
 * @author nacho
 */
public class CatalogoVehiculos {

    private int numeroVehiculos;

    private Vehiculo[] listaVehiculos;

    // el construcutor recibe el tamaño del catalogo
    //inicializa la estructura de datos con vehiuclos aleatorios
    public CatalogoVehiculos(int tamanio) {

        tamanio = Math.abs(tamanio);
        this.numeroVehiculos = tamanio;

        this.listaVehiculos = new Vehiculo[tamanio];// creo estructura
        for (int i = 0; i < listaVehiculos.length; i++) {

            this.listaVehiculos[i] = new Vehiculo();// meto vehiculos en la estructura

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

        for (Vehiculo v : listaVehiculos) {
            if (v != null) {
                tmp += v.toString() + "\n";
            }

        }

        return tmp;
    }

    //numero de vehiculos, no el tamaño del array
    public int getNumeroVehiculos() {
        return numeroVehiculos;
    }

    // busqueda secuencial
    public boolean borrarVehiculo(Vehiculo v) {
        int posicion = buscarVehiculo(v);
        if (posicion >= 0) {
            this.numeroVehiculos--;

            this.listaVehiculos[posicion] = null;
            return true;
        }
        return false;
    }
    // te da la posicion si se encuntra el objeto

    public int buscarVehiculo(Vehiculo v) {
            if(v != null){
             for (int i = 0; i < this.listaVehiculos.length; i++) {
            if (v.equals(this.listaVehiculos[i])) {
                return i;

            }
        }
            }
       
        return -1;
    }

    public void añadirVehiculo(Vehiculo v) {

        //si hay hueco se inserta en el hueco 
        if (this.numeroVehiculos < this.listaVehiculos.length) {
            for (int i = 0; i < this.listaVehiculos.length; i++) {
                if (this.listaVehiculos[i] == null) {

                    this.listaVehiculos[i] = v;
                    this.numeroVehiculos++;
                    System.out.println("Guardando vehiculos en posicion " + i);
                    break;//cuando encuntra el hueco añade y se para
                }
            }

        } else {//El array esra lleno
            // Vehiculo[] nuevo= Arrays.copyOf(listaVehiculos, ++numeroVehiculos);//dos opciones
            this.numeroVehiculos++;//le sumo uno al tamaño
           // this.listaVehiculos = Arrays.copyOf(listaVehiculos, this.numeroVehiculos);
            this.listaVehiculos=copiar();
                    
            this.listaVehiculos[this.numeroVehiculos - 1] = v;

        }

    }

    //metodo copiar privado
    private  Vehiculo[]  copiar (){
        
        Vehiculo[] aux = new Vehiculo[this.listaVehiculos.length+1];
        
        for (int i = 0; i < this.listaVehiculos.length; i++) {
            aux[i]=this.listaVehiculos[i];
        }
        
        return aux;
    }
    
    
    public Vehiculo[] getListaVehiculos() {
        return listaVehiculos;
    }
    
    
    public Vehiculo buscarVehiculo(String bastidor) {
        //creo un dato con clientes aleatorios
        Vehiculo aux = new Vehiculo();
        aux.setBastidor(bastidor); //fuezo a que el cliente tenga el nif que busco
        int posicion = buscarVehiculo(aux);

        return (posicion >= 0) ? this.listaVehiculos[posicion] : null;

    }
    
    
}
