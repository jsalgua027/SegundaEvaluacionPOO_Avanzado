/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12_cuenta;

import java.util.HashSet;
import java.util.Set;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author Windows10
 */
public abstract class Cuenta {
    private String numeroCuenta;
    private  double saldo;
    private Persona cliente;

    public Cuenta() {
    }

    public Cuenta( Persona cliente) {
      
        this.numeroCuenta = numeroCuentaAle();
        this.saldo = 0;
        this.cliente = cliente;
    }
    
    
    private String numeroCuentaAle(){
    Set <String> generados = new HashSet<>();
        boolean repetir =false;
        String resultado="";
        while (!repetir) {            
                  String numeroAux=RandomStringUtils.randomNumeric(20);
                  if (!generados.contains(numeroAux)){
                  generados.add(numeroAux);
                  resultado=numeroAux;
                  repetir=true;
                  }
        }
    return  resultado;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }
            
    
    public abstract void actualizarSaldo();
    
    
    public abstract void retirarSaldo(double cantidad);
    
    public abstract void ingresar(double cantidad);
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cuenta{");
        sb.append("numeroCuenta=").append(numeroCuenta);
        sb.append(", saldo=").append(saldo);
        sb.append(", cliente=").append(cliente);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
