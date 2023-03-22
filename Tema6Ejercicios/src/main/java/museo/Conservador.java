/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

/**
 *
 * @author nacho
 */
public class Conservador extends Empleado implements Restaurador {

    private String numColegiado;

    public Conservador(String numColegiado, String nif, String nombre) {
        super(nif, nombre);
        this.numColegiado = numColegiado;
    }

    public String getNumColegiado() {
        return numColegiado;
    }

    public void setNumColegiado(String numColegiado) {
        this.numColegiado = numColegiado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Conservador{");
        sb.append("numColegiado=").append(numColegiado);
        sb.append('}');
        return sb.toString();
    }

    @Override
    void calcularSueldo(double Horas) {

    }

    @Override
    public void restaurar(Obra o) {

    }

}
