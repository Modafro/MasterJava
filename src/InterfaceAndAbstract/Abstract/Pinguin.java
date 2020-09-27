package InterfaceAndAbstract.Abstract;

public class Pinguin extends Bird{
    public Pinguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("I'd rather swim thanks");
    }
}
