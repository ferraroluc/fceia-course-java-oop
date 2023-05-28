import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PeopleRegistration {
    // variables
    Collection<Person> registry;

    // constructors
    public PeopleRegistration() {
        this.registry = new ArrayList<>();
    }

    // registry
    public Collection<Person> getRegistry() {
        return registry;
    }

    public void setRegistry(Collection<Person> registry) {
        this.registry = registry;
    }

    // CRUD
    void addPerson(Person p) {
        registry.add(p);
    }

    void removePerson(String nameToDelete) {
        Iterator<Person> iterator = registry.iterator();
        while (iterator.hasNext()) {
            Person p = iterator.next();
            if (p.getName().equals(nameToDelete)) {
                iterator.remove();
                break;
            }
        }
    }

    // void modifyPerson(Person p) {
    // }

    void printRegistry() {
        if (registry.size() == 0) {
            System.out.println("No hay personas cargadas");
        }
        else {
            for (Person p: registry) {
                p.identify();
            }
        }
    }

    // toString
    @Override
    public String toString() {
        return "{" +
                "registro=" + registry +
                '}';
    }
}
