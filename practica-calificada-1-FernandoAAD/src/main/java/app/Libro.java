package app;


public class Libro {

    private final String nombre;
    private final Integer anho;
    private final String autor;

    public Libro(String nombre, Integer anho, String autor) {
        this.nombre = nombre;
        this.anho = anho;
        this.autor = autor;
    }

    // Metodos
    public String getNombre() {
        return nombre;
    }

    public Integer getAnho() {
        return anho;
    }

    public String getAuthor() {
        return autor;
    }
}
