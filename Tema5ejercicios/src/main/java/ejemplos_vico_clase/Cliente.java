/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos_vico_clase;

import java.util.Objects;
import java.util.Scanner;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author nacho
 */
public class Cliente {
    
    private String NIF;
    private String nombre;
    private String apellido;
    private static int contador=0;

    public Cliente() {
        
        this.nombre=RandomStringUtils.randomAlphabetic(5);
        this.apellido=RandomStringUtils.randomAlphabetic(5);
        contador++;
         this.NIF = String.valueOf(contador);
        
    }

    public Cliente(String nombre, String apellido) {
       
        this.nombre = nombre;
        this.apellido = apellido;
        contador++;
         this.NIF = String.valueOf(contador);
    }
    
    public static Cliente  generarCliente( ){
        Scanner teclado = new Scanner(System.in);
//        System.out.println("Indica el NIF");
//      String  nif=teclado.nextLine();
         System.out.println("Indica el Nombre");
       String nombre=teclado.nextLine();
         System.out.println("Indica el Apellido");
        String apellido=teclado.nextLine();
    Cliente aux =new Cliente (nombre, apellido);
        
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
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.NIF);
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
