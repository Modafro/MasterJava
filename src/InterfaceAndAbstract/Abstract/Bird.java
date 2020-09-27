package InterfaceAndAbstract.Abstract;

import InterfaceAndAbstract.CanFly;

public abstract class Bird extends Animal implements CanFly {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is picking");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breath out, breathe complete");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flapping from branch to branch");
    }
}
