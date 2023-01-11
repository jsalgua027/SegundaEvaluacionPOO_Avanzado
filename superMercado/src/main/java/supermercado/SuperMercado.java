/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package supermercado;

/**
 *
 * @author nacho
 */
public class SuperMercado {

    /**
     * @param args the command line arguments
     */
    public static Ticket generarTicket(Caja c) {
        Ticket aux = new Ticket(c);
        return aux;
    }

    public static void main(String[] args) {
      
        // creo productos (A) 
        Producto lataCocaCola = new Producto("LataCocaCola", 3, 1.10, 4);
        Producto pan = new Producto("Pan de molde", 1, 0.65, 4);
        Producto leche = new Producto("LecheEntera", 1, 1.25, 10);
        Producto salchichon = new Producto("Salchichon", 1, 0.85, 21);
        Producto champu = new Producto("Cham Jonson", 1, 1.00, 21);
        Producto natillas = new Producto("Natillas", 1, 2.35, 10);
        Producto cerveza = new Producto("Estre Galicia", 1, 2.00, 21);

        // creo una caja (B)
        Caja caja1 = new Caja();
       
          Ticket t1 = new Ticket(caja1);
        // añado productos (C)
        caja1.getCinta().añadirProducto(lataCocaCola);
         caja1.getCinta().añadirProducto(pan);
         caja1.getCinta().añadirProducto(leche);
        caja1.getCinta().añadirProducto(salchichon);
         caja1.getCinta().añadirProducto(champu);
         caja1.getCinta().añadirProducto(natillas);
        caja1.getCinta().añadirProducto(cerveza);
        //Genero el ticket (D)
        t1 = generarTicket(caja1);
        // compruebo el metodo de ver si esta vacia la cja
        System.out.println("¿Esta vacia la caja:? " + caja1.getCinta().estaVacia());

        //Imprimo el tikect (E)
        System.out.println(t1.impresionTicket());
    }

}
