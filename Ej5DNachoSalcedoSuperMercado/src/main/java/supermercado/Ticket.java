/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercado;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author nacho
 */
public class Ticket {

    private LocalDate fecha;
    private LocalTime hora;
    private Caja cajaCobro;
    private int numeroProdutosIva4, numeroProdutosIva10, numeroProdutosIva21;
    private double totalIva4, totalIva10, totalIva21;
    private double totalSinIva4, totalSinIva10, totalSinIva21;

    public Ticket(Caja cajaCobro) {
        this.fecha = LocalDate.now();
        this.hora = LocalTime.now();
        this.cajaCobro = cajaCobro;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public Caja getCajaCobro() {
        return cajaCobro;
    }

    public void setCajaCobro(Caja cajaCobro) {
        this.cajaCobro = cajaCobro;
    }

    
    //metodo que imprime el ticket principal
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
                        """.formatted(this.fecha, this.hora.getHour(), this.hora.getMinute(),
                        cajaCobro.getCinta().impresionListadoProductos(), impresionProductosPorIva(),importeTotalTiket());

        return salida;

    }
// metodo para realizar los calculos de los totales del la segunda parte de impresion del tikect
    private String impresionProductosPorIva() {
    String aux="""
               """;
        for (int i = 0; i < this.cajaCobro.getCinta().getListaProductos().size(); i++) {
            switch (this.cajaCobro.getCinta().getListaProductos().get(i).iva()) {
                case 4 -> {
                    numeroProdutosIva4+=this.cajaCobro.getCinta().getListaProductos().get(i).cantidad();
                    totalSinIva4+=this.cajaCobro.getCinta().getListaProductos().get(i).precioProductoTotalSinIva();
                    totalIva4+=this.cajaCobro.getCinta().getListaProductos().get(i).precioProductoTotalConIva();
                }
                case 10 -> {
                      numeroProdutosIva10+=this.cajaCobro.getCinta().getListaProductos().get(i).cantidad();
                      totalSinIva10+=this.cajaCobro.getCinta().getListaProductos().get(i).precioProductoTotalSinIva();
                      totalIva10+=this.cajaCobro.getCinta().getListaProductos().get(i).precioProductoTotalConIva();
                }
                case 21 -> {
                      numeroProdutosIva21+=this.cajaCobro.getCinta().getListaProductos().get(i).cantidad();
                      totalSinIva21+=this.cajaCobro.getCinta().getListaProductos().get(i).precioProductoTotalSinIva();
                      totalIva21+=this.cajaCobro.getCinta().getListaProductos().get(i).precioProductoTotalConIva();
                }
                default -> {
                }

            }
             
             aux= """
                            Nº prod. iva 4%%:   %d    Precio sin IVA: %.2f       Precio con IVA: %.2f  
                            Nº prod. iva 10%%:  %d    Precio sin IVA: %.2f        Precio con IVA: %.2f  
                            Nº prod. iva 21%%:   %d   Precio sin IVA: %.2f        Precio con IVA: %.2f  
                        """.formatted(numeroProdutosIva4,totalSinIva4,totalIva4,
                                 numeroProdutosIva10,totalSinIva10,totalIva10,
                                 numeroProdutosIva21,totalSinIva21,totalIva21);
            
        }
        return aux;
    }

    
        // metodo que da el importe total con iva de todos los productos
    public double importeTotalTiket() {
        double total = 0;
        //Ticket aux = new Ticket();
        for (int i = 0; i < this.cajaCobro.getCinta().getListaProductos().size(); i++) {
            total = total + this.cajaCobro.getCinta().getListaProductos().get(i).precioProductoTotalConIva();

        }

        return total;

    }

 

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.fecha);
        hash = 97 * hash + Objects.hashCode(this.hora);
        hash = 97 * hash + Objects.hashCode(this.cajaCobro);
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
        return Objects.equals(this.cajaCobro, other.cajaCobro);
    }


}
