package Exercises;

public class Padre {
    String apellido;

    // Constructor que acepta un String
    public Padre(String apellido) {
        this.apellido = apellido;
    }

    public boolean test() {
        Hijo hijo = new Hijo("Perez", "Juan");
        
        EspirituSanto es = new EspirituSanto("Perez", "Juan", "Lopez");
        
        return es.pruebaPaternidad();
    }
}