package usuario;

public class Profesor extends Usuario{

    private static int legajo = 1000;
    private static final int diasPrestamo = 14;
    private static final int maxMateriales = 5;

    public Profesor(String nombre, String correo){
        super(nombre, correo);
        legajo++;
    }

    public static int getLegajo() {
        return legajo;
    }

}
