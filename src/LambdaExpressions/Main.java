package LambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){
        new Thread(() ->{
            System.out.println("Printing from main");
            System.out.println("Another use of run method");
            System.out.println("last one");
        } ).start();

        // () this is an empty argument list that would represent the void run() method from the Runnable Interface which is the argument that the Thread constructor takes.
        // System.out.println("Printing from main") is the body of the code we want to run (i.e.: the implementation of run() method from the Runnable interface)
        //lambda expressions can only be used for interfaces that only have one method in them that has to be implemented a.k.a "functional interfaces"
        //by adding curly braces after the ->, you can have multiple calls to that run method

        /*high level definitions:
        Consumer: accepts on parameter but doesn't return any value
        Supplier: doesn't accept a parameter but returns a value
        Predicate: only returns true or false
        Function: accept one parameter and return a value
        BiFunction/BiConsumer/BiPredicate: accept two parameters and then same concept
        Unary: accepts one parameter and returns that parameter type (implements the Function interface)
         */

        Employee mo = new Employee("Mo Sagnia", 66);
        Employee john = new Employee("John Doe", 26);
        Employee jack = new Employee("Jack Ripper", 10);
        Employee helen = new Employee("Helen Bid", 40);

        List<Employee> employees = new ArrayList<>();
        employees.add(mo);
        employees.add(john);
        employees.add(jack);
        employees.add(helen);

        Collections.sort(employees, (employee1, employee2) -> employee1.getName().compareTo(employee2.getName()));

        for(Employee employee : employees){
            System.out.println(employee.getName());
        }

        String sillyString = doStringStuff(new UpperConcat() {
            @Override
            public String upperAndConcat(String s1, String s2) {
                return s1.toUpperCase() + s2.toUpperCase();
            }
        },
                employees.get(0).getName(), employees.get(1).getName());
        System.out.println(sillyString);

        UpperConcat uc = (s1, s2) -> {
            String result = s1.toUpperCase() + s2.toUpperCase();
            return result;
        };

        String newSillyString = doStringStuff(uc, employees.get(0).getName(), employees.get(1).getName());

        AnotherClass anotherClass = new AnotherClass();
        String s = anotherClass.doSomething();
        System.out.println(s);
    }

    public final static String doStringStuff(UpperConcat uc, String s1, String s2){
        return uc.upperAndConcat(s1, s2);
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

interface UpperConcat {
    public String upperAndConcat(String s1, String s2);
}

class AnotherClass{
    public String doSomething(){
        UpperConcat uc = (s1, s2) -> {
String result = s1.toUpperCase() + s2.toUpperCase();
        return result; };
        return Main.doStringStuff(uc, "String 1", "String 2");
    }
}

