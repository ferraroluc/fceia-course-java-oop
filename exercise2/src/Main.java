import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    RegistroDePersonas rp = new RegistroDePersonas();

    Scanner s = new Scanner(System.in);

    int option = -1;
    while (option != 0) {
        System.out.println("\nMenú de opciones:");
        System.out.println("1. Insertar Persona");
        System.out.println("2. Insertar Docente");
        System.out.println("3. Insertar Empresario");
        System.out.println("4. Suprimir");
        System.out.println("5. Modificar (deshabilitada)");
        System.out.println("6. Imprimir");
        System.out.println("0. Salir");
        System.out.println("\nIngrese opción:");
        option = s.nextInt();

        switch (option) {
            case 1:
                s.nextLine();

                String nombre;
                System.out.println("Ingrese nombre:");
                nombre = s.nextLine();

                Persona p = new Persona(nombre);
                rp.insertarPersona(p);
                break;

            case 2:
                s.nextLine();

                String nombreDocente;
                System.out.println("Ingrese nombre:");
                nombreDocente = s.nextLine();
                String materiaDocente;
                System.out.println("Ingrese materia:");
                materiaDocente = s.nextLine();

                Docente d = new Docente(nombreDocente, materiaDocente);
                rp.insertarPersona(d);
                break;

            case 3:
                s.nextLine();

                String nombreEmpresario;
                System.out.println("Ingrese nombre:");
                nombreEmpresario = s.nextLine();
                Double sueldoEmpresario;
                System.out.println("Ingrese sueldo:");
                sueldoEmpresario = s.nextDouble();

                Empresario e = new Empresario(nombreEmpresario, sueldoEmpresario);
                rp.insertarPersona(e);
                break;

            case 4:
                s.nextLine();

                String nombreEliminar;
                System.out.println("Ingrese nombre:");
                nombreEliminar = s.nextLine();

                rp.eliminarPersona(nombreEliminar);
                break;

            case 5:
                System.out.println("Esta opción no se incluye en el alcance del grupo");
                break;

            case 6:
                System.out.println("\nImpresión del registro:");
                rp.imprimirRegistro();
                break;
        }
    }

    }
}