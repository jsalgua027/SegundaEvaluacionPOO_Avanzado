/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos_vico_clase;

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

    public void mostrarCatalogo() {

        for (Vehiculo v : listaVehiculos) {
            System.out.println(v);
        }

    }

    public int getNumeroVehiculos() {
        return numeroVehiculos;
    }

    public void borrarVehiculo(Vehiculo v) {
            int posicion= buscarVehiculo(v);
            if (posicion>=0){
            
            this.listaVehiculos[posicion]=null;
            
            }
            
    }

    public int buscarVehiculo(Vehiculo v) {

        for (int i = 0; i < this.listaVehiculos.length; i++) {
            if (v.equals(this.listaVehiculos[i])) {
                return i;

            }
        }
        return -1;
    }

    public Vehiculo[] getListaVehiculos() {
        return listaVehiculos;
    }
    
    
    
    

}
