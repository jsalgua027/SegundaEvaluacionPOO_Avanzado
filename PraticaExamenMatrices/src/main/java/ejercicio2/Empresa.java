/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import ejercicio1.Trabajador;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Windows10
 */
public class Empresa {

    private List<Trabajador> listaTrabajadores;
    private String nombreEmpresa;
    private String cif;

    public Empresa(String nombreEmpresa, String cif) {
        this.listaTrabajadores = new ArrayList<Trabajador>();
        this.nombreEmpresa = nombreEmpresa;
        this.cif = cif;
    }

    public List<Trabajador> getListaTrabajadores() {
        return listaTrabajadores;
    }

    public void setListaTrabajadores(List<Trabajador> listaTrabajadores) {
        this.listaTrabajadores = listaTrabajadores;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.cif);
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

    // metodo imprimir
    public void imprimir() {

       System.out.println("La empresa: " + this.nombreEmpresa + "con el cif: " + this.cif + " Y los trabajadores: "
        );
        this.listaTrabajadores.forEach(System.out::println);

    }

    // metodo contrata
    public void contratar(Trabajador t) {
        this.listaTrabajadores.add(t);

    }

    // despedir trabjador 
    public void despedir(Trabajador t) {

        this.listaTrabajadores.remove(t);
    }

    // buscar metodos por nombre pero busqueda secuencial
    public List<Integer> buscarTodosPorNombre(String nombre) {
        List<Integer> aux = new ArrayList();
        for (int i = 0; i < this.listaTrabajadores.size(); i++) {
            if (this.listaTrabajadores.get(i).getNombre().equalsIgnoreCase(nombre)) {
                aux.add(this.listaTrabajadores.indexOf(this.listaTrabajadores.get(i)));
            }

        }

        return aux;
    }

    // ordenacion por nombre <<Comparator>>
    public void ordenarNombre() {
        Collections.sort(listaTrabajadores);

    }
    // busqueda binaria

    public int buscarPorNombre(Trabajador t) {
        int posicion = 0;
        posicion = Collections.binarySearch(listaTrabajadores, t);

        return posicion;
    }

}
