/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa_catalogos;

/**
 *
 * @author nacho
 */
public class CatalogoClientes {

    private int numeroClientes;

    private Cliente[] listaClientes;

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
        this.numeroClientes = tamanio;

        this.listaClientes = new Cliente[tamanio];
        for (int i = 0; i < listaClientes.length; i++) {

            this.listaClientes[i] = new Cliente();

        }
    }

    @Override
    public String toString() {

        String tmp = "";

        for (Cliente c : listaClientes) {
            if (c != null) {
                tmp += c.toString() + "\n";
            }

        }

        return tmp;
    }

    // para saber el numero clientes
    public int getNumeroClientes() {

        return numeroClientes;
    }

    // buscar un cliente
    private int buscarCliente(Cliente c) {
        if (c != null) {

            for (int i = 0; i < listaClientes.length; i++) {
                if (this.listaClientes != null && c.equals(this.listaClientes[i])) { //ojo con los null con esta condicion lo controlo
                    return i;
                }
            }
        }

        return -1;

    }

    public void añadirCliente(Cliente c) {

        if (this.numeroClientes < this.listaClientes.length) {
            for (int i = 0; i < this.listaClientes.length; i++) {
                if (this.listaClientes[i] == null) {
                    this.listaClientes[i] = c;
                    this.numeroClientes++;
                    break;

                }
            }

        } else {
            this.numeroClientes++;
            this.listaClientes = copiar();
            this.listaClientes[this.numeroClientes - 1] = c;
        }

    }

    //metodo copiar privado
    private Cliente[] copiar() {

        Cliente[] aux = new Cliente[this.listaClientes.length + 1];

        for (int i = 0; i < this.listaClientes.length; i++) {
            aux[i] = this.listaClientes[i];
        }

        return aux;
    }

    //borrar clientes
    public boolean borrarCliente(Cliente c) {
        int posicion = buscarCliente(c);
        if (posicion >= 0) {

            this.listaClientes[posicion] = null;
            this.numeroClientes--;
            return true;
        }
        return false;
    }

    public Cliente buscarCliente(String nif) {
        //creo un dato con clientes aleatorios
        Cliente aux = new Cliente();
        aux.setNIF(nif); //fuezo a que el cliente tenga el nif que busco
        int posicion = buscarCliente(aux);

        return (posicion >= 0) ? this.listaClientes[posicion] : null;

    }

}
