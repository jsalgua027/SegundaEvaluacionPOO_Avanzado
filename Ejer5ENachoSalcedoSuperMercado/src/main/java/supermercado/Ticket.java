/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercado;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/**
 *
 * @author Windows10
 */
public class Ticket {

    private LocalDate fecha;
    private LocalTime hora;
    private ArrayList<Producto> listaProductos;

    public Ticket() {
    }

    public Ticket(ArrayList<Producto> listaProductos) {
        this.fecha = LocalDate.now();
        this.hora = LocalTime.now();
        this.listaProductos = listaProductos;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public int catindadProductoiguales() {
        int contador = 0;
       ArrayList<Producto> aux= new ArrayList<>();

        Collections.sort(this.listaProductos, (p1,p2)-> p1.nombre().compareToIgnoreCase(p2.nombre()));
        
        for (int i = 0; i < this.listaProductos.size(); i++) {
            for (int j = 0; j < this.listaProductos.size(); j++) {
                if (this.listaProductos.get(i).equals(this.listaProductos.get(j))) {
                    aux.add(this.listaProductos.get(i));
                }
            }
           
        }

        return  contador=aux.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ticket{");
        sb.append("fecha=").append(fecha);
        sb.append(", hora=").append(hora);
        sb.append(", listaProductos=").append(listaProductos);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.fecha);
        hash = 83 * hash + Objects.hashCode(this.hora);
        hash = 83 * hash + Objects.hashCode(this.listaProductos);
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
        final Ticket other = (Ticket) obj;
        if (!Objects.equals(this.fecha, other.fecha)) {
            return false;
        }
        return Objects.equals(this.hora, other.hora);
    }

}
