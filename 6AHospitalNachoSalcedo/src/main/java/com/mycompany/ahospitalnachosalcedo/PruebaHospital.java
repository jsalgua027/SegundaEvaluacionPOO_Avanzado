/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ahospitalnachosalcedo;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Windows10
 */
public class PruebaHospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // creo los nif
        
       NIF n1 = new NIF(11111, LocalDate.of(2021, Month.MARCH, 3));
       NIF n2 = new NIF(22222, LocalDate.of(2022, Month.APRIL, 1));
       NIF n3 = new NIF(33333, LocalDate.of(2019, Month.DECEMBER, 9));
       NIF n4 = new NIF(44444, LocalDate.of(2022, Month.JANUARY, 8));
       NIF n5 = new NIF(55555, LocalDate.of(2021, Month.JULY, 15));
       NIF n6 = new NIF(66666, LocalDate.of(2014, Month.MARCH, 22));
       NIF n7 = new NIF(77777, LocalDate.of(2015, Month.DECEMBER, 5));
       NIF n8 = new NIF(88888, LocalDate.of(2026, Month.SEPTEMBER, 15));
       
        Persona p1 = new Persona(nombre, "", n1);
            
        
        
       
       
       
       
    }
    
}
