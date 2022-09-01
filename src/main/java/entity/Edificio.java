package entity;

public class Edificio {
    private float avaluoxmt;

    public Edificio() {
    }

    public Edificio(float avaluoxmt) {
        this.avaluoxmt = avaluoxmt;
    }

    public float getAvaluoxmt() {
        return avaluoxmt;
    }

    public void setAvaluoxmt(float avaluoxmt) {
        this.avaluoxmt = avaluoxmt;
    }

    //No se especifica que debe hacer este metodo
    public float valuar(Integer superficie) {
        return avaluoxmt * superficie;
    }

    //No se especifica que debe hacer este metodo
    public Edificio demoler() {
        return null;
    }

    @Override
    public String toString() {
        return "Edificio{" +
                "avaluoxmt=" + avaluoxmt +
                '}';
    }

    public static EdificioBuilder builder() {
        return new EdificioBuilder();
    }

    public static class EdificioBuilder {
        private Edificio edificio;

        public EdificioBuilder() {
            this.edificio = new Edificio();
        }

        public EdificioBuilder avaluoXmt(float avaluo) {
            this.edificio.setAvaluoxmt(avaluo);
            return this;
        }

        public Edificio build() {
            return this.edificio;
        }
    }
}
