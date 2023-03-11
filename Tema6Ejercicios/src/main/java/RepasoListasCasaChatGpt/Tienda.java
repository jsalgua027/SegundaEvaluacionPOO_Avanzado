/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RepasoListasCasaChatGpt;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Windows10
 */
public class Tienda {

    private Map<LocalDate, Venta> ventas;

    public Tienda() {
        ventas = new HashMap<LocalDate, Venta>();
    }

    public void agregarVenta(Venta venta) {
        ventas.put(venta.getFecha(), venta);
    }

    public List<Venta> obtenerVentas(LocalDate fechaInicio, LocalDate fechaFin) {
        List<Venta> ventasFiltradas = new ArrayList<Venta>();
        for (LocalDate fechaVenta : ventas.keySet()) {
            if (fechaVenta.isBefore(fechaInicio)&& fechaVenta.isAfter(fechaFin)) {
                ventasFiltradas.add(ventas.get(fechaVenta));
            }
        }
        return ventasFiltradas;
    }
}
