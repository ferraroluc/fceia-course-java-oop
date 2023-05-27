import java.util.*;

public class MainExample {
    public static void main(String[] args) {
        Persona p = new Persona("Juan");
        Docente d = new Docente("Carlos", "Ingeniería de Software");
        Empresario e = new Empresario("Daniel", 400000);

        // Método implícito polimórfico
        System.out.println("\n====== ToString ======");
        System.out.println(p);
        System.out.println(d);
        System.out.println(e);

        // Método polimórfico
        System.out.println("\n====== Identificarse ======");
        p.identificarse();
        d.identificarse();
        e.identificarse();

        // Variable polimórfica
        System.out.println("\n====== Variable polimórfica ======");
        Persona p1;
        p1 = e;
        p1.identificarse();

        // Estructura de datos polimórfica
        System.out.println("\n====== Estructura de datos polimórfica ======");
        Persona []aps = new Persona[4];
        aps[0] = new Persona("Gabriel");
        aps[1] = new Docente("Ana", "Derecho Informático");
        aps[2] = new Empresario("Germán", 600000);
        aps[3] = new Docente("Luis", "Ingeniería Web");

        for (Persona px:aps) {
            px.identificarse();
        }

        // Colección
        System.out.println("\n====== Colección ======");
        Collection coleccion = new ArrayList<>();

        // Agregar
        System.out.println("\n====== Agregando ======");
        coleccion.add(p);
        coleccion.add(d);
        coleccion.add(e);
        coleccion.add("String de ejemplo");
        coleccion.add(12);

        for(Object o: coleccion) {
            System.out.println(o);
        }

        System.out.println("La cantidad de objetos que tengo en la colección es: "+ coleccion.size() );

        // Eliminar
        System.out.println("\n====== Eliminando ======");
        coleccion.remove(12);

        for (Object o: coleccion) {
            System.out.println(o);
        }

        System.out.println("La cantidad de objetos que tengo en la colección es: "+ coleccion.size() );

        // Conjuntos
        System.out.println("\n====== Conjuntos ======");
        Set<String> conjunto1 = new TreeSet<>();
        Set<Integer> conjunto2 = new HashSet<>();
        Set<Persona> conjunto3 = new LinkedHashSet<>();

        conjunto1.add("Juan");
        conjunto1.add("Martín");
        conjunto2.add(23);
        System.out.println(conjunto1);
        System.out.println(conjunto2);
    }
}