package material;

public abstract class Material {
    private Estado disponibilidad;

    public Material(Estado disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}
