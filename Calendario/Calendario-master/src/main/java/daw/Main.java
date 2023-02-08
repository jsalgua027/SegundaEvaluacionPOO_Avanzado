/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;


/**
 *
 * @author carlos
 */
public class Main {
    
    public static void main(String[] args) {
        
        Calendario c = new Calendario(1979, 3);
        c.imprimir();
        System.out.println(Calendario.diaSemana(5, c));
        
        Calendario[] aux = Calendario.calendarioAnual(2023);
        for (Calendario aux1 : aux) {
            aux1.imprimir();
            System.out.println("");
        }

        
    }
    
}
