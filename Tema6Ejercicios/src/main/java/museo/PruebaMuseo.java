/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package museo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Windows10
 */
public class PruebaMuseo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // voy a crear 6 sensores; 4 para ñas dos salas iniciales y otros dos para la sala que voy agregar usando los metodos
        Sensor s1H = new Humedad("unoH");
        Sensor s2H = new Humedad("dosH");
        Sensor s3H = new Humedad("tresH");
        Sensor s4T = new Temperatura("cuatroT");
        Sensor s5T = new Temperatura("cincoT");
        Sensor s6T = new Temperatura("seisT");

        // creo listado de obras 
        Obra o1 = new Pintura(15000, "1", "jjjjjjj", TipoObra.Abstracto);
        Obra o2 = new Pintura(20000, "2", "gggg", TipoObra.Arte_pop);
        Obra o3 = new Pintura(3000, "3", "iiii", TipoObra.Expresionismo);
        Obra o4 = new Pintura(18467, "4", "mmmm", TipoObra.Impresionismo);
        Obra o5 = new Pintura(150, "5", "uuuu", TipoObra.Surrealismo);
        Obra o6 = new Pintura(23500, "", "wwww", TipoObra.Abstracto);
        Obra o7 = new Escultura(100, true, "7", "afghu", TipoObra.Expresionismo);
        Obra o8 = new Escultura(1000, true, "8", "afghu", TipoObra.Abstracto);
        Obra o9 = new Escultura(89, false, "9", "afghu", TipoObra.Arte_pop);
        Obra o10 = new Escultura(40, true, "10", "afghu", TipoObra.Impresionismo);
        Obra o11 = new Escultura(45, false, "11", "afghu", TipoObra.Abstracto);

        List<Obra> listadoObras1 = new ArrayList<>();
        List<Obra> listadoObras2 = new ArrayList<>();
        List<Obra> listadoObras3 = new ArrayList<>();
       // añado las obras
        listadoObras1.add(o1);
        listadoObras1.add(o2);
        listadoObras1.add(o3);
        listadoObras1.add(o4);
        listadoObras2.add(o5);
        listadoObras2.add(o6);
        listadoObras2.add(o7);
        listadoObras3.add(o8);
        listadoObras3.add(o9);
        listadoObras3.add(o10);
        listadoObras3.add(o11);
        // creo las salas
        Sala sala1 = new Fija("Correcto", "Sala1", 1, listadoObras1, s4T, s1H);
        Sala sala2 = new Temporal(LocalDate.of(2023, 07, 1), LocalDate.of(2023, 9, 15), "Sala2", 3, listadoObras2, s5T, s2H);
        Sala sala3 = new Fija("Correcto", "Sala3", 1, listadoObras3, s6T, s3H);
        
        // sin usar el metodo lo hago para crear el museo
        List<Sala> listadoSalas = new ArrayList<>();
        
        listadoSalas.add(sala1);
        listadoSalas.add(sala2);
        
        // creo los empleados 4 tres de inicio y uno para usar el metodo
        
        Empleado eM1 = new Monitor("123456F", "Pepe");
        Empleado eM2 = new Monitor("456478j", "Lucas");
        Empleado eV1 = new Vigilante("34534W", "Antonio");
        Empleado eV2 = new Vigilante("456478j", "Lucas");
        
          List<Empleado> listadoEmpleados = new ArrayList<>();
        
        listadoEmpleados.add(eV1);
        listadoEmpleados.add(eV2);
        listadoEmpleados.add(eM2);
        listadoEmpleados.add(eM1);
       
        // creo el museo 
        
        Museo museo = new Museo("Museo del Prado", "C/ juan lopez, Madrid", listadoEmpleados, listadoSalas);
        
        System.out.println("El museo del prado está compuesto por");
        System.out.println(museo.toString());
        
        
        

    }

}
