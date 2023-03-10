/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14_electrodomestico;

/**
 *
 * @author nacho
 */
public class CampanaExtractora extends Electrodomestico {

    private double decibelios; // db

    public CampanaExtractora(double decibelios, double consumo, String modelo) {
        super(consumo, modelo);

        if (decibelios < 50) {
            this.decibelios = 50;

        }
        this.decibelios = decibelios;

    }

    public double getDecibelios() {
        return decibelios;
    }

    public void setDecibelios(double decibelios) {
        if (decibelios < 50) {
            this.decibelios = 50;

        }
        this.decibelios = decibelios;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CampanaExtractora{");
        sb.append("decibelios=").append(decibelios);
        sb.append('}');
        return sb.toString();
    }

}
