/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Calendario {
    
    // Atributos de clase
    public static final int DIAS_SEMANA = 7;
    public static final int SEMANAS_MES = 6;
    public static final int MESES_ANIO = 12;

    // Atributos del Calendario
    private final int[][] dias;
    private final int mes;
    private final int anio;
    

    public Calendario(int anio, int mes) {

        LocalDate fecha;
        try {
            // Crea un objeto LocalDate con la fecha especificada, empezando en día 1
            fecha = LocalDate.of(anio, mes, 1);
        } catch (DateTimeException dte) {
            // Si el mes o año no son válidos captura excepción y establece
            // fecha actual. Esto no se pedía
            fecha = LocalDate.now();

        }
        this.mes = fecha.getMonthValue();
        this.anio = fecha.getYear();

        // Obtiene el día de la semana de la fecha (monday, tuesday, etc)
        DayOfWeek dia = fecha.getDayOfWeek();
        // Obtiene el valor numérico de ese día (1 es monday...)
        // Resto uno para que diaSemana me valga en la matriz
        int diaSemana = dia.getValue() - 1;

        // Obtiene el número de días en el mes (28, 29, 30, 31)
        int numDias = fecha.lengthOfMonth();

        // Inicializar la matriz de días con el número de semanas necesarias
        dias = new int[SEMANAS_MES][DIAS_SEMANA];

        rellenarCalendario(diaSemana, numDias);
    }
    
    // Rellena la matriz con los días, poniendo el día 1 en su sitio de la
    // fila 0
    private void rellenarCalendario(int diaSemana, int numDiasMes){
        
        // Esta variable me sirve para ir poniendo todos los días del mes
        // empezando en 1
        int diaPoner = 1;
        
        // Fila 0
        // i comienza en función de la columna que traiga diaSemana (0,1,2,3,4,5,6)
        // y luego rellena el resto de dias de la primera semana
        for (int i = diaSemana; i < dias[0].length; i++) {
            dias[0][i] = diaPoner;
            diaPoner++;
        }
        
        // Resto de semanas
        for (int i = 1; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                if (diaPoner <= numDiasMes) {
                    dias[i][j] = diaPoner;
                    diaPoner++;
                }

            }
        }
    }

    public void imprimir() {
        System.out.println("\tL\tM\tX\tJ\tV\tS\tD");

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                if (dias[i][j] == 0) {
                    System.out.print(" \t");
                } else {
                    System.out.print("\t" + dias[i][j]);
                }

            }
            System.out.println("");
        }
    }

    // Método que devuelve un String indicando el día de la semana en función
    // del valor de la columna de la matriz
    public static String dia(int dia, Calendario c) {

        int columnaDia = buscarDia(dia, c);
        return switch (columnaDia) {
            case 0 ->
                "Lunes";
            case 1 ->
                "Martes";
            case 2 ->
                "Miercoles";
            case 3 ->
                "Jueves";
            case 4 ->
                "Viernes";
            case 5 ->
                "Sabado";
            case 6 ->
                "Domingo";
            default ->
                throw new IllegalArgumentException();

        };
    }

    // Método que devuelve un String indicando el día de la semana en función
    // del valor de la columna de la matriz. Usando java time, hace lo mismo
    // que el anterior
    public static String diaSemana(int dia, Calendario c) {
        int columnaDia = buscarDia(dia, c);
        if (columnaDia == -1) {
            throw new IllegalArgumentException();
        } else {
            // DayOfWeek 1 es monday y 7 es sunday. Le sumo uno a la columna
            DayOfWeek diaSemana = DayOfWeek.of(columnaDia + 1);
            return diaSemana.getDisplayName(TextStyle.FULL, Locale.getDefault());
        }

    }

    // Método que busca el día en la matriz y devuelve la columna 
    // donde se encuentra. Si no está el día devuelve -1
    private static int buscarDia(int dia, Calendario c) {

        for (int i = 0; i < c.dias.length; i++) {
            for (int j = 0; j < c.dias[i].length; j++) {
                if (dia == c.dias[i][j]) {
                    return j;
                }
            }
        }
        return -1;
    }
    
    // Calendario Anual
    public static Calendario[] calendarioAnual(int anio){
        Calendario[] calendarios = new Calendario[MESES_ANIO];
        
        for (int i = 0; i < calendarios.length; i++) {
            calendarios[i] = new Calendario(anio, i+1);
        }
        
        return calendarios;
    }

}
