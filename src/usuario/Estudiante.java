package usuario;

public class Estudiante extends Usuario{

    private static int matricula = 1000;
    private static final int diasPrestamo = 7;
    private static final int maxMateriales = 3;

    public Estudiante(String nombre, String correo) {
        super(nombre, correo);
        matricula++;
    }

    public static int getMatricula() {
        return matricula;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
