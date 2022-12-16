/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composicioclases;

/**
 *
 * @author nacho
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Rueda di= new Rueda(255, "MIchelin");
        Rueda dd= new Rueda(255, "MIchelin");
        Rueda ti= new Rueda(255, "MIchelin Low Cost");
        Rueda td= new Rueda(255, "MIchelin Low Cost");
        
        Ventana ventanaPiloto= new Ventana(false);
        Ventana ventanaCopiloto= new Ventana(false);
        
        Puerta piloto = new Puerta(ventanaPiloto, false);
        Puerta copiloto = new Puerta(ventanaCopiloto, false);
        
        Motor motor = new Motor(95, false);
        
        Coche coche1= new Coche(ti, dd, 
                ti, td, motor, 
                piloto, copiloto, "1234ff");
        
        
        System.out.println(coche1);
        
        
        // abre la ventana de la puerta del piloto
        
        coche1.getPuertaPiloto().getVentana().abrir();
        
        // arrancar coche 
        
        coche1.getMotor().arrancar();
        
        
        
    }
    
}
