/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

/**
 *
 * @author Windows10
 */
public class Pictorico extends Conservador {

    public Pictorico(String numColegiado, String nif, String nombre) {
        super(numColegiado, nif, nombre);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Pictorico{");
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void restaurar() {

        System.out.println("Restaura Pinturas");
    }

}
