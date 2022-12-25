/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercado;

import java.util.Objects;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author Windows10
 */
public class Caja {
    
     private String IdCaja;
    
    private Cinta cintaCaja;

    public Caja() {
        
        this.IdCaja=RandomStringUtils.randomAlphanumeric(3);
        this.cintaCaja=new Cinta(0);
        
    }

    public String getIdCaja() {
        return IdCaja;
    }

    public void setIdCaja(String IdCaja) {
        this.IdCaja = IdCaja;
    }

    public Cinta getCintaCaja() {
        return cintaCaja;
    }

    public void setCintaCaja(Cinta cintaCaja) {
        this.cintaCaja = cintaCaja;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.IdCaja);
        hash = 23 * hash + Objects.hashCode(this.cintaCaja);
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
        StringBuilder sb = new StringBuilder();
        sb.append("Caja{");
        sb.append("IdCaja=").append(IdCaja);
        sb.append(", cintaCaja=").append(cintaCaja);
        sb.append('}');
        return sb.toString();
    }
  
    
    
    
    
    
}
