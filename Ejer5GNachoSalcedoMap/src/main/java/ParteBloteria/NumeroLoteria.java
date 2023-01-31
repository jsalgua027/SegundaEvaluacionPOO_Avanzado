/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ParteBloteria;

import java.util.Objects;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author Windows10
 */
public class NumeroLoteria implements Comparable<NumeroLoteria>{
    
    private String numero;

    public NumeroLoteria() {
        this.numero = RandomStringUtils.randomNumeric(5);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
      
        sb.append("Número: ").append(numero);
       
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.numero);
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
        final NumeroLoteria other = (NumeroLoteria) obj;
        return Objects.equals(this.numero, other.numero);
    }

    @Override
    public int compareTo(NumeroLoteria o) {
      return this.numero.compareToIgnoreCase(o.numero);
    }
    
    
    
    
    
}
