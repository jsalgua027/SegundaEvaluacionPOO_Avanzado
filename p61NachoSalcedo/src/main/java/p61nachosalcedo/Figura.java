/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61nachosalcedo;

import java.util.Objects;

/**
 *
 * @author nacho
 */
public abstract class Figura {
    
     private String id;
     private String color;

    public Figura(String id, String color) {
        this.id = id;
        this.color = color;
    }

    public Figura() {
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public  final int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Figura{");
        sb.append("id=").append(id);
        sb.append(", color=").append(color);
        sb.append('}');
        return sb.toString();
    }

    
    
    @Override
    public  final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Figura other = (Figura) obj;
        return Objects.equals(this.id, other.id);
    }
     
      abstract  double  area();
      
      
     
}
