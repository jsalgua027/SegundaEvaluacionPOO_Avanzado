/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ej3;

/**
 *
 * @author nacho
 */
public enum Voz {
    CONTRATENOR("Masculino"),
    TENOR("Masculino"),
    BARITONO("Masculino"),
    SOPRANO("Femenino"),
    MEZZOSOPRANO("Femenino"),
    CONTRALTO("Femenino");
    
    private String tipo;

    private Voz(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    
    
    
}
