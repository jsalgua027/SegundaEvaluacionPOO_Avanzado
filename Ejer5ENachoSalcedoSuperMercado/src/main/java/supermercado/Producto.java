/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package supermercado;

import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public record Producto(String nombre, int cantidad, double precio, int iva) {

   public static Producto generarProducto() {
        Scanner teclado = new Scanner(System.in);
        String nombre = "";
        int cantidad = 0;
        double precio = 0;
        int iva = 0;
        System.out.println("¿Nombre del producto?");
        nombre = teclado.nextLine();
        teclado.nextLine();
        do {
            System.out.println("¿Indicque la cantidad?");
            cantidad = teclado.nextInt();
        } while (cantidad <= 0);
        do {
            System.out.println("¿Indicque el precio?");
            precio = teclado.nextDouble();
        } while (precio <= 0);

        do {
            System.out.println("Indique el iva; recuerde solo es posible: 4 o 10 o 21 %");
            iva = teclado.nextInt();
        } while (!(iva == 4 || iva == 10 || iva == 21));
        Producto aux = new Producto(nombre, cantidad, precio, iva);
        return aux;
    }

}
