import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // init scanner
        Scanner s = new Scanner(System.in);

        // objects
        PersonRegistration rp = new PersonRegistration();

        // menu
        int option = -1;
        while (option != 0) {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Insertar Persona");
            System.out.println("2. Insertar Docente");
            System.out.println("3. Insertar Empresario");
            System.out.println("4. Eliminar");
            System.out.println("5. Modificar (deshabilitada)");
            System.out.println("6. Imprimir");
            System.out.println("0. Salir");
            System.out.println("\nIngrese opción:");
            option = s.nextInt();

            switch (option) {
                case 1:
                    s.nextLine();

                    String name;
                    System.out.println("Ingrese nombre:");
                    name = s.nextLine();

                    Person p = new Person(name);
                    rp.addPerson(p);
                    break;

                case 2:
                    s.nextLine();

                    String teacherName;
                    System.out.println("Ingrese nombre:");
                    teacherName = s.nextLine();
                    String teacherSubject;
                    System.out.println("Ingrese materia:");
                    teacherSubject = s.nextLine();

                    Teacher d = new Teacher(teacherName, teacherSubject);
                    rp.addPerson(d);
                    break;

                case 3:
                    s.nextLine();

                    String businessmanName;
                    System.out.println("Ingrese nombre:");
                    businessmanName = s.nextLine();
                    Double businessmanSalary;
                    System.out.println("Ingrese sueldo:");
                    businessmanSalary = s.nextDouble();

                    Businessman e = new Businessman(businessmanName, businessmanSalary);
                    rp.addPerson(e);
                    break;

                case 4:
                    s.nextLine();

                    String nameToDelete;
                    System.out.println("Ingrese nombre:");
                    nameToDelete = s.nextLine();

                    rp.removePerson(nameToDelete);
                    break;

                case 5:
                    System.out.println("Esta opción no está incluida en el alcance del curso");
                    break;

                case 6:
                    System.out.println("\nImpresión del registro:");
                    rp.printRegistry();
                    break;
            }
        }

        // close scanner
        s.close();
    }
}