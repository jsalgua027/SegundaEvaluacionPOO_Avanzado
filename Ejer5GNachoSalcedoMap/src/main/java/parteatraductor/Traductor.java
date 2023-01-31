/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parteatraductor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author Windows10
 */
public class Traductor {

    private SortedMap<String, String> traductor;

    public Traductor() {

        this.traductor = new TreeMap<>();

    }

    public SortedMap<String, String> getTraductor() {
        return traductor;
    }

    public void setTraductor(SortedMap<String, String> traductor) {
        this.traductor = traductor;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.traductor);
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
        final Traductor other = (Traductor) obj;
        return Objects.equals(this.traductor, other.traductor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Traductor{");
        sb.append("traductor=").append(traductor);
        sb.append('}');
        return sb.toString();
    }

    public void guardarEntrada(String extranjera, String espaniola) {

        this.traductor.put(extranjera, espaniola);

    }
// borrar entrada
    public void borrarEntrada(String extranjera, String espaniola) {

        this.traductor.remove(extranjera, espaniola);
    }

    // modificar
    public void modificar(String extranjera, String anitgua, String nueva) {

        this.traductor.replace(extranjera, anitgua, nueva);

    }

    // traducir
    public void traducir(String extranjera) {

        this.traductor.get(extranjera);

    }
    
    // imprimir map
    public void imprimirMap() {

        this.traductor.forEach((clave, valor) -> System.out.println("La palabra " + clave + " -- Significa:  " + valor));

    }

    // devuelvo lista de palabras extranjeras
    public Set<String> listaDePalabrasExtrangeras() {

        Set<String> palabrasExtranjeras = this.traductor.keySet();
        return palabrasExtranjeras;
    }
    //devulco lista de palabras españolas
    public Collection<String> listaDePalabrasEspaniolas() {
        Set<String> palabrasEspaniolas = new HashSet<>(this.traductor.values());

        return palabrasEspaniolas;
    }

}
