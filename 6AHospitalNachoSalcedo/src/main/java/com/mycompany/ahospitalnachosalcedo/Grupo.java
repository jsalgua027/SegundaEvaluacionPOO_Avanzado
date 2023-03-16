/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.ahospitalnachosalcedo;

/**
 *
 * @author Windows10
 */
public enum Grupo {
    
     C(17.5), D(18), E(18.5);
    private double irpf;

    private Grupo(double irpf) {
        this.irpf = irpf;
    }

    public double getIrpf() {
        return irpf;
    }

    public void setIrpf(double irpf) {
        this.irpf = irpf;
    }
    
    
}
