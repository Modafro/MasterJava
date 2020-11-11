package LambdaExpressions.FunctionalInterfacesAndPredicates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

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

        employees.forEach(employee -> {
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
        });

        //employee older than 30
        System.out.println("Employee older than 30");
        employees.forEach(employee -> {
            if(employee.getAge() > 30){
                System.out.println(employee.getName());
            }
        });

        //using the predicate
        printEmployeesByAge(employees, "Employee over 30", employee -> employee.getAge() > 30);
        printEmployeesByAge(employees, "Employee 30 and under", employee -> employee.getAge() <= 30);

        //employee younger than 30
        employees.forEach(employee -> {
            if(employee.getAge() <- 30){
                System.out.println(employee.getName());
            }
        });

        IntPredicate greaterThan15 = i -> i > 15;
        IntPredicate lessThan100 = i -> i < 100;
        System.out.println(greaterThan15.test(10));
        int a = 20;
        System.out.println(greaterThan15.test(a + 5));
        System.out.println(greaterThan15.and(lessThan100).test(10 + 5));


        Random random = new Random();
        Supplier<Integer> randomSupplier = () -> random.nextInt(1000);
        for(int i=0; i<10; i++){
            System.out.println(randomSupplier.get());
        }

        List<Employee> employees1 = testReturnAnyObjectWithSupplier(() -> employees);
    }

    private static <T> T testReturnAnyObjectWithSupplier(Supplier<T> thisIsSupplierMethod){
        return thisIsSupplierMethod.get();
    }

    private static void printEmployeesByAge(List<Employee> employees, String ageText, Predicate<Employee> ageCondition){
        System.out.println(ageText);
        for(Employee employee : employees){
            if(ageCondition.test(employee)){
                System.out.println(employee.getName());
            }
        }
    }
}
