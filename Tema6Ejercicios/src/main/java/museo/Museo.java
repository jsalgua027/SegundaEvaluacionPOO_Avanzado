/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

import java.util.List;

/**
 *
 * @author Windows10
 */
public class Museo {

    private String nombre;
    private String direccion;
    private List<Empleado> listaEmpleados;
    private List<Sala> listaSalas;

    public Museo() {
    }

    public Museo(String nombre, String direccion, List<Empleado> listaEmpleados, List<Sala> listaSalas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.listaEmpleados = listaEmpleados;
        this.listaSalas = listaSalas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public List<Sala> getListaSalas() {
        return listaSalas;
    }

    public void setListaSalas(List<Sala> listaSalas) {
        this.listaSalas = listaSalas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Museo{");
        sb.append("nombre=").append(nombre);
        sb.append(", direccion=").append(direccion);
        sb.append(", listaEmpleados=").append(listaEmpleados);
        sb.append(", listaSalas=").append(listaSalas);
        sb.append('}');
        return sb.toString();
    }

    public void contratar(Empleado aux) {

        this.listaEmpleados.add(aux);
    }

    public void despedir(Empleado aux) {

        this.listaEmpleados.remove(aux);

    }

    public void añadirSala(Sala aux) {

        this.listaSalas.add(aux);
    }

    public void quitarSala(Sala aux) {

        this.listaSalas.remove(aux);
    }

}
