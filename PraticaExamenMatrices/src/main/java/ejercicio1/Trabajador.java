/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author Windows10
 */
public class Trabajador  implements Comparable<Trabajador>{

    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private CategoriaEmpleado categoriaE;

    public Trabajador() {
    }

    public Trabajador(String nombre, String apellidos, LocalDate fechaNacimiento, CategoriaEmpleado categoriaE){
        this.nombre = nombre;
        this.apellidos = apellidos;
        try {
            this.fechaNacimiento = calcularEdad(fechaNacimiento);
        } catch (IllegalArgumentException iae) {
            System.out.println("La edad del trabajador incumple la normativa");
        }

        this.categoriaE = categoriaE;
    }

    // constructor copia
    public Trabajador(Trabajador aux) {

        this.nombre = aux.getNombre();
        this.apellidos = aux.getApellidos();
        this.fechaNacimiento = aux.getFechaNacimiento();
        this.categoriaE = aux.getCategoriaE();

    }

    // metodo para controlar la edad  y si falla que me salte la excepcion
    public LocalDate calcularEdad(LocalDate fechaNacimiento) {
        LocalDate hoy = LocalDate.now();
        int anioNacimiento = fechaNacimiento.getYear();
        int anioActual = hoy.getYear();
        if (anioActual - anioNacimiento <= 16) {
            throw new IllegalArgumentException();
        } else {

            return this.fechaNacimiento = fechaNacimiento;
        }

        
        
    }

    // metodo copia
    public Trabajador copia(Trabajador origen) {
        Trabajador aux = new Trabajador();
        aux.setNombre(origen.getNombre());
        aux.setApellidos(origen.getApellidos());
        aux.setFechaNacimiento(origen.getFechaNacimiento());
        aux.setCategoriaE(origen.getCategoriaE());
        return aux;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public CategoriaEmpleado getCategoriaE() {
        return categoriaE;
    }

    public void setCategoriaE(CategoriaEmpleado categoriaE) {
        this.categoriaE = categoriaE;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Trabajador other = (Trabajador) obj;
        return Objects.equals(this.nombre, other.nombre);
    }
    
    
    
// metod para calcular sueldo

    public double calcularSueldo() {
        double sueldoBase = 1707;
        double total = 0;
        if (this.categoriaE.equals(CategoriaEmpleado.INICAL)) {
            total = sueldoBase + 50;
        }
        if (this.categoriaE.equals(CategoriaEmpleado.MEDIA)) {
            total = sueldoBase + 70;
        }
        if (this.categoriaE.equals(CategoriaEmpleado.AVANZADA)) {
            total = sueldoBase + 100;
        }

        return total;
    }

    public static LocalDate fechaJubilacion(Trabajador trabajador) {
        int edad;
        int anioParaJubilarse;// Para saber cuantos años le quedan para jubilarse
        int anioActual = LocalDate.now().getYear();
        edad = LocalDate.now().getYear() - trabajador.fechaNacimiento.getYear(); // obtengo su edad
        anioParaJubilarse = 66-edad; // lo que le queda para jubilarse
        LocalDate fechaJubilacion = trabajador.getFechaNacimiento().plusYears(edad+anioParaJubilarse);
        return fechaJubilacion;
    }

   
    @Override
    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Trabajador{");
//        sb.append("nombre=").append(nombre);
//        sb.append(", apellidos=").append(apellidos);
//        sb.append(", fechaNacimiento=").append(fechaNacimiento);
//        sb.append(", categoriaE=").append(categoriaE);
//        sb.append('}');
//        return sb.toString();
        
        String infoEmpleado=
                                          """
                                           %s,%s         F.Nac: %s/%s/%s
                                          Categoría: %s
                                          Fecha Jubilación: %s
                                          Sueldo actual: %s
                                          
                                         """.formatted(this.apellidos,this.nombre,this.fechaNacimiento.getDayOfMonth(),
                                                 this.fechaNacimiento.getMonthValue(),this.fechaNacimiento.getYear(),this.categoriaE,fechaJubilacion(this),
                                                 this.calcularSueldo());
        
       
        
        return infoEmpleado;
    }

    @Override
    public int compareTo(Trabajador o) {
     return  this.nombre.compareToIgnoreCase(o.nombre);
    }
    
    
    
    

}
