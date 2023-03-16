/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ahospitalnachosalcedo;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Windows10
 */
public class GestionHospital {

    /**
     * @param args the command line arguments
     */
    public static Paciente crearPaciente(Persona auxP, String numeroHistorial) {
        Paciente aux = new Paciente(numeroHistorial, auxP.getNombre(), auxP.getApellidos(), auxP.getDni());
        return aux;
    }

    public static Medico crearMedico(Persona auxP, String especialidad, String numeroSeguridad, double sueldo) {

        Medico aux = new Medico(especialidad, numeroSeguridad, sueldo, auxP.getNombre(), auxP.getApellidos(), auxP.getDni());

        return aux;
    }

    public static Administrativo crearPersonalPas(Persona auxP, String numeroSeguridad, double sueldo, Grupo grupo) {
        Administrativo aux = new Administrativo(grupo, numeroSeguridad, sueldo, auxP.getNombre(), auxP.getApellidos(), auxP.getDni());
        return aux;
    }

    public static void main(String[] args) {

        List<Empleado> listaEmpleados = new ArrayList<>();

        List<Paciente> listaPaciente = new ArrayList<>();

        NIF n1 = new NIF(11111, LocalDate.of(2021, Month.MARCH, 3));
        NIF n2 = new NIF(22222, LocalDate.of(2022, Month.APRIL, 1));
        NIF n3 = new NIF(33333, LocalDate.of(2019, Month.DECEMBER, 9));
        NIF n4 = new NIF(44444, LocalDate.of(2022, Month.JANUARY, 8));
        NIF n5 = new NIF(55555, LocalDate.of(2021, Month.JULY, 15));
        NIF n6 = new NIF(66666, LocalDate.of(2014, Month.MARCH, 22));
        NIF n7 = new NIF(77777, LocalDate.of(2015, Month.DECEMBER, 5));
        NIF n8 = new NIF(88888, LocalDate.of(2026, Month.SEPTEMBER, 15));

        //Se crean 3 administrativos
        Empleado a1 = new Administrativo(Grupo.C, "223-81-8142", 1200, "Salud", "Alfonso", n1);
        Empleado a2 = new Administrativo(Grupo.E, "223-81-8178", 1800, "María", "González", n2);
        Empleado a3 = new Administrativo(Grupo.D, "223-81-8177", 1900, "Antonio", "Ramíred", n3);
        // los meto en la lista
        listaEmpleados.add(a1);
        listaEmpleados.add(a2);
        listaEmpleados.add(a3);

        //Se crean dos médicos
        Empleado m1 = new Medico("cirujano", "510-42-8735", 2500, "Eduard", "Antolin", n3);
        Empleado m2 = new Medico("pediatria", "510-42-8740", 1500, "Eduarda", "Fernández", n4);
        // los meto en la lista
        listaEmpleados.add(m1);
        listaEmpleados.add(m2);

        // pacientes
        Paciente p1 = new Paciente("111111111", "Justa", "Andres", n5);
        Paciente p2 = new Paciente("111111221", "Blas", "Castaño", n6);
        Paciente p3 = new Paciente("111111222", "Juan-Jose", "del Castillo", n7);
        Paciente p4 = new Paciente("111111223", "Fran", "Cabezas", n8);
        // los meto en la lista
        listaPaciente.add(p1);
        listaPaciente.add(p2);
        listaPaciente.add(p3);
        listaPaciente.add(p4);

        Hospital hopital = new Hospital("COSTA DEL SOL", "MARBELLA", 1500, listaEmpleados, listaPaciente);
        // contrato a los empleados
        hopital.contratarEmpleado(a1);
        hopital.contratarEmpleado(a2);
        hopital.contratarEmpleado(a3);
        hopital.contratarEmpleado(m1);
        hopital.contratarEmpleado(m2);

        // ingreso a los pacientes
        hopital.ingresarPaciente(p1);
        hopital.ingresarPaciente(p2);
        hopital.ingresarPaciente(p3);
        hopital.ingresarPaciente(p4);

        // metodos de medicos y administrativos
        for (Empleado emp : listaEmpleados) {
            if (emp instanceof Medico) {

                ((Medico) emp).tratarPaciente(p1, "paracetamol");
            }

            if (emp instanceof Administrativo) {

                ((Administrativo) emp).registrarDocumento("Prueba de documento");
            }
        }

        System.out.println("Metodo renovar dni");

        p1.renovarNif(LocalDate.of(2023, Month.MARCH, 1));

        System.out.println("La persona p1 se le ha renovado el DNI si fecha anterior era 2121 y ahora es: " + p1.getDni());

    }

}
