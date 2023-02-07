/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calendario;

/**
 *
 * @author Windows10
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public  static  void imprimirMatrizAux(int[][] aux) {
          
          for (int i = 0; i < aux.length; i++) {
              for (int j = 0; j < aux[i].length; j++) {
                  System.out.print(aux[i][j]);
              }
              System.out.println(" ");
          }
         
        }
    
    
    public static void main(String[] args) {
    Calendario aux = new Calendario(1, 2023);
    
    Calendario.imprimirMatriz(aux);
    
        System.out.println("****************************************************");
    
    int[][] ca= Calendario.rellenarCalendario(1, 2023);
        imprimirMatrizAux(ca);
    
     
    
    }
    
}
