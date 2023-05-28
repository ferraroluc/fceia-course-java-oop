public class Businessman extends Person {
    // variables
    private double salary = 0.0;

    // constructors
    public Businessman(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    // salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // methods
    public void identify() {
        System.out.println("Soy " + getName() + ", un empresario que cobra " + salary);
    }

    // toString
    @Override
    public String toString() {
        String content = super.toString().substring(1, super.toString().length() - 1);
        return "{" +
                content + ", " +
                "sueldo=" + salary +
                '}';
    }
}
