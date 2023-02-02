/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoria_fechas;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 *
 * @author Windows10
 */
public class Fechas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        // clase que guarda fechas
        //guardar fechas actuales
        LocalDate fechaHoy = LocalDate.now();

        System.out.println("Año: " + fechaHoy.getYear());
        System.out.println("Mes: " + fechaHoy.getMonthValue());

        Month mesActual = fechaHoy.getMonth();
        System.out.println("Month " + mesActual);

        // fechas concretas 
        LocalDate fecha = LocalDate.of(2000, 11, 10);
        LocalDate fecha2 = LocalDate.of(2022, Month.NOVEMBER, 10);

        System.out.println("fecha : " + fecha);

        // son iguiales 
        if (fecha.equals(fecha2)) {
            System.out.println("son iguales");

        } else {

            System.out.println("son distintas");
        }

        // anterior y posterior
        if (fecha.isBefore(fecha2)) {

            System.out.println("fecha es anterior a fecha 2");

        }
        if (fecha.isAfter(fecha2)) {
            System.out.println("fecha es posterior a fecha 2");
        }

        // clase para guardar mes y dia (no el año)
        MonthDay nocheVieja = MonthDay.of(12, 31);
        
        // clase para guardar año y mes 
        YearMonth añoMes = YearMonth.of(2052, 4);
        
        
        //operaciones con fechas
        System.out.println("hoy "+ fechaHoy);
        System.out.println("despues de cien dias  " + fechaHoy.plusDays(100));
        System.out.println("hoy " + fechaHoy);// fijate como se queda fecha hoy igual por no meterlo en un objeto
        LocalDate sumarMeses = fechaHoy.plusMonths(13);
        System.out.println("desoues de 13 meses: "+ sumarMeses);
        
        
        // ChronoUnit es unidades de tiempo
        
        LocalDate dosSiglosDespues=  sumarMeses.plus(2, ChronoUnit.CENTURIES);
        System.out.println(dosSiglosDespues);
        
        // ChronoUnit para comparar.... lo que queramos 
        Long difenciaDias = ChronoUnit.DAYS.between(fecha, fecha2);
        
        System.out.println(" Dias entre fechas :"+ difenciaDias);
        
        long years = ChronoUnit.YEARS.between(fecha, fecha2);
        System.out.println("Cuantos años entre fechas: "+ years);
       
        // es bisiesto el año 
          boolean esBisiesto= fechaHoy.isLeapYear();
        System.out.println("es bisiesto: "+ esBisiesto);
        // cuantos dias tiene el mes actual 
        System.out.println("dias del mes actual : " + fechaHoy.lengthOfMonth());
        
        // diferentes formatos FULL---------------- SHORT----------------NARROW
        Locale configLocal= Locale.getDefault();
        
        System.out.println("fecha hoy dia: "+ fechaHoy.getDayOfWeek().getDisplayName(TextStyle.FULL, configLocal));
        
        // cambiampos la conigutacion Locale para que nos lo de en el idioma que queramos
         System.out.println("fecha hoy mes : "+ mesActual.getDisplayName(TextStyle.FULL,Locale.CHINA));
        
         // Vamos a darle formato a la fecha----------------------------------
         
         // dd   dia con dos numeritos
         // MM mes con dos numeritos
         // yyyy año
         
        DateTimeFormatter formatoFechas= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = fechaHoy.format(formatoFechas);
        System.out.println("Fecga formateada "+ fechaFormateada);

    }
    
}
