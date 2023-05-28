public abstract class Abstract {
    // variables
    private int i;

    // constructors
    public Abstract(int i) {
        this.i = i;
    }

    // i
    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    // methods
    public abstract void m();

    // toString
    @Override
    public String toString() {
        return "{" +
                "i=" + i +
                '}';
    }
}
