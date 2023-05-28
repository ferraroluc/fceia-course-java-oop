public class Teacher extends Person {
    // variables
    private String subject = "";

    // constructors
    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    // subject
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // methods
    public void identify() {
        System.out.println("Soy " + getName() + ", un docente que dicta " + subject);
    }

    // toString
    @Override
    public String toString() {
        String content = super.toString().substring(1, super.toString().length() - 1);
        return "{" +
                content + ", " +
                "materia='" + subject + '\'' +
                '}';
    }
}
