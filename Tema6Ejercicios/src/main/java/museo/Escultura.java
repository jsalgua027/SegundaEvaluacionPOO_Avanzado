/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

/**
 *
 * @author Windows10
 */
public final class Escultura extends Obra implements Comparable<Escultura> {

    private double peso;
    private boolean material; // false marmol; true granito

    public Escultura(double peso, boolean material, String id, String autor, TipoObra estilo) {
        super(id, autor, estilo);
        this.peso = peso;
        this.material = material;
    }

    public double getPeso() {
        return peso;
    }

    public boolean isMaterial() {
        return material;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Escultura{");
        sb.append("peso=").append(peso);
        sb.append(", material=").append(material);
        sb.append('}');
        return sb.toString();
    }

    @Override
    void descripcion() {
        String aux = """
                    """;
        if (this.material) {

            aux = """
                    El granito, tiene un aspecto más pecoso,
                    repleto de pequeñas piedrecitas entrometidas como feldespato, mica y anfíbol
                
                """;

            System.out.println(aux);
        } else {

            aux = """
                    el mármol suele ser un material mucho más limpio y liso, 
                con vetas alargadas que dibujan un líneas onduladas sobre la piedra.
                
                """;

            System.out.println(aux);

        }

    }

    // implemento la interface para ordenar por peso
    @Override
    public int compareTo(Escultura o) {
        return Double.compare(this.peso, o.getPeso());
    }

}
