import material.Material;
import usuario.Prestamo;
import usuario.Usuario;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Usuario> usuarios;
    private ArrayList<Material> materiales;
    private ArrayList<Prestamo> prestamos;

    public Biblioteca(ArrayList<Usuario> usuarios, ArrayList<Material> materiales, ArrayList<Prestamo> prestamos) {
        this.usuarios = usuarios;
        this.materiales = materiales;
        this.prestamos = prestamos;
    }
}

