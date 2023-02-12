/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoria_recursividad;

import java.util.ArrayList;

/**
 *
 * @author nacho
 */
public class DecimalABinario {

    /**
     * @param args the command line arguments
     */
    public static void binarioRecursivo(int n){
    int conversion;
    
    if(n<=1){
        System.out.print(n);
        return ;
    }
    conversion=n%2;
        binarioRecursivo(n>>1);
        System.out.print(conversion);
                
    
    }
    
    
    public static void  decimalBinarioIteractivo(int n){
        ArrayList<Integer> bina = new ArrayList<>();
        
        while (n>=2) {
            bina.add(n%2);
            n/=2;
        }
    bina.add(n%2);
    
        for (int i = bina.size()-1; i < 0; i--) {
            System.out.println(bina.get(i));
        }
    
    }
    
    
    public static void main(String[] args) {
        System.out.println("binario Recursivo");
       
        binarioRecursivo(10);
        System.out.println("");
           System.out.println("binario Iteractivo");
        decimalBinarioIteractivo(10);
    }
    
}
