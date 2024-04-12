package material;

public class Dvd extends Material implements Prestable{


    public Dvd(Estado disponibilidad){
        super(disponibilidad);
    }

    @Override
    public boolean isPrestable() {
        return false;
    }
}
