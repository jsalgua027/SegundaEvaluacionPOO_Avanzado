/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo_nachosalcedo;

import java.util.List;

/**
 *
 * @author Windows10
 */
public final class Fija extends Sala {
    
    private String estado;

    public Fija(String estado, String nombreSala, int codigoSala, List<Obra> listadoObras, Temperatura senorTemp, Humedad senorHum) {
        super(nombreSala, codigoSala, listadoObras, senorTemp, senorHum);
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Fija{");
        sb.append("estado=").append(estado);
        sb.append('}');
        return sb.toString();
    }
    
    
    

    @Override
    void horariosSala() {
        String aux=
                         """
                             L           M          MI           J              V               S             D
                         10:00     10:00    10:00     10:00                        10:00       11:00
                                                                                cerrado      
                         16:00     16:00    16:00     16:00                        15:00       13:00
                        
                         """;
        
        
        System.out.println(aux);
    }

    
    
   
    
}
