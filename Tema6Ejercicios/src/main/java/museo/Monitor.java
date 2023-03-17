/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

/**
 *
 * @author Windows10
 */
public final class Monitor extends Empleado {
    
    private final double SUELDO_HORA =12.5;

    public Monitor(String nif, String nombre) {
        super(nif, nombre);
    }

    public double getSUELDO_HORA() {
        return SUELDO_HORA;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
         sb.append(super.toString());
        sb.append("Monitor{");
        sb.append("SUELDO_HORA=").append(SUELDO_HORA);
        sb.append('}');
        return sb.toString();
    }
    
    

    @Override
    void calcularSueldo(double Horas) {
      double resultado=0;
      resultado=this.SUELDO_HORA*Horas;
      
        System.out.println("EL sueldo total según las horas trabajadas es de : " + resultado);
      
    }
    
}
