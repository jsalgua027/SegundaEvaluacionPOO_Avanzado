/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoria_recursividad;

/**
 *
 * @author nacho
 */
public class FactorialVico {

    /**
     * @param args the command line arguments
     */
    
    
    public static int factorialIterativo(int n){
      int resultado=1;
      int numero= Math.abs(n);
        for (int i = 1; i <= numero; i++) {
            resultado*=i;
        }
    
        return resultado;
    }
    
    public static int factorialRecursivo(int n){
      int numero= Math.abs(n); // simplemente para asegurar que es positob 
      
      if (numero==0|| numero ==1){// caso base
      return 1;
      
      }else{
      
      return n*factorialRecursivo(numero-1);
      }
    
    
    }
    
    
    public static void main(String[] args) {
        System.out.println(factorialIterativo(5));
        
        System.out.println(factorialRecursivo(5));
        
    }
    
}
