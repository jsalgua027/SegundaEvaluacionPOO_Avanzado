/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RepasoListasCasaChatGpt;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Windows10
 */
public class Venta {
     private List<Producto> productos;
   private LocalDate fecha;
   private double total;

   public Venta(List<Producto> productos, LocalDate fecha) {
       this.productos = productos;
       this.fecha = fecha;
       this.total = calcularTotal();
   }

   public List<Producto> getProductos() {
       return productos;
   }

   public LocalDate getFecha() {
       return fecha;
   }

   public double getTotal() {
       return total;
   }

   private double calcularTotal() {
       double total = 0;
       for (Producto producto : productos) {
           total += producto.getPrecio() * producto.getCantidad();
       }
       return total;
   }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Venta{");
        sb.append("productos=").append(productos);
        sb.append(", fecha=").append(fecha);
        sb.append(", total=").append(total);
        sb.append('}');
        return sb.toString();
    }
   
   
   
   
}
