public class Main {
    public static void main(String[] args) {
        Estudiante e = new Estudiante("Carlos", 23);
        EstudianteUniversitario eu = new EstudianteUniversitario("Daniel", 30, "Ingeniería Informática");

        System.out.println("Estudiante: " + e);
        System.out.println("Estudiante Universitario: " + eu);
    }
}