package LambdaExpressions.Functions;

import LambdaExpressions.FunctionalInterfacesAndPredicates.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;

public class Main {
    public static void main(String[] args){
        Employee mo = new Employee("Mo Sagnia", 66);
        Employee john = new Employee("John Doe", 26);
        Employee jack = new Employee("Jack Ripper", 10);
        Employee helen = new Employee("Helen Bid", 40);

        List<Employee> employees = new ArrayList<>();
        employees.add(mo);
        employees.add(john);
        employees.add(jack);
        employees.add(helen);

//        employees.forEach(employee -> {
//            String lastName = employee.getName().substring(employee.getName().indexOf(' ') + 1);
//            System.out.println("Last name is: " + lastName);
//        });

        //another way of getting employees last name is Function..
        Function<Employee, String> getLastName = (Employee employee) -> employee.getName().substring(employee.getName().indexOf(' ') + 1);
        employees.forEach(employee -> System.out.println(getLastName.apply(employee)));

        String lastName = getLastName.apply(employees.get(0));
        System.out.println(lastName);


        Function<Employee, String> getFirstName = (Employee employee) -> employee.getName().substring(0, employee.getName().indexOf(' '));

        String firstName = getFirstName.apply(employees.get(0));
        System.out.println(firstName);

        Random random1 = new Random();
        for(Employee employee : employees){
            if(random1.nextBoolean()){
                System.out.println(getAName(getFirstName, employee));
            }
            else{
                System.out.println(getAName(getLastName, employee));
            }
        }

        Function<Employee, String> upperCase = employee -> employee.getName().toUpperCase();
        Function<String, String> firstNameTwo = name -> name.substring(0, name.indexOf(' '));
        Function chainedFunction  = upperCase.andThen(firstNameTwo);
        System.out.println(chainedFunction.apply(employees.get(1)));

        BiFunction<String, Employee, String> concatAge = (String name, Employee employee) -> name.concat(" " + employee.getAge());

        String upperName = upperCase.apply(employees.get(2));
        System.out.println(concatAge.apply(upperName, employees.get(2)));

        IntUnaryOperator incBy5 = i -> i + 5;
        System.out.println(incBy5.applyAsInt(10));
    }

    private static String getAName(Function<Employee, String> getName, Employee employee){
        return getName.apply(employee);
    }
}
