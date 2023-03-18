/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

/**
 *
 * @author Windows10
 */
public final class Pintura extends Obra  implements Comparable<Pintura>{
    
    
    private double valor;

    public Pintura(double valor, String id, String autor, TipoObra estilo) {
        super(id, autor, estilo);
        this.valor = valor;
    }

   

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Pintura{");
        sb.append("valor=").append(valor);
        sb.append('}');
        return sb.toString();
    }

    
    
    

    @Override
    void descripcion() {
     String aux="";
                       
        switch (this.getEstilo()) {
            case Expresionismo -> {
                aux= """
                                        El expresionismo fue un movimiento artístico, cinematográfico, musical y
                                          literario que comenzó como estilo pictórico en Alemania durante la transición del siglo XIX al siglo XX.
                                                         """;
                System.out.println(aux);
            }
                  case Impresionismo -> {
                      aux= """
                                               El impresionismo es un estilo pictórico que se origina en Francia,
                                               en la segunda mitad del siglo XIX.
                                                                     """;
                      System.out.println(aux);
            }
                  case Abstracto -> {
                      aux= """
                                                   Arte del siglo XX. El arte abstracto surgió a inicios del siglo XX y perdura hasta nuestros días.
                                                  La abstracción se caracteriza por no representar figuras reconocibles y concretas del mundo real,
                                                  sino por proponer una realidad distinta y subjetiva a través de formas, colores y líneas.
                                                                     """;
                      System.out.println(aux);
            }
                  case Surrealismo -> {
                      aux= """
                                                  El surrealismo fue un movimiento artístico y literario que utilizó la fantasía,
                                                   los mitos y las imágenes oníricas para crear arte.
                                                   El movimiento surrealista comenzó en Europa en la década de 1920
                                                   como reacción a las atrocidades de la Primera Guerra Mundial
                                                   y a los valores culturales y políticos de la época.
                                                                     """;
                      System.out.println(aux);
            }
                  case Arte_pop -> {
                      aux= """
                                               El pop art es un movimiento que surge a finales de 1950 en Inglaterra y, más tarde, en 1960 en Estados Unidos.
                                                     Su auge dura aproximadamente hasta la década de los años 80.
                                                                     """;
                      System.out.println(aux);
            }
          
        }
        
        
    }

    // implemento la  interface comparable para ordenar en un futuro por el valor de las obras
    
    @Override
    public int compareTo(Pintura o) {
    return Double.compare(this.valor, o.getValor());
    }
    
}
