/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos_vico_clase;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author nacho
 * 
 * ejercicio
 * clase empresa
 * cif
 * nombre
 * catalofo vehiculo
 * catalogo cliente
 * catalogo alquileres
 * metodos:
 * registrar un cliente
 * registrar vehiculo
 * buscar cliente(nif)
 * buscar vehiculo(bastidor)
 * 
 */
public class Empresa {
    
    private String cif;
    private String nombre;
    private CatalogoVehiculos[] catalogoVehiculos;
    private CatalogoClientes[] catalogoClientes;
    private CatalogoAlquileres[] catalogoAlquileres;

    public Empresa( String nombre, CatalogoVehiculos[] catalogoVehiculos, CatalogoClientes[] catalogoClientes, CatalogoAlquileres[] catalogoAlquileres) {
        this.cif = RandomStringUtils.randomAlphanumeric(8);
        this.nombre = nombre;
        this.catalogoVehiculos = catalogoVehiculos;
        this.catalogoClientes = catalogoClientes;
        this.catalogoAlquileres = catalogoAlquileres;
    }
    
    
    
    
    
    
}
