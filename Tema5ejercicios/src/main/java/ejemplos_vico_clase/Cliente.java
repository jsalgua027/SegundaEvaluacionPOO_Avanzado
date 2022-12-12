/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos_vico_clase;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Cliente {
    
    private String NIF;
    private String nombre;
    private String apellido;

    public Cliente() {
    }

    public Cliente(String NIF, String nombre, String Nombre) {
        this.NIF = NIF;
        this.nombre = nombre;
        this.apellido = Nombre;
    }
    
    public static Cliente  generarCliente( ){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indica el NIF");
      String  nif=teclado.nextLine();
         System.out.println("Indica el Nombre");
       String nombre=teclado.nextLine();
         System.out.println("Indica el Apellido");
        String apellido=teclado.nextLine();
    Cliente aux =new Cliente(nif, nombre, apellido);
        
    return aux;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    

    @Override
    public String toString() {
        return "Cliente{" + "NIF=" + NIF + ", nombre=" + nombre + ", Nombre=" + apellido + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.NIF);
        hash = 43 * hash + Objects.hashCode(this.nombre);
        hash = 43 * hash + Objects.hashCode(this.apellido);
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
        final Cliente other = (Cliente) obj;
        return Objects.equals(this.NIF, other.NIF);
    }

   

   
    
    
    
    
    
     
}
