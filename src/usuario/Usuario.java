package usuario;

import java.util.Objects;

public abstract class Usuario {

    private String nombre = "";
    private String correo = "";

    Usuario(String nombre, String correo){
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nombre, usuario.nombre) && Objects.equals(correo, usuario.correo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, correo);
    }
}
