package app;

public class Autores {

    private final String nombre;
    private final String fecNac;

    public Autores(String nombre, String fecNac){
        this.nombre = nombre;
        this.fecNac = fecNac;
    }

    // Metodos
    public String getNombre() {
        return nombre;
    }
    public String getFecNac() {
        return fecNac;
    }

}
