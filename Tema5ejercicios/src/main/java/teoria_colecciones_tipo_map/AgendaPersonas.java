/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoria_colecciones_tipo_map;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Windows10
 */
public class AgendaPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // En este ejemplo, la clave que no se puede repetir es el NIF de la persona (String)
        // Por cada clave, sólo hay un objeto asociado de tipo Persona
        // Al usar HashMap no se garantiza ningún orden de las keys (claves) del Map
        Map<String, Persona> agenda = new HashMap<>();

        // Insertamos los pares clave, valor
        agenda.put("12345678A", new Persona("12345678A", "Pepe", "Perez", LocalDate.of(1990, 1, 2)));
        agenda.put("23456789B", new Persona("23456789B", "Juan", "Martínez", LocalDate.of(1991, 2, 3)));
        agenda.put("34567890C", new Persona("34567890C", "Ana", "Ramírez", LocalDate.of(1992, 3, 4)));
        agenda.put("45678901D", new Persona("45678901D", "María", "López", LocalDate.of(1993, 4, 5)));

        // Si insertamos un elemento con la misma clave, lo sustituimos
        // En este caso Ana Ramírez se sustituye por Martín García
        agenda.put("34567890C", new Persona("34567890C", "Martín", "García", LocalDate.of(1990, 12, 15)));

        // La forma más normal de recorrer un Map es tomar su conjunto de claves, iterar por ellas, y
        // para cada una de ellas, obtener el valor.
        for (String key : agenda.keySet()) {
            System.out.printf("Clave %s -- Objeto %s %n", key, agenda.get(key));
        }

        // Las claves no tienen por qué coincidir con algún atributo del objeto
        agenda.put("11111111A", new Persona("12345678C", "Julia", "Hernández", LocalDate.of(1990, 12, 15)));

        // Puede haber objetos duplicados
        agenda.put("11111112A", new Persona("12345678C", "Julia", "Hernández", LocalDate.of(1990, 12, 15)));
        agenda.forEach((clave, valor) -> System.out.println("Clave:" + clave + " ** Valor: " + valor));

        // Se puede obtener un Set con las claves únicas
        Set<String> conjuntoNif = agenda.keySet();

        System.out.println("  ----  Lista de claves únicas -----");

        conjuntoNif.forEach(System.out::println);

        // Se puede obtener una colección con las personas (puede haber duplicados)
        Collection<Persona> cPersonas = agenda.values();
        System.out.println("  ----  Lista de personas a partir del Map -----");
        cPersonas.forEach(System.out::println);
    }
    
}
