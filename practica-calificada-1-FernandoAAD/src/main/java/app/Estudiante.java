package app;

public class Estudiante {

    private final String email;
    private final String celular;

    public Estudiante(String email, String celular){
        this.email = email;
        this.celular = celular;
    }

    // Metodos
    public String getEmail() {
        return email;
    }
    public String getCelular() {
        return celular;
    }

}
