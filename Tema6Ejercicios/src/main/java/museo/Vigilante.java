/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

/**
 *
 * @author Windows10
 */
public final class Vigilante extends Empleado {

    private final double SUELDO_HORA = 14.5;

    public Vigilante(String nif, String nombre) {
        super(nif, nombre);
    }

    public double getSUELDO_HORA() {
        return SUELDO_HORA;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Vigilante{");
        sb.append("SUELDO_HORA=").append(SUELDO_HORA);
        sb.append('}');
        return sb.toString();
    }

    @Override
    void calcularSueldo(double Horas) {
        double resultado = 0;
        resultado = this.SUELDO_HORA * Horas;

        System.out.println("EL sueldo total según las horas trabajadas es de : " + resultado);
    }

}
