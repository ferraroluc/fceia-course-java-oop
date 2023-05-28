import java.util.*;

public class MainExample {
    public static void main(String[] args) {
        // objects
        Person p = new Person("Juan");
        Teacher t = new Teacher("Carlos", "Ingeniería de Software");
        Businessman b = new Businessman("Daniel", 400000);

        // polymorphic implicit method
        System.out.println("\n====== Método implícito polimórfico (toString) ======");
        System.out.println(p);
        System.out.println(t);
        System.out.println(b);

        // polymorphic method
        System.out.println("\n====== Método polimórfico (identificarse) ======");
        p.identify();
        t.identify();
        b.identify();

        // polymorphic variable
        System.out.println("\n====== Variable polimórfica ======");
        Person p1;
        p1 = b;
        p1.identify();

        // Polymorphic data structure
        System.out.println("\n====== Estructura de datos polimórfica ======");
        Person []ps = new Person[4];
        ps[0] = new Person("Gabriel");
        ps[1] = new Teacher("Ana", "Derecho Informático");
        ps[2] = new Businessman("Germán", 600000);
        ps[3] = new Teacher("Luis", "Ingeniería Web");

        for (Person px:ps) {
            px.identify();
        }

        // collection
        System.out.println("\n====== Colección ======");
        Collection c = new ArrayList<>();

        // add
        System.out.println("\n====== Agregar ======");
        c.add(p);
        c.add(t);
        c.add(b);
        c.add("String de ejemplo");
        c.add(12);

        for(Object o: c) {
            System.out.println(o);
        }

        System.out.println("La cantidad de objetos que tengo en la colección es: "+ c.size() );

        // remove
        System.out.println("\n====== Eliminar ======");
        c.remove(12);

        for (Object o: c) {
            System.out.println(o);
        }

        System.out.println("La cantidad de objetos que tengo en la colección es: "+ c.size() );

        // set
        System.out.println("\n====== Conjunto ======");
        Set<String> s1 = new TreeSet<>();
        Set<Integer> s2 = new HashSet<>();
        Set<Person> s3 = new LinkedHashSet<>();

        s1.add("Juan");
        s1.add("Martín");
        s2.add(23);

        Person p2 = new Person("Juan");
        s3.add(p2);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}