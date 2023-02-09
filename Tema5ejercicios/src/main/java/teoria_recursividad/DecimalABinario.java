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
    
    public static void decimalBinarioIteractivo(int n){
        ArrayList<Integer> fibo = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            if(n>2){
            
            fibo.add(n%2);
            }else{
            
            n/=2;
            
            }
            
        }
    
    
    
    
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
