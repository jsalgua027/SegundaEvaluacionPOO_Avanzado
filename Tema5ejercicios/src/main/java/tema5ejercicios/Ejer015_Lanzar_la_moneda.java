/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5ejercicios;

/**
 *
 * @author Windows10
 */
public class Ejer015_Lanzar_la_moneda {

    /**
     * @param args the command line arguments
     *
     * Escribe una clase LanzarMoneda que tenga como único atributo un array de
     * booleanos de tamaño 1000. La clase tendrá los siguientes métodos: un
     * método para rellenar el array, de forma que simule 1000 lanzamientos de
     * una moneda. El método debe almacenar el resultado de cada tirada en el
     * array. un método para saber cuántas “caras” salieron después de los
     * lanzamientos. un método para saber cuántas “cruces” salieron después de
     * los lanzamientos. un método para imprimir el resultado de los 1000
     * lanzamientos, de forma que aparezca el número de lanzamiento y el
     * resultado (cara o cruz)
     *
     */
    
    
    public static void rellenarArray(boolean[] a) {
        boolean moneda = true;//cara
        for (int i = 0; i < a.length; i++) {
            a[i] = moneda;
            if (a[i] == true) {
                moneda = false;//false cruz

            } else if (a[i] == false) {
                moneda = true;
            }
        }

    }

    public static int contadorCaras(boolean[] a) {
        int contador = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == true) {
                contador++;
            }
        }

        return contador;
    }
    
    
     public static int contadorCruces(boolean[] a) {
        int contador = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == false) {
                contador++;
            }
        }

        return contador;
    }
    

    public static void main(String[] args) {
        int tamanio = 10;
        boolean[] monedas = new boolean[tamanio];

        rellenarArray(monedas);
        for (int i = 0; i < monedas.length; i++) {
            System.out.println("- " + monedas[i]);
        }
        int contadorCaras= contadorCaras(monedas);
        System.out.println("El array tiene: "+ contadorCaras+ " caras");
        
        int contadorCruces = contadorCruces(monedas);
        System.out.println("El array tiene: " +contadorCruces+ " cruces");
    }

}
