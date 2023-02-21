/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c;

/**
 *
 * @author Windows10
 */
public class Mesa extends Mueble{
    
    private String tablero;

    public Mesa() {
    }

    public Mesa(String tablero, String color, double peso) {
        super(color, peso);
        this.tablero = tablero;
    }

    public String getTablero() {
        return tablero;
    }

    public void setTablero(String tablero) {
        this.tablero = tablero;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
          sb.append(super.toString());
        sb.append("Mesa{");
        sb.append("tablero=").append(tablero);
        sb.append('}');
        return sb.toString();
    }

    
    public void estabarnizada(){
        System.out.println("La mesa esta barnizada");
    
    }
    
    
    
    
    
    
    @Override
    public void pesoTotal(double cantidad) {
      this.setPeso(cantidad*2);
    }
    
    
    
    
    
}
