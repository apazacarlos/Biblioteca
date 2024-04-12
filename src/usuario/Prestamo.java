package usuario;

import material.Material;
import usuario.Usuario;

import java.util.Objects;

public class Prestamo{

    private Usuario usuario;
    private Material material;

    public Prestamo(Usuario usuario, Material material) {
        this.usuario = usuario;
        this.material = material;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    //metodos

}
