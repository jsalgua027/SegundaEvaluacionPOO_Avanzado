/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trenes;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Windows10
 */
public class MatrizTrenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] trenes
                = {
                    {121, 20, 30, 0, 0},
                    {122, 100, 20, 22, 0},
                    {123, 50, 10, 0, 10},
                    {124, 0, 30, 20, 0}
                };
Map <Integer,Tren>listaTrenes= new TreeMap<>();
        int valores=0;
         int contadorVagones=0;
         
        for (int i = 0; i < trenes.length; i++) {
               Tren aux= new Tren();
            for (int j = 1; j < trenes[i].length; j++) {
                
            
                aux.setId(trenes[i][0]);
                valores=valores+trenes[i][j];
                if(trenes[i][j]>0){
                contadorVagones++;
                }
            }
            
            aux.setNumeroTotalPasajeros(valores);
            aux.setNumeroVagones(contadorVagones);
            contadorVagones=0;
            valores=0;
              listaTrenes.put(trenes[i][0], aux);
        }
      
        for (Integer Key : listaTrenes.keySet()) {
            System.out.printf("Clave %s -- Objeto %s %n ", Key, listaTrenes.get(Key));
        }
        
        
        
    }

}
