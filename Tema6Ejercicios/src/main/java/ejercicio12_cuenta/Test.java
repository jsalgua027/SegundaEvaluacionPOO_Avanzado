/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12_cuenta;

/**
 *
 * @author Windows10
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Persona p1 = new Persona("Nacho", "Salcedo", "1234L");
        Persona p2 = new Persona("Pepe", "Perez", "5678L");

        Cuenta c1 = new CuentaAhorro(1.5, 100, p1);
        Cuenta c2 = new CuentaCorriente(100, p2);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println("");
        System.out.println("Añado saldo de 1000 euros a la cuenta de ahorro");
        c1.ingresar(1000);
        c2.ingresar(1000);
        System.out.println("");
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println("");
        System.out.println("Voy a retirar 2000 euros a la cuenta de ahorro");
        c1.retirarSaldo(2000);
        System.out.println("");
        System.out.println("El saldo mínimo de la cuenta corriente es 100, voy ha retirar 1000 teniendo 1000 en la cuenta");
        c2.retirarSaldo(1000);
        System.out.println("");
        System.out.println("El saldo mínimo de la cuenta corriente es 100, voy ha retirar 900 teniendo 1000 en la cuenta");
        c2.retirarSaldo(900);
        System.out.println("");
    }

}
