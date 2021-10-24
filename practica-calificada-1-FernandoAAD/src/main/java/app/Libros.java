package app;


public class Libros {

    private final String nombre;
    private final Integer anho;
    private final String author;

    public Libros(String nombre, Integer anho, String author) {
        this.nombre = nombre;
        this.anho = anho;
        this.author = author;
    }

    // Metodos
    public String getNombre() {
        return nombre;
    }

    public Integer getAnho() {
        return anho;
    }

    public String getAuthor() {
        return author;
    }
}
