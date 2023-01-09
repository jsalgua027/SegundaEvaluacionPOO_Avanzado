/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package renAcar_catalogos_genericos_ejer5C;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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
        this.catalogoAlquileres = new CatalogoAlquileres(0);
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
        sb.append("\n---------------- ");
        sb.append("\nEmpresa: ");
        sb.append("\nCIF: ").append(cif);
        sb.append("\nNombre empresa: ").append(nombre);
        sb.append("\nCatalogo de Vehiculos: ").append(catalogoVehiculos);
        sb.append("\nCatalogo de Clientes: ").append(catalogoClientes);
        sb.append("\nCatalogo de Alquileres: ").append(catalogoAlquileres);
        sb.append("\n---------------- ");
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
    public void registarCliente() {
        Cliente aux = new Cliente();
        this.catalogoClientes.añadirElemento(aux);

    }

    // registar Cliente
    public void registarCliente(Cliente aux) {
        //  Cliente aux = new Cliente();
        this.catalogoClientes.añadirElemento(aux);

    }

    // registrar vehiculo
    public void registarVehiculo() {
        Vehiculo aux = new Vehiculo();
        this.catalogoVehiculos.añadirElemento(aux);

    }

    // registrar vehiculo
    public void registarVehiculo(Vehiculo aux) {
        //Vehiculo aux = new Vehiculo();
        this.catalogoVehiculos.añadirElemento(aux);

    }

    // buscar cliente
    public Cliente buscarCliente(String nif) {

        return this.catalogoClientes.buscarCliente(nif);

    }

    // buscar vehiculo por bastidor 
    public Vehiculo buscarVehiculo(String bastidor) {

        return this.catalogoVehiculos.buscarVehiculo(bastidor);

    }

    // registrar alquileres tiene que buscar cliente, buscar vehiculo y que este disponible el vehiculo registramos el alquiler
    // registroAlquiler(fecha, numero dias)
    public boolean registroAlquiler(String nif, String bastidor, LocalDate fechaInico, int numeroDias) {
        Cliente auxCli = this.catalogoClientes.buscarCliente(nif);
        Vehiculo auxVe = this.catalogoVehiculos.buscarVehiculo(bastidor);
        if (auxCli != null && auxVe != null && auxVe.isDisponible() == true) {

            this.catalogoAlquileres.añadirElemento(new Alquiler(auxCli, auxVe, fechaInico, numeroDias));
            auxVe.setDisponible(false);
            return true;
        }

        return false;

    }

    public boolean registrarAlquiler(Alquiler a) {
        return true;

    }

//recibirVehiculo( Alquiler a) coje el vehiculo y lo pone en disponible
    public void recibirVehiculo(Alquiler a) {

        if (this.catalogoAlquileres.buscarAlquiler(a.getAlquilerID()) != null) {
            a.getVehiculo().setDisponible(true);

        }

    }

    // Borrar un alquiler por id.
    public void borrarAlquiler(int id) {
        Alquiler aux = new Alquiler();
        aux.setAlquilerID(id);
        if (this.catalogoAlquileres.buscarElemento(aux) >= 0) {

            this.catalogoAlquileres.borrarElemento(aux);
        }

    }

    //Borrar un cliente del catálogo, si no tiene alquileres grabados.
    public void borrarClienteCatalogo(Cliente c) {
        Alquiler aux = new Alquiler();
        aux.setCliente(c);

        for (int i = 0; i < this.catalogoAlquileres.lista.size(); i++) {
            if (!this.catalogoAlquileres.lista.get(i).getCliente().getNIF().equals(aux.getCliente().getNIF()) ){
              
                       this.catalogoClientes.borrarElemento(c);
                    
                
               
              //  break;
            } else {
              System.out.println("El cliente tiene alquileres");
               
            }

        }
    }
    //Borrar un vehículo del catálogo, si no tiene alquileres grabados

    public void borraVehiculoCatalogo(Vehiculo v) {
        Alquiler aux = new Alquiler();
        aux.setVehiculo(v);
        if (this.catalogoAlquileres.buscarElemento(aux) < 0) {
            catalogoVehiculos.borrarElemento(v);

        } else {
            System.out.println("El vehiculo tiene alquileres");
        }
    }

}
