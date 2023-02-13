/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1_casa;

/**
 *
 * @author nacho
 */
public class Corredera extends Ventana {
    
    private int rieles;
    private Persiana persiana;
   

    public Corredera() {
    }

    public Corredera(int rieles, Persiana persiana, boolean estadoVentana, boolean apertura) {
        super(estadoVentana);
        this.rieles = rieles;
        this.persiana = persiana;
       
    }

    public int getRieles() {
        return rieles;
    }

    public void setRieles(int rieles) {
        this.rieles = rieles;
    }

    public Persiana getPersiana() {
        return persiana;
    }

    public void setPersiana(Persiana persiana) {
        this.persiana = persiana;
    }

    

    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
         sb.append(super.toString());
        sb.append("Corredera{");
        sb.append("rieles=").append(rieles);
        sb.append(", persiana=").append(persiana);
        sb.append('}');
        return sb.toString();
    }
    
    
    
   
    
    
}
