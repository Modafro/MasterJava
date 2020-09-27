package InterfaceAndAbstract.Abstract;

public class Main {
    public static void main(String[] args){
        Dog dog =  new Dog("labrador");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Australian ringNeck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Pinguin pinguin = new Pinguin("Emperor");
        pinguin.fly();
    }
}
