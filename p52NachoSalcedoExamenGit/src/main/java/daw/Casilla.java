/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author nacho
 */
public class Casilla {
    
       private int fila;
    private int columna;
    private TipoCasilla tipo;

    public Casilla() {
    }

   

    public Casilla(int fila, int columna, TipoCasilla tipo) {
        this.fila = fila;
        this.columna = columna;
        this.tipo = tipo;
    }
// al ser inmutables no pongo los Setter
    
    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public TipoCasilla getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Casilla{");
        sb.append("fila=").append(fila);
        sb.append(", columna=").append(columna);
        sb.append(", tipo=").append(tipo);
        sb.append('}');
        return sb.toString();
    }

    
    // toString secundario para solo mostrar por pantalla el tipo
    
    public String toString2() {

        StringBuilder sb = new StringBuilder();
         sb.append("|").append(fila).append(",");
         sb.append(columna).append("|");
        sb.append(tipo);

        return sb.toString();

    }

    
}
