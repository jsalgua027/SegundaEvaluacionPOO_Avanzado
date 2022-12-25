/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercado;

import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class Cinta {

    private int numProductos;

    private Producto[] listaProductos;

    public Cinta(int tamanio) {

        this.numProductos = Math.abs(tamanio);
        this.listaProductos = new Producto[tamanio];
        for (int i = 0; i < this.listaProductos.length; i++) {
            this.listaProductos[i] = generarProducto();
        }
    }

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

    @Override
    public String toString() {

        String tmp = "";

        for (Producto p : listaProductos) {
            if (p != null) {
                tmp += p.toString() + "\n";
            }

        }

        return tmp;
    }

    public int getNumeroProductos() {

        return numProductos;

    }

    public void añadirProducto(Producto p) {

        if (this.numProductos < this.listaProductos.length) {

            for (int i = 0; i < this.listaProductos.length; i++) {
                if (this.listaProductos[i] == null) {
                    this.listaProductos[i] = p;
                    this.numProductos++;
                    break;
                }

            }

        } else {

            this.numProductos++;
            this.listaProductos = copiar();
            this.listaProductos[this.numProductos - 1] = p;

        }

    }

    private Producto[] copiar() {
        Producto[] aux = new Producto[this.listaProductos.length + 1];
        for (int i = 0; i < this.listaProductos.length; i++) {
            aux[i] = this.listaProductos[i];
        }
        return aux;
    }
    
    
    public boolean borrarProducto(Producto p){
    int posicion=buscarProducto(p);
    if(posicion>=0){
    
        this.listaProductos=null;
        this.numProductos--;
        return true;
    }
    return false;
    }

   public int  buscarProducto(Producto p){
    if (p !=null){
    
        for (int i = 0; i < this.listaProductos.length; i++) {
            if(this.listaProductos !=null && p.equals(this.listaProductos[i])){
            return i;
            }
        }
    }
    return -1;
   
   
   } 
    
    
}
