/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import ejercicio1.CategoriaEmpleado;
import ejercicio1.Trabajador;
import java.time.LocalDate;
import ejercicio2.Empresa;

/**
 *
 * @author Windows10
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //  Trabajador menor = new Trabajador("menor", "menor", LocalDate.of(2019, 1, 1), CategoriaEmpleado.MEDIA);
        
        //creo empresas
        Empresa empresaA = new Empresa("empresaA", "12345");
        Empresa empresaB = new Empresa("empresaB", "6789");
        // creo trabajadores
        Trabajador t1 = new Trabajador("pepe", "perez", LocalDate.of(1981, 3, 4), CategoriaEmpleado.MEDIA);
        Trabajador t2 = new Trabajador("nacho", "salcedo", LocalDate.of(1983, 5, 11), CategoriaEmpleado.AVANZADA);
        Trabajador t3 = new Trabajador("Obi_wan", "kenobi", LocalDate.of(1999, 7, 25), CategoriaEmpleado.MEDIA);
        Trabajador t4 = new Trabajador("maria", "sanchez", LocalDate.of(2000, 1, 4), CategoriaEmpleado.AVANZADA);
        Trabajador t5 = new Trabajador("lucas", "hernandez", LocalDate.of(2006, 7, 3), CategoriaEmpleado.INICAL);
        // construcotr copia
        Trabajador t6 = new Trabajador(t3);
        
      
//        LocalDate fecha= Trabajador.fechaJubilacion(t6);
//        System.out.println("la fecha es: " + fecha);

        // contrato los trabajadores
        empresaA.contratar(t1);
        empresaA.contratar(t2);
        empresaA.contratar(t3);

        empresaB.contratar(t4);
        empresaB.contratar(t5);
        empresaB.contratar(t6);

        empresaA.imprimir();
        System.out.println("*********************************");
        empresaB.imprimir();
        //despido t5 de empresa B y lo contrato en empresa A
        empresaB.despedir(t5);
        empresaA.contratar(t5);

        empresaA.ordenarNombre();
        empresaB.ordenarNombre();

        System.out.println("Empresas ordenadas por nombres*************");

        empresaA.imprimir();
        System.out.println("*********************************");
        empresaB.imprimir();
        
        System.out.println("Obi Wan en la empresa A esta en la posicion: " +empresaA.buscarPorNombre(t3));
        System.out.println("Obi Wan en la empresa A esta en la posicion: " +empresaB.buscarPorNombre(t3));
        
    }

}
