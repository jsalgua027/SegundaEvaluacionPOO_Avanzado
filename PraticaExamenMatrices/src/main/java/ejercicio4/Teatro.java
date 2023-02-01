/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author Windows10
 */
public class Teatro {

    private String[][] teatro;
    private int fila;
    private int columna;

    public Teatro(int fila, int columna) {
        this.teatro = rellenarTeatro(fila, columna);
        this.fila = fila;
        this.columna = columna;
    }

    public String[][] getTeatro() {
        return teatro;
    }

    public void setTeatro(String[][] teatro) {
        this.teatro = teatro;
    }

    public String[][] rellenarTeatro(int fila, int columna) {
        String[][] aux = new String[fila][columna];
        for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux[i].length; j++) {
                if (((i+1) % 2 != 0) && ((j+1) % 2 != 0)) {

                    aux[i][j] = "L";
                } else {

                    aux[i][j] = "X";
                }

            }
        }
        return aux;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Teatro{");
        sb.append("teatro=").append(teatro);
        sb.append('}');
        return sb.toString();
    }

    public void imprimirTeatro() {

        for (int i = 0; i < teatro.length; i++) {
            for (int j = 0; j < teatro[i].length; j++) {
                System.out.print("|" + "(" + (i+1 ) + "-" + (j+1 ) + ")" + ":" + teatro[i][j] + "|");
            }
            System.out.println("");
        }

    }

    public void reservar(int fila, int columna) {
       fila=fila-1;
       columna=columna-1;
        if (this.teatro[fila][columna].equalsIgnoreCase("X") || this.teatro[fila][columna].equalsIgnoreCase("V")) {
            System.out.println("No se puede hacer la reserva");

        } else if (this.teatro[fila][columna].equalsIgnoreCase("L")) {

            this.teatro[fila][columna] = "v";
        }

    }
    
    
    public void cancelar(int fila, int columna) {
          fila=fila-1;
       columna=columna-1;
        if (this.teatro[fila][columna].equalsIgnoreCase("X") || this.teatro[fila][columna].equalsIgnoreCase("L")) {
            System.out.println("No se puede hacer cancelar");

        } else if (this.teatro[fila][columna].equalsIgnoreCase("V")) {

            this.teatro[fila][columna] = "L";
        }

    }
    

}
