/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ahospitalnachosalcedo;

import javax.print.attribute.standard.Media;

/**
 *
 * @author Windows10
 */
public class GestionHospital {

    /**
     * @param args the command line arguments
     */
    private Hospital hospital;

    public  static Paciente crearPaciente(Persona auxP, String numeroHistorial) {
        Paciente aux = new Paciente( numeroHistorial, auxP.getNombre(), auxP.getApellidos(), auxP.getDni());
        return aux;
    }

    public static Medico crearMedico( Persona auxP, String especialidad,  String numeroSeguridad, double sueldo) {

        Medico aux = new Medico(especialidad, numeroSeguridad, sueldo, auxP.getNombre(), auxP.getApellidos(), auxP.getDni());

        return aux;
    }

    public  static  Administrativo crearPersonalPas(Persona auxP,  String numeroSeguridad, double sueldo, Grupo grupo) {
        Administrativo aux = new Administrativo(grupo, numeroSeguridad, sueldo, auxP.getNombre(), auxP.getApellidos(), auxP.getDni());
        return aux;
    }

    public static void main(String[] args) {
        
        
        
        
    }

}
