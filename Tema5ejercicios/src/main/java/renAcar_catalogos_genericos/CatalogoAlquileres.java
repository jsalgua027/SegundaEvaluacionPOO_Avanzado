/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package renAcar_catalogos_genericos;

import rentAcar.*;

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
    
    
}
