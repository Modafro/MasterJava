package InterfaceAndAbstract.Abstract;

public class Parrot extends Bird {
    public Parrot(String name) {
        super(name);
    }

    public void fly() {
        System.out.println("Flitting from branch to branch");
    }
}
