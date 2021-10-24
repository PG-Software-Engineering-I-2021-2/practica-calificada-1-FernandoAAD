package app;

import java.util.HashMap;
import java.util.Map;

public class ChatBot {
    private static ChatBot instance;

    private Map<Integer, Libro> libros = new HashMap<>();
    private Map<Integer, Autor> autores = new HashMap<>();
    private Map<Integer, Ofertas> ofertas = new HashMap<>();
    private Map<Integer, Estudiante> estudiantes = new HashMap<>();

    private ChatBot() {}

    // Registro de libros
    public void registrarLibro(Integer id, String nombre, Integer anho, String autor){
        libros.put(id, new Libro(nombre, anho, autor));
    }

    // Registro de Autores
    public void registrarAutor(Integer id, String nombre, String fecNac) {
        autores.put(id, new Autor(nombre, fecNac));
    }

    // Registrar Ofertas
    public void registrarOferta(Integer id, String comienzo, String fin) {
        ofertas.put(id, new Ofertas(comienzo, fin));
    }

    // Registro de estudiantes
    public void registrarEstudiante(Integer id, String email, String celular ) {
        estudiantes.put(id, new Estudiante(email, celular));
    }

    // Busqueda por id
    public Libro busqAutor(Integer id){
        return libros.get(id);
    }







    // Solo se puede tener una instancia de Oliver
    public static ChatBot getInstance() {
        if(instance == null){
            instance = new ChatBot();
        }
        return instance;
    }
}

