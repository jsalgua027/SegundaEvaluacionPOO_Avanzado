/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12_cuenta;

/**
 *
 * @author Windows10
 */
public class CuentaCorriente extends Cuenta {

    private final double INTERES = 1.5;
    private double saldoMinimo;

    public CuentaCorriente() {
    }

    public CuentaCorriente(double saldoMinimo, Persona cliente) {
        super(cliente);
        this.saldoMinimo = saldoMinimo;
    }

    @Override
    public void actualizarSaldo() {
        if (super.getSaldo() > 1000) {
            super.setSaldo(super.getSaldo() + (this.saldoMinimo * this.INTERES));

        } else {

            super.setSaldo( super.getSaldo() +((super.getSaldo() + this.INTERES)));

        }
    }

    @Override
    public void retirarSaldo(double cantidad) {

        if (super.getSaldo() - cantidad < this.saldoMinimo) {
            System.out.println("No se puede retirar esa cantidad, esta por encima del saldo minimo");
        } else {
            System.out.println("Retirada efectuada");
            super.setSaldo(super.getSaldo() - cantidad);
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
         sb.append(super.toString());
        sb.append("CuentaCorriente{");
        sb.append("INTERES=").append(INTERES);
        sb.append(", saldoMinimo=").append(saldoMinimo);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void ingresar(double cantidad) {
      super.setSaldo(super.getSaldo()+cantidad);
    }

    
    
    
}
