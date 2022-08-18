package entity;

public class Edificio {
    private float avaluoxmt;

    public Edificio(float avaluoxmt) {
        this.avaluoxmt = avaluoxmt;
    }

    public float getAvaluoxmt() {
        return avaluoxmt;
    }

    public void setAvaluoxmt(float avaluoxmt) {
        this.avaluoxmt = avaluoxmt;
    }

    public void valuar() {

    }

    public void demoler() {

    }

    @Override
    public String toString() {
        return "Edificio{" +
                "avaluoxmt=" + avaluoxmt +
                '}';
    }
}
