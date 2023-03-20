/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Windows10
 */
public final class Temporal extends Sala implements Comparable<Temporal>{

    private LocalDate fechaIni;
    private LocalDate fechaFin;

    public Temporal(LocalDate fechaIni, LocalDate fechaFin, String nombreSala, int codigoSala, List<Obra> listadoObras, Temperatura senorTemp, Humedad senorHum) {
        super(nombreSala, codigoSala, listadoObras, senorTemp, senorHum);
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
    }

    public LocalDate getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(LocalDate fechaIni) {
        this.fechaIni = fechaIni;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Temporal{");
        sb.append("fechaIni=").append(fechaIni);
        sb.append(", fechaFin=").append(fechaFin);
        sb.append('}');
        return sb.toString();
    }

    
    
    @Override
    void horariosSala() {
        String aux
                = """
                             L           M          MI           J              V               S             D
                         10:00     10:00    11:00     10:00                        10:00       11:00
                                                                                cerrado      
                         13:00     18:00    19:00     16:00                        15:00       13:00
                        
                         """;

        System.out.println(aux);
    }

    // implemento la interface por si hago una lista de salas y quiero ordenarlas por fecha de inicio
    
    @Override
    public int compareTo(Temporal o) {
      return this.fechaFin.compareTo(o.fechaFin);
    }

}
