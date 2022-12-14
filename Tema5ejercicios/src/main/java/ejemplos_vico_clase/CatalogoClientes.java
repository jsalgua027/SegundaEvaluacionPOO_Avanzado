/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos_vico_clase;

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

            this.listaClientes[i] = Cliente.generarCliente();

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
    public int buscarCliente(Cliente c) {

        for (int i = 0; i < listaClientes.length; i++) {
            if (c.equals(this.listaClientes[i])) {
                return i;
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
    public boolean borrarCliente(Cliente c){
    int posicion=buscarCliente(c);
    if(posicion>=0){
    this.numeroClientes--;
    this.listaClientes[posicion]=null;
    return true;
    }
    return false;
    }

}
