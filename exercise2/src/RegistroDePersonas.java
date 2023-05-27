import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class RegistroDePersonas {
    // Persona []registro = new Persona[29];
    Collection<Persona> registro;

    // Constructor
    public RegistroDePersonas() {
        this.registro = new ArrayList<>();
    }

    // Getters and Setters
    public Collection<Persona> getRegistro() {
        return registro;
    }

    public void setRegistro(Collection<Persona> registro) {
        this.registro = registro;
    }

    // ABM
    void insertarPersona(Persona p) {
        registro.add(p);
    }

    void eliminarPersona(String nombreEliminado) {
        Iterator<Persona> iterator = registro.iterator();
        while (iterator.hasNext()) {
            Persona p = iterator.next();
            if (p.getNombre().equals(nombreEliminado)) {
                iterator.remove();
                break;
            }
        }
    }

    void modificarPersona(Persona p) {

    }

    void imprimirRegistro() {
        if (registro.size() == 0) {
            System.out.println("No hay personas cargadas");
        }
        else {
            for (Persona p: registro) {
                p.identificarse();
            }
        }
    }

    // ToString
    @Override
    public String toString() {
        return "{" +
                "registro=" + registro +
                '}';
    }
}
