/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author nacho
 */
public class Calendario {
    
    private int[][] calendario;
    
    private int mes;
    
    private int dia;

    public Calendario( int mes, int dia) {
        this.calendario = new int[6][7];
        this.mes = mes;
        this.dia = dia;
    }

    public int[][] getCalendario() {
        return calendario;
    }

    public void setCalendario(int[][] calendario) {
        this.calendario = calendario;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Calendario{");
        sb.append("calendario=").append(calendario);
        sb.append(", mes=").append(mes);
        sb.append(", dia=").append(dia);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
}
