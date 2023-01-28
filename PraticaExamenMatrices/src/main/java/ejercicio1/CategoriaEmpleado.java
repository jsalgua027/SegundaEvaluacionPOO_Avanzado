/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author Windows10
 */
public enum CategoriaEmpleado {
    
    
    INICAL("Categoría Básica", 50),
    MEDIA("Categoría Media", 70),
    AVANZADA("Categoría Profesional", 100);
    
    private String nombreCategoria;
    
    private int complemento;

    private CategoriaEmpleado(String nombreCategoria, int complemento) {
        this.nombreCategoria = nombreCategoria;
        this.complemento = complemento;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public int getComplemento() {
        return complemento;
    }
    
    
    
    
}
