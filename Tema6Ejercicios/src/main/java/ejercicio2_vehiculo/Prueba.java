/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2_vehiculo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nacho
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Vehiculo v1 = new Vehiculo(9679463L, "789769r", "Fiat", "UNO", "Rojo", 12000, true);

        Turismo t1 = new Turismo(5, true, 45464645L, "DAF454", "Seat", "Ibiza", "Blanco", 25000, true);
        Deportivo d1 = new Deportivo(3000, 548646548L, "4598GG", "Ferrari", "430D", "Rojo", 100000, true);

        Furgoneta f1 = new Furgoneta(3000, 250, 132213546L, "456LL", "Renault", "Cangoo", "Blue", 10000, true);

        Electrico e1 = new Electrico(10, 240, 4564321435L, "4586KJ", "Tesla", "b", "Blanco", 50000, true);

        Combustion c1 = new Combustion(150, TipoCombustible.DIESEL, 45324165L, "21564s", "Opel", "Fiesta", "azul", 48564, true);

//        System.out.println(e1);
//        System.out.println(c1);
//        
//        v1.arrancar();
//        e1.arrancar();
//        c1.arrancar();

        List<Vehiculo> lista = new ArrayList<>();
        lista.add(v1);
        lista.add(e1);
        // las siguientes lineas son conversiones  implicitas
        lista.add(c1);

        for (Vehiculo v : lista) {
            System.out.println(v);
            v.arrancar();
            //hago el casting para poder acceder a los metodos del hijo puesto que desde el forecha solo ve vehiculos padre
           if(v instanceof Electrico){
            ((Electrico) v).cambiarBateria();
           } 
           
        }
        
        
    }

}
