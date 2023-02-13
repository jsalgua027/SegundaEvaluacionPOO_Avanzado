/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trenes;

/**
 *
 * @author Windows10
 */
public class Tren {
    
    private int id;
    private int numeroVagones;
    private int numeroTotalPasajeros;

    public Tren() {
    }

    public Tren(int id, int numeroVagones, int numeroTotalPasajeros) {
        this.id = id;
        this.numeroVagones = numeroVagones;
        this.numeroTotalPasajeros = numeroTotalPasajeros;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroVagones() {
        return numeroVagones;
    }

    public void setNumeroVagones(int numeroVagones) {
        this.numeroVagones = numeroVagones;
    }

    public int getNumeroTotalPasajeros() {
        return numeroTotalPasajeros;
    }

    public void setNumeroTotalPasajeros(int numeroTotalPasajeros) {
        this.numeroTotalPasajeros = numeroTotalPasajeros;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tren{");
        sb.append("id=").append(id);
        sb.append(", numeroVagones=").append(numeroVagones);
        sb.append(", numeroTotalPasajeros=").append(numeroTotalPasajeros);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
