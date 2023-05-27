public class Persona {
    private String nombre = "";

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void identificarse() {
        System.out.println("Soy " + nombre + ", una persona");
    }

    @Override
    public String toString() {
        return "{" +
                "nombre='" + nombre + '\'' +
                "}";
    }
}
