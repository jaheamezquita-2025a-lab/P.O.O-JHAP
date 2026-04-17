class Persona {
    private String documento;
    private String nombre;
    private String correo;

    public Persona(String documento, String nombre, String correo) {
        if (documento == null || documento.isEmpty()) {
            throw new IllegalArgumentException();
        }
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException();
        }
        if (correo == null || !correo.contains("@")) {
            throw new IllegalArgumentException();
        }
        this.documento = documento;
        this.nombre = nombre;
        this.correo = correo;
    }

    public String ficha() {
        return documento + " - " + nombre + " - " + correo;
    }
}

class Docente extends Persona {
    private String area;

    public Docente(String documento, String nombre, String correo, String area) {
        super(documento, nombre, correo);
        if (area == null || area.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.area = area;
    }

    public String fichaDocente() {
        return ficha() + " - " + area;
    }
}

class Administrativo extends Persona {
    private String cargo;

    public Administrativo(String documento, String nombre, String correo, String cargo) {
        super(documento, nombre, correo);
        if (cargo == null || cargo.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.cargo = cargo;
    }

    public String fichaAdministrativo() {
        return ficha() + " - " + cargo;
    }
}

public class App {
    public static void main(String[] args) {

        Persona p = new Persona("123", "Ana", "ana@uni.edu");
        Docente d = new Docente("456", "Carlos", "carlos@uni.edu", "Sistemas");
        Administrativo a = new Administrativo("789", "Laura", "laura@uni.edu", "Secretaria");

        System.out.println(p.ficha());
        System.out.println(d.fichaDocente());
        System.out.println(a.fichaAdministrativo());
    }
}