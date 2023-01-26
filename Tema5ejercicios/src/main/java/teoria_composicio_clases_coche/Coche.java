/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoria_composicio_clases_coche;

/**
 *
 * @author nacho
 */
public class Coche {
    
    
    // 4 ruedas
    
    private Rueda delanteraIzquierda;
    private Rueda delanteraDerecha;
    private Rueda traseraIzquierda;
    private Rueda traseraDerecha;
    // Motor 
    private Motor motor;
    // puertas
    private Puerta puertaPiloto;
    private Puerta puertaCopiloto;
    
    private String matricula;

    public Coche(Rueda delanteraIzquierda, Rueda delanteraDerecha, Rueda traseraIzquierda, Rueda traseraDerecha, Motor motor, Puerta puertaPiloto, Puerta puertaCopiloto, String matricula) {
        this.delanteraIzquierda = delanteraIzquierda;
        this.delanteraDerecha = delanteraDerecha;
        this.traseraIzquierda = traseraIzquierda;
        this.traseraDerecha = traseraDerecha;
        this.motor = motor;
        this.puertaPiloto = puertaPiloto;
        this.puertaCopiloto = puertaCopiloto;
        this.matricula = matricula;
    }

    public Rueda getDelanteraIzquierda() {
        return delanteraIzquierda;
    }

    public void setDelanteraIzquierda(Rueda delanteraIzquierda) {
        this.delanteraIzquierda = delanteraIzquierda;
    }

    public Rueda getDelanteraDerecha() {
        return delanteraDerecha;
    }

    public void setDelanteraDerecha(Rueda delanteraDerecha) {
        this.delanteraDerecha = delanteraDerecha;
    }

    public Rueda getTraseraIzquierda() {
        return traseraIzquierda;
    }

    public void setTraseraIzquierda(Rueda traseraIzquierda) {
        this.traseraIzquierda = traseraIzquierda;
    }

    public Rueda getTraseraDerecha() {
        return traseraDerecha;
    }

    public void setTraseraDerecha(Rueda traseraDerecha) {
        this.traseraDerecha = traseraDerecha;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Puerta getPuertaPiloto() {
        return puertaPiloto;
    }

    public void setPuertaPiloto(Puerta puertaPiloto) {
        this.puertaPiloto = puertaPiloto;
    }

    public Puerta getPuertaCopiloto() {
        return puertaCopiloto;
    }

    public void setPuertaCopiloto(Puerta puertaCopiloto) {
        this.puertaCopiloto = puertaCopiloto;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Coche{");
        sb.append("delanteraIzquierda=").append(delanteraIzquierda);
        sb.append(", delanteraDerecha=").append(delanteraDerecha);
        sb.append(", traseraIzquierda=").append(traseraIzquierda);
        sb.append(", traseraDerecha=").append(traseraDerecha);
        sb.append(", motor=").append(motor);
        sb.append(", puertaPiloto=").append(puertaPiloto);
        sb.append(", puertaCopiloto=").append(puertaCopiloto);
        sb.append(", matricula=").append(matricula);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
    
    
    
    
}
