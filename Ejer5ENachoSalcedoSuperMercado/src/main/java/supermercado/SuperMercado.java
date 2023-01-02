/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package supermercado;

/**
 *
 * @author Windows10
 */
public class SuperMercado {

    /**
     * @param c
     * @param args the command line arguments
     * @return
     */
    public static Ticket generarTicket(Caja c) {
        Ticket aux = new Ticket(c.getCinta());
        return aux;
    }

    public static void main(String[] args) {
        Ticket t1 = new Ticket();
        // creo productos (A) 
        Producto lataCocaCola = new Producto("LataCocaCola", 1, 1.10, 4);
        Producto pan = new Producto("Pan", 1, 0.65, 4);
        Producto leche = new Producto("LecheEntera", 1, 1.25, 10);
        Producto salchichon = new Producto("Salchichon", 1, 0.85, 21);
        Producto champu = new Producto("Champu", 1, 1.00, 21);
        Producto natillas = new Producto("Natillas", 1, 2.35, 10);
        Producto cerveza = new Producto("Estrella Galicia", 1, 2.00, 21);

        // creo una caja (B)
        Caja caja1 = new Caja();

        // añado productos (C)
        caja1.añadirProducto(lataCocaCola);
        caja1.añadirProducto(pan);
        caja1.añadirProducto(leche);
        caja1.añadirProducto(salchichon);
        caja1.añadirProducto(champu);
        caja1.añadirProducto(natillas);
        caja1.añadirProducto(cerveza);
        caja1.añadirProducto(lataCocaCola);
        caja1.añadirProducto(lataCocaCola);
        caja1.añadirProducto(lataCocaCola);

        t1 = generarTicket(caja1);

        System.out.println(t1);
        int prodcutosIguales= t1.catindadProductoiguales();
        System.out.println(prodcutosIguales);
    }

}
