public class UniversityStudent extends Student {
    // variables
    public String career = "";

    // constructors
    public UniversityStudent() {
        super();
        career = "";
    }

    public UniversityStudent(String name, int age, String career) {
        super(name, age);
        this.career = career;
    }

    // career
    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    // toString
    @Override
    public String toString() {
        String content = super.toString().substring(1, super.toString().length() - 1);
        return "{" +
                content + ", " +
                "carrera='" + career + '\'' +
                '}';
    }
}
