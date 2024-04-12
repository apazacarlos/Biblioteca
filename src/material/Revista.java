package material;

public class Revista extends Material implements Prestable{

    public Revista(Estado disponibilidad) {
        super(disponibilidad);
    }

    @Override
    public boolean isPrestable() {
        return false;
    }
}
