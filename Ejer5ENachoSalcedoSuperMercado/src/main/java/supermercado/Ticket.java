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

    // metodo que da el importe total con iva de todos los productos
    public double importeTotalTiket() {
        double total = 0;
        //Ticket aux = new Ticket();
        for (int i = 0; i < this.listaProductos.size(); i++) {
            total = total + this.listaProductos.get(i).precioProductoTotalConIva();

        }

        return total;

    }

    public String impresionTicket() {
        String salida
                = """
                        --------------------------------------------------------------------
                                                Supermercado Lola
                            Fecha= %s                    Hora= %s:%s
                        -------------------------------------------------------------------
                        Producto    Precio   Cantidad    IVA    Precio sin IVA
                       %s
                        --------------------------------------------------------------------
                       %s
                       ---------------------------------------------------------------------
                       Total a pagar: %.2f  -- Gracias por su visita.
                        """.formatted(this.fecha, this.hora.getHour(),this.hora.getMinute(),
                                impresionListadoProductos(), impresionPorTipoIva(), importeTotalTiket());

        return salida;

    }
    //impresion de productos parte principal del ticket

    public String impresionListadoProductos() {
        String tmp = "";
        for (int i = 0; i < this.listaProductos.size(); i++) {
            tmp += this.listaProductos.get(i).ToString2() + "\n";
        }
        return tmp;
    }

   
    
    
    
    
    public String impresionPorTipoIva() {
        String tmp = "";
        for (int i = 0; i < this.listaProductos.size(); i++) {
            switch (this.listaProductos.get(i).iva()) {
                case 4 ->
                    tmp += this.listaProductos.get(i).ToString3() + "\n";
                      
                case 10 ->
                    tmp += this.listaProductos.get(i).ToString3() + "\n";
                case 21 ->
                    tmp += this.listaProductos.get(i).ToString3() + "\n";
                default -> {
                }
            }

        }

        return tmp;
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
