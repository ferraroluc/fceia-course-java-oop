public class Main {
    public static void main(String[] args) {
        // objects
        Student s = new Student("Carlos", 23);
        UniversityStudent us = new UniversityStudent("Daniel", 30, "Ingeniería Informática");

        // print
        System.out.println("Estudiante: " + s);
        System.out.println("Estudiante Universitario: " + us);
    }
}