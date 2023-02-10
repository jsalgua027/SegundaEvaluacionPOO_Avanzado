/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1_casa;

/**
 *
 * @author Windows10
 */
public class Persiana  {

    private boolean estadoPersiana;//true cerrada

    public Persiana(boolean estadoPersiana) {
       
        this.estadoPersiana = estadoPersiana;
    }

    public Persiana() {
    }

    public boolean isEstadoPersiana() {
        return estadoPersiana;
    }

    public void setEstadoPersiana(boolean estadoPersiana) {
        this.estadoPersiana = estadoPersiana;
    }

    public void abrirPersiana() {

        this.estadoPersiana = false;

    }

    public void cerrarPersiana() {

        this.estadoPersiana = true;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persiana{");
        sb.append("la persiana está= ").append(estadoPersiana);
        sb.append('}');
        return sb.toString();
    }

}
