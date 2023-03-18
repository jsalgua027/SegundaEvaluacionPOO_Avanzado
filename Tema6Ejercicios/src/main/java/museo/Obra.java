/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

import java.util.Objects;

/**
 *
 * @author Windows10
 */
public abstract class Obra {

    private String id;
    private String autor;
    private TipoObra estilo;

    public Obra() {
    }

    public Obra(String id, String autor, TipoObra estilo) {
        this.id = id;
        this.autor = autor;
        this.estilo = estilo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public TipoObra getEstilo() {
        return estilo;
    }

    public void setEstilo(TipoObra estilo) {
        this.estilo = estilo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.id);
        hash = 17 * hash + Objects.hashCode(this.autor);
        hash = 17 * hash + Objects.hashCode(this.estilo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Obra other = (Obra) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Obra{");
        sb.append("id=").append(id);
        sb.append(", autor=").append(autor);
        sb.append(", estilo=").append(estilo);
        sb.append('}');
        return sb.toString();
    }
    
    abstract  void descripcion();
    

}
