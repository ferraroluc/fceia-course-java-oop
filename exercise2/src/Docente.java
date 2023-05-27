public class Docente extends Persona {
    private String materia = "";

    public Docente(String nombre, String materia) {
        super(nombre);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void identificarse() {
        System.out.println("Soy " + getNombre() + ", un docente que dicta " + materia);
    }

    @Override
    public String toString() {
        String content = super.toString().substring(1, super.toString().length() - 1);
        return "{" +
                content + ", " +
                "materia='" + materia + '\'' +
                '}';
    }
}
