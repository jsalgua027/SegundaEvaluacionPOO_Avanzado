/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author nacho
 */
public class Coro {

    private static Random aleatorio = new Random();

    public Coro() {
    }

    public static List<Voz> generarVoces(int numero) {
        List<Voz> aux = new ArrayList();

        if (numero >= 6) {
            for (int i = 0; i < numero; i++) {
                int random = aleatorio.nextInt(6);

                switch (random) {
                    case 1:
                        aux.add(Voz.CONTRATENOR);
                        break;
                    case 2:
                        aux.add(Voz.TENOR);
                        break;
                    case 3:
                        aux.add(Voz.BARITONO);
                        break;
                    case 4:
                        aux.add(Voz.SOPRANO);
                        break;
                    case 5:
                        aux.add(Voz.MEZZOSOPRANO);
                        break;
                    case 6:
                        aux.add(Voz.CONTRALTO);
                        break;
                    default:

                }

            }

        } else {
            throw new IllegalArgumentException();
        }

        return aux;

    }
    
    public static int getNumeroCorosMixtos (List<Voz> aux){
    int contador= 0;
        for (int i = 0; i < aux.size(); i++) {
            if(aux.contains(aux.get(i).BARITONO)&&aux.contains(aux.get(i).TENOR)
                    && aux.contains(aux.get(i).CONTRALTO)&&aux.contains(aux.get(i).SOPRANO)&&
                    aux.contains(aux.get(i).MEZZOSOPRANO)&& aux.contains(aux.get(i).CONTRALTO)){
             contador++;
            
            }
            
            
        }
  
    
    return contador;
    
    }
    
    
    
    

}
