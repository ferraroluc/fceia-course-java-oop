public class Person {
    // variables
    private String name = "";

    // constructors
    public Person(String name) {
        this.name = name;
    }

    // name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // methods
    public void identify() {
        System.out.println("Soy " + name + ", una persona");
    }

    // toString
    @Override
    public String toString() {
        return "{" +
                "nombre='" + name + '\'' +
                "}";
    }
}
