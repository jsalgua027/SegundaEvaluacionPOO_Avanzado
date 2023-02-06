/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoria_recursividad;

/**
 *
 * @author nacho
 */
public class ImprimirNumeros {

    /**
     * @param args the command line arguments
     *
     *
     *
     */
    // metodo recursivo
    public static void imprimirNumeroRecursivo(int numero) {
        if (numero > 0) {//caso base
            imprimirNumeroRecursivo(numero - 1);
        }

        System.out.println(numero);

    }

    // metodo factorial iteractico
    public static void factorialIteractivo(int numero) {
        int aux = 0;
        for (int i = numero; i >=0; i--) {
            aux += numero * (numero - 1);

        }
        System.out.println(aux);
    }
    
    //metodo recursivo factorial
    
    public static void factorialRecursivo(int numero){
        System.out.println(numero);
    if (numero>=0){
    
       factorialRecursivo(numero*(numero-1));
    }
    
    
    }

    public static void main(String[] args) {

//        imprimirNumeroRecursivo(5);
   //     factorialIteractivo(5);

        
        factorialRecursivo(5);
        
        
    }

}
