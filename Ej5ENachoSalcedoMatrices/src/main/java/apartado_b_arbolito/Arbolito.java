/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apartado_b_arbolito;

import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class Arbolito {

    /**
     * @param args the command line arguments
     */
    
//        *                       fila 0 espacios 7
//      ***                      fila 1 espacios 6
//     *****                    fila 2 espacios 5
//    *******                  fila 3 espacios 4
//   *********                fila 5 espacios 3
//  ***********              fila 6 espacios 2
// *************            fila 7 espacios 1
//***************          fila 8 espacios 0
//          *                     fila 9 espacios 7
//          *                     fila 10 espacios 7
    
     public static void imprimirMatriz(char[][] origen) {

        for (int i = 0; i < origen.length; i++) {
            for (int j = 0; j < origen[i].length; j++) {
                System.out.print( origen[i][j] );
            }
            System.out.println("");
        }
    }
     
     public static char[][] rellenarArbol( int filas, int coumnas ){
       int altura= filas-2;
       int contadorPosicionesLibres=0;
       int contadorPosicionesOcupadas=0;
      char  libre=' ';
      char relleno='1';
     char[][] arbol = new char [filas][coumnas];
         for (int i = 0; i < arbol.length; i++) {
             for (int j = 0; j < arbol[i].length; j++) {
               if(j<altura-j || j>altura+j){
               arbol[i][j]=libre;
               }else{
               arbol[i][j]=relleno;
               }
             }
         }
     
     
     return arbol;
     }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int altura=0;
         char  libre='x';
      char relleno='1';
        // obtego el numero de filas 
        int numeroColumnas= 1;
        
        System.out.println("Dime la altura de la copa del arbol");
        altura= teclado.nextInt();
         int numeroFilas =  altura+2;
        // bucle para obtener el numero de columnas
        for (int i = 0; i < altura-1; i++) {
            numeroColumnas= numeroColumnas+2;
        }
            System.out.println("El numero de columnas seria:  " + numeroColumnas+ " El numero de filas: "+numeroFilas);
        
        char[][] arbol = new char[numeroFilas][numeroColumnas];
         for (int i = 0; i < arbol.length; i++) {
             for (int j = 0; j < arbol[i].length; j++) {
               if(!(j<altura-j && j>altura+j)){
               arbol[i][j]=libre;
               }else{
               arbol[i][j]=relleno;
               }
             }
         }
        System.out.println("");
        
        imprimirMatriz(arbol);
        
        
    }
    
}
