package LambdaExpressions.Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    /*
    * What is stream? looks at the source collection (eg: list) and references each object in that collection respecting the order
      of that object in that list
    * map? accepts one method that is a function i.e. accepts one argument and returns a value. In the below example the map(String::toUpperCase)
      is like saying toUpperCase(myString) where my string is the object that is being streamed (and it's a string because the collection being streamed
      is a collection of strings)
    * :: -> this is a method reference
    * in the sream example below, the .ForEach(System.out::println) would be considered the "terminal operation" meaning that
      it returns void or a non-stream result. Operations that return a stream would be intermediate operation
    * When creating a stream, it can only be of one type (can't have a mix of objects)
    * "peek" allows you to view (by println for eg) or manipulate(?) what the result of an intermediary operation is. Very useful for debugging
    * flatmap (from stack): Stream.flatMap, as it can be guessed by its name, is the combination of a map and a flat operation.
      That means that you first apply a function to your elements, and then flatten it. Stream.map only applies a function to the stream without flattening the stream.
      To understand what flattening a stream consists in, consider a structure like [ [1,2,3],[4,5,6],[7,8,9] ] which has "two levels".
      Flattening this means transforming it in a "one level" structure : [ 1,2,3,4,5,6,7,8,9 ]. (equivalent to SelectMany in c#). We have a list of a list.
    * .reduce: will return just one value from the stream
    */
    public static void main(String[] args) {
        List<String> bingoNumbers = Arrays.asList(
                "N49", "N36", "B12", "B6", "G53","G49","G60","G50","g64","I26", "I17","I29", "071");

        List<String> gNumbers =new ArrayList<>();

        bingoNumbers.forEach(number -> {
            if(number.toUpperCase().startsWith("G")){
                gNumbers.add(number);
                //System.out.println(number);
            }
        });

        gNumbers.sort(Comparator.naturalOrder());
        gNumbers.forEach(s -> System.out.println(s));

        //let's do the same with streams

        bingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .forEach(System.out::println);


        Stream<String> ioNumberStream = Stream.of("I26", "I17", "I29","O71");
        Stream<String> inNumberStream = Stream.of("N40", "N36","I26","I17", "I29","O71");
        Stream<String> concatStream = Stream.concat(ioNumberStream, inNumberStream);
        System.out.println("----------------------------------------------");
        System.out.println(concatStream
                .distinct()
                .peek(System.out::println)
                .count());

        Employee mo = new Employee("Mo Sagnia", 55);
        Employee alli = new Employee("Alli Sagnia", 45);
        Employee mbye = new Employee("Mbye Sagnia", 35);
        Employee oli = new Employee("Olimatou Bojang", 65);
        Employee john  = new Employee("John Doe", 24);

        Department hr = new Department("Human Resources");
        hr.addEmployee(oli);
        hr.addEmployee(alli);
        hr.addEmployee(mbye);

        Department engineering = new Department("Engineering");
        engineering.addEmployee(mo);
        engineering.addEmployee(john);

        List<Department> departments = new ArrayList<>();
        departments.add(hr);
        departments.add(engineering);

        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .forEach(System.out::println);

        //collect
        System.out.println("----------------");
        List<String> sortedGNumbers = bingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .collect(Collectors.toList()); //terminal operation
        sortedGNumbers.forEach(System.out::println);

        List<String> sortedGNumbersTwo = bingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        sortedGNumbersTwo.forEach(System.out::println);

        Map<Integer, List<Employee>> groupedByAge = departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .collect(Collectors.groupingBy(employee -> employee.getAge()));

        //find youngest employee
        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .reduce((e1, e2) -> e1.getAge() < e2.getAge() ? e1: e2)//terminal operation
                .ifPresent(System.out::println);

        Stream.of("ABC","AC","BAA","CCCC","XY","ST")
                .filter(s ->{
                    System.out.println(s); //won't actually print
                    return s.length() == 3;
                });  //this will render nothing because there is no terminal operation

        //uncomment the following to see the difference:
        Stream.of("ABC","AC","BAA","CCCC","XY","ST")
                .filter(s ->{
                    System.out.println(s);
                    return s.length() == 3;
                })
        .count();
}}
