/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa_catalogos;

import java.util.Objects;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author nacho
 *
 * ejercicio clase empresa cif nombre catalofo vehiculo catalogo cliente
 * catalogo alquileres metodos: registrar un cliente registrar vehiculo buscar
 * cliente(nif) buscar vehiculo(bastidor)
 *
 */
public class Empresa {

    private String cif;
    private String nombre;
    private CatalogoVehiculos catalogoVehiculos;
    private CatalogoClientes catalogoClientes;
    private CatalogoAlquileres catalogoAlquileres;

    public Empresa() {
    }

    public Empresa(String nombre) {
        this.cif = RandomStringUtils.randomAlphanumeric(8);
        this.nombre = nombre;

        this.catalogoVehiculos = new CatalogoVehiculos(10);
        this.catalogoClientes = new CatalogoClientes(10);
        this.catalogoAlquileres = new CatalogoAlquileres(10);
    }

    public String getCif() {
        return cif;
    }

    public String getNombre() {
        return nombre;
    }

    public CatalogoVehiculos getCatalogoVehiculos() {
        return catalogoVehiculos;
    }

    public CatalogoClientes getCatalogoClientes() {
        return catalogoClientes;
    }

    public CatalogoAlquileres getCatalogoAlquileres() {
        return catalogoAlquileres;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empresa{");
        sb.append("cif=").append(cif);
        sb.append(", nombre=").append(nombre);
        sb.append(", catalogoVehiculos=").append(catalogoVehiculos);
        sb.append(", catalogoClientes=").append(catalogoClientes);
        sb.append(", catalogoAlquileres=").append(catalogoAlquileres);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.cif);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empresa other = (Empresa) obj;
        return Objects.equals(this.cif, other.cif);
    }

    // registar Cliente
    public  void registarCliente() {
        Cliente aux = new Cliente();
        this.catalogoClientes.añadirCliente(aux);

    }
    
    // registrar vehiculo
    
     public  void registarVehiculo() {
        Vehiculo aux = new Vehiculo();
        this.catalogoVehiculos.añadirVehiculo(aux);

    }
    
    // buscar cliente
     public Cliente buscarCliente ( String nif){
     
    return  this.catalogoClientes.buscarCliente(nif);
     
     }
     
     // buscar vehiculo por bastidor 
     
     public Vehiculo buscarVehiculo ( String bastidor){
     
     return this.catalogoVehiculos.buscarVehiculo(bastidor);
     
     }
     
     
}
