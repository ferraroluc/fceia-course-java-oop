public class Empresario extends Persona {
    private double sueldo = 0.0;

    public Empresario(String nombre, double sueldo) {
        super(nombre);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void identificarse() {
        System.out.println("Soy " + getNombre() + ", un empresario que cobra " + sueldo);
    }

    @Override
    public String toString() {
        String content = super.toString().substring(1, super.toString().length() - 1);
        return "{" +
                content + ", " +
                "sueldo=" + sueldo +
                '}';
    }
}
