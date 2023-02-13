/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1_casa;

/**
 *
 * @author nacho
 */
public class PruebaCasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Ventana v1 = new Corredera(2, new Persiana(true), true, true);
       Ventana v2 = new Corredera(2, new Persiana(true), true, true);
       Ventana v3 = new Corredera(2, new Persiana(true), true, true);
       Ventana v4 = new Corredera(2, new Persiana(true), true, true);
       

       
       Puerta p1 = new Puerta("Verde", true);
       
       Calefactor c1= new Calefactor(25, true);
       Calefactor c2= new Calefactor(25, true);
       Calefactor c3= new Calefactor(25, true);
       Calefactor c4= new Calefactor(25, true);
       
       Casa casa = new Casa(4, 300, p1);
       
       casa.getListaVentana().add(v1);
       casa.getListaVentana().add(v2);
       casa.getListaVentana().add(v3);
       casa.getListaVentana().add(v4);
       
       casa.getListaCalefacto().add(c1);
       casa.getListaCalefacto().add(c2);
       casa.getListaCalefacto().add(c3);
       casa.getListaCalefacto().add(c4);
       
       
       
       
       
    }
    
}
