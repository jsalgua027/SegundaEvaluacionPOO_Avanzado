/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15_legislador;

/**
 *
 * @author Windows10
 */
public abstract class Legislador extends Persona {

    private String provincia;
    private String partidoPolitico;

    public Legislador(String nombre, String apellidos) {
        super(nombre, apellidos);
    }

    public Legislador(String provincia, String partidoPolitico, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.provincia = provincia;
        this.partidoPolitico = partidoPolitico;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public abstract void getCamaraEnQueTrabaja();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());

        sb.append(" De la provincia=").append(provincia);
        sb.append(", partidoPolitico=").append(partidoPolitico);

        return sb.toString();
    }

}
