package Exercises;

public class Padre {
    String apellido;

    public Padre(String apellido) {
        this.apellido = apellido;
    }

    public Boolean test() {
        Hijo hijo = new Hijo("Juan", this.apellido);
        EspirituSanto es = new EspirituSanto(hijo.nombre, this.apellido, "Lopez");
        return es.pruebaParternidad();
    }
    
}

class Hijo extends Padre {
    String nombre;

    public Hijo(String nombre, String apellido) {
        super(apellido);
        this.nombre = nombre;
    }
}

class EspirituSanto extends Hijo {
    String apellidoReal;

    public EspirituSanto(String nombre, String apellido, String apellidoReal) {
        super(nombre, apellido);
        this.apellidoReal = apellidoReal;
    }

    public Boolean pruebaParternidad() {
        return this.apellido.equals(this.apellidoReal);
    }
}