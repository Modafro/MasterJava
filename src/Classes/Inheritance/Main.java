package Classes.Inheritance;

public class Main {
    public static void main(String[] args){
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("labrador", 8, 20, 2, 4, 1, 20, "long silky");
        dog.eat();
        dog.walk();
        dog.run();

        Fish fish = new Fish("tilapia", 1,1,2,2,2);
        fish.move(5);
    }
}