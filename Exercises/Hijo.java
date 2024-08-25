package Exercises;

public class Hijo {
    private String apellidoPadre;
    private String nombre;

    // Constructor que recibe el apellido del padre y el nombre del hijo
    public Hijo(String apellidoPadre, String nombre) {
        this.apellidoPadre = apellidoPadre;
        this.nombre = nombre;
    }

    // Getters para acceder a los atributos
    public String getApellidoPadre() {
        return apellidoPadre;
    }

    public String getNombre() {
        return nombre;
    }
}