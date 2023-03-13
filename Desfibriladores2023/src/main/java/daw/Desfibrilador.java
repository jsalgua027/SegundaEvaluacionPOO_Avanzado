
package daw;

import java.util.Objects;

public class Desfibrilador {
    
    private String id;
    private String modelo;
    private String direccion;
    private String email; // email de la persona de contacto encargada del aparato
    private String telefono; // teléfono de la persona de contacto encargada del aparato

    public Desfibrilador(String id, String nombre, String direccion, String email, String telefono) {
        this.id = id;
        this.modelo = nombre;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return modelo;
    }

    public void setNombre(String nombre) {
        this.modelo = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id);
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
        final Desfibrilador other = (Desfibrilador) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Desfibrilador{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(modelo);
        sb.append(", direccion=").append(direccion);
        sb.append(", email=").append(email);
        sb.append(", telefono=").append(telefono);
        sb.append('}');
        return sb.toString();
    }
        
}
