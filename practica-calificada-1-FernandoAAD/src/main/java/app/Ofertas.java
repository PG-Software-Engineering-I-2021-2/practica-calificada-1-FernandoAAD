package app;

public class Ofertas {

    private final String comienzo;
    private final String fin;

    public Ofertas(String comienzo, String fin) {
        this.comienzo = comienzo;
        this.fin = fin;
    }

    public String getComienzo() {
        return comienzo;
    }

    public String getFin() {
        return fin;
    }

}
