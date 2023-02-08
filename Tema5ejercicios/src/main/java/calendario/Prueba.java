/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calendario;

/**
 *
 * @author Windows10
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Calendario c = new Calendario(1981, 9);
        c.imprimir();
     System.out.println(Calendario.diaSemana(15, c));

        Calendario[] aux = Calendario.calendarioAnual(2023);
        for (Calendario aux1 : aux) {
            aux1.imprimir();
            System.out.println("");
        }

    }

}
