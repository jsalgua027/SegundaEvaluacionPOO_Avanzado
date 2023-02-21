/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b;

import java.lang.reflect.Array;
import javax.swing.JOptionPane;

/**
 *
 * @author Windows10
 */
public class JOptionStringMetodos {

    /**
     * @param args the command line arguments
     */
    public static int indiceString(String aux, char busqueda) {
        int posicion = 0;

        posicion = aux.indexOf(busqueda);
        return posicion;

    }

//    public static int[] posiciones(String aux, char busqueda){
//     int [] auxEnteros;
//     int contador;
//     char[] auxChar;
//     auxChar=aux.toCharArray();
//        for (int i = 0; i < auxChar.length; i++) {
//            if(busqueda)
//        }
//  
//      
//      
//    }
//    
    public static void esMayuscula(char s) {

        if (Character.isUpperCase(s)) {
            System.out.println("Es mayusula");
        }
    }

    public static void esMinuscula(char s) {

        if (Character.isLowerCase(s)) {
            System.out.println("Es Minuscula");
        }
    }
    
    public static  int valorUnicode(char s){
     int valor= 0;
        
     return valor=Character.getNumericValue(s);
    }

    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Introduce una frase cualquiera");

        System.out.println(frase);

        System.out.println(indiceString(frase, 'e'));

//        //  int[] posiciones=posiciones(frase, 'e');
//        System.out.println("Imprimo el arrau con las posiciones, la frase es hola me gusta el mar.   en busqueda pongo la e");
//        for (int i = 0; i < posiciones.length; i++) {
//            System.out.println(posiciones[i]);
//        }


    char[] conversion = frase.toCharArray();
        for (int i = 0; i < conversion.length; i++) {
            esMayuscula(conversion[i]);
            esMinuscula(conversion[i]);
            System.out.println(valorUnicode(conversion[i]));
        }
    
        System.out.println("Imprimo la frase sin espacios y miro su tamaño");
        String sinEspacios=frase.replaceAll(" ", "");
        System.out.println(sinEspacios);
        System.out.println("Sin espacios ocupa " + sinEspacios.length());
        

    }

}
