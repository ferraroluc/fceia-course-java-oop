public class Student {
    // variables
    private String name = "";
    private int age = 0;

    // constructors
    public Student() {
        name = "";
        age = 0;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // toString
    @Override
    public String toString() {
        return "{" +
                "nombre='" + name + '\'' +
                ", edad=" + age +
                '}';
    }
}
