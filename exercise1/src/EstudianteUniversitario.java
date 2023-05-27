public class EstudianteUniversitario extends Estudiante {
    // variables
    public String carrera = "";

    // constructors
    public EstudianteUniversitario() {
        super();
        carrera = "";
    }

    public EstudianteUniversitario(String nombre, int edad, String carrera) {
        super(nombre, edad);
        this.carrera = carrera;
    }

    // carrera
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    // toString
    @Override
    public String toString() {
        String content = super.toString().substring(1, super.toString().length() - 1);
        return "{" +
                content + ", " +
                "carrera='" + carrera + '\'' +
                '}';
    }
}
