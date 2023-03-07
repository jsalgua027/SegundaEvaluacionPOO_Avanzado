/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12_cuenta;

/**
 *
 * @author Windows10
 */
public class CuentaAhorro extends Cuenta {

    private double intereses;
    private double comisionAnual;

    public CuentaAhorro() {
    }

    public CuentaAhorro(double intereses, double comisionAnual, Persona cliente) {
        super(cliente);
        this.intereses = intereses;
        this.comisionAnual = comisionAnual;
    }

    public double getIntereses() {
        return intereses;
    }

    public void setIntereses(double intereses) {
        this.intereses = intereses;
    }

    public double getComisionAnual() {
        return comisionAnual;
    }

    public void setComisionAnual(double comisionAnual) {
        this.comisionAnual = comisionAnual;
    }

    @Override
    public void actualizarSaldo() {
        super.setSaldo((super.getSaldo() + (super.getSaldo() * this.intereses)) - this.comisionAnual);

    }

    @Override
    public void retirarSaldo(double cantidad) {
        if (super.getSaldo() - cantidad >= 0) {
            System.out.println("Retirada efectuada");
        } else {
            System.out.println("No se puede retirar esa cantidad, intentas sacar más de lo que tienes");

        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("CuentaAhorro{");
        sb.append("intereses=").append(intereses);
        sb.append(", comisionAnual=").append(comisionAnual);
        sb.append('}');
        return sb.toString();
    }

}
