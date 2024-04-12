package material;

public class Libro extends Material implements Prestable{
    public Libro(Estado disponibilidad) {
        super(disponibilidad);
    }

    @Override
    public boolean isPrestable() {
        return false;
    }

    //Dvd dvd = new Dvd(Estado.DISPONIBLE);
}
