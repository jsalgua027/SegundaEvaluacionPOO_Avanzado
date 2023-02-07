/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calendario;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 *
 * @author Windows10
 */
public class Calendario {

    private int[][] calendario;
    private int mes;
    private int anio;

    public Calendario(int mes, int anio) {
        this.calendario = new int[6][7];
        this.mes = mes;
        this.anio = anio;
    }

    public static void rellenarCalenadrio(int mes, int anio) {
        int numeroCalendario = 1;
        LocalDate fechaAux = LocalDate.of(mes, anio, 1);
        DayOfWeek diaSemana = fechaAux.getDayOfWeek();
        int dia = diaSemana.getValue();
        int[][] calendarioAux = new int[6][7];
        for (int i = 0; i < calendarioAux.length; i++) {

            if (i == 0) {
                for (int j = dia; j < calendarioAux[i].length; j++) {
                    calendarioAux[i][j] = numeroCalendario;
                    numeroCalendario++;
                }
                if (i > 0) {
                    for (int j = 0; j < calendarioAux[i].length; j++) {

                        calendarioAux[i][j] = numeroCalendario;
                        numeroCalendario++;
                    }

                }
            }

        }

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

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Calendario{" + "calendario=" + calendario + ", mes=" + mes + ", anio=" + anio + '}';
    }
    
    
    

}
