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
        Cuenta c3 = new CuentaAhorro(1.5, 10000, p1);

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
        System.out.println("El saldo de c1 es= " + c1.getSaldo());
        System.out.println("El saldo de c2 es= " + c2.getSaldo());
        System.out.println("");
        // por debajo de 1000
        System.out.println("Manteniendo el saldo de 100 en la cuenta corriente, Actualizamos saldo");
        c2.actualizarSaldo();
        System.out.println("El saldo actual es:" + c2.getSaldo());
        // ingreso saldo para que la cuenta este en 1500
        c2.ingresar(1298.5);
        // or encima de 1000
        System.out.println("Manteniendo el saldo de 1500 en la cuenta corriente, Actualizamos saldo");
        c2.actualizarSaldo();
        System.out.println("El saldo actual es:" + c2.getSaldo());
        System.out.println("");
        System.out.println("Siendo el saldo de 1000 en la cuenta ahorro, Actualizamos saldo");
        c1.actualizarSaldo();
        System.out.println("El saldo actual es:" + c1.getSaldo());
        System.out.println(" Pruebo con una nueva cuenta ahorro ponerla en negativo por una alta comision anual");
        c3.ingresar(1000);
        c3.actualizarSaldo();
        System.out.println("El saldo actual es:" + c3.getSaldo());

    }

}
