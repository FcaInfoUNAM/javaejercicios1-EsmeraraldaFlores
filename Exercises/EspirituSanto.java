package Exercises;

public class EspirituSanto {
    String apellidoPadre;
    String nombreHijo;
    String apellidoMadre;

    // Constructor que acepta tres Strings
    public EspirituSanto(String apellidoPadre, String nombreHijo, String apellidoMadre) {
        this.apellidoPadre = apellidoPadre;
        this.nombreHijo = nombreHijo;
        this.apellidoMadre = apellidoMadre;
    }

    // Método para prueba de paternidad (implementación de ejemplo)
    public boolean pruebaPaternidad() {
        // Lógica de prueba de paternidad (ejemplo)
        return this.apellidoPadre.equals("Perez");
    }
}
