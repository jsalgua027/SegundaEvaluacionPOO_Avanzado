/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercado;

import java.util.ArrayList;
import java.util.Objects;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author nacho
 */
public class Caja {

    private String IdCaja;

    private Cinta cinta;

    public Caja() {
        this.IdCaja = RandomStringUtils.randomAlphanumeric(2);

        this.cinta = new Cinta();

    }

    public String getIdCaja() {
        return IdCaja;
    }

    public void setIdCaja(String IdCaja) {
        this.IdCaja = IdCaja;
    }

    public Cinta getCinta() {
        return cinta;
    }

    public void setCinta(Cinta cinta) {
        this.cinta = cinta;
    }
    
//     // generar ticket
//    public Ticket generarTicket(Caja c){
//    Ticket aux = new Ticket(c);
//    return aux;
//    }
    
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.IdCaja);
        hash = 67 * hash + Objects.hashCode(this.cinta);
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
        final Caja other = (Caja) obj;
        return Objects.equals(this.IdCaja, other.IdCaja);
    }

    @Override
    public String toString() {
       String aux=this.cinta.impresionListadoProductos();
       return aux;
    }
    
    
    
    
}