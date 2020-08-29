package Collections.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SymetricMain {
    public static void main(String[] args) {
        //concept of intersection and union for sets
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for(int i=1; i<=100; i++)
        {
            squares.add(i*i);
            cubes.add(i*i*i);
        }

        System.out.println("There are " + squares.size() + " squares and " + cubes.size() + " cubes");
        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);

        System.out.println("Union contains " + union.size() + " elements");

        Set<Integer> intersecion = new HashSet<>(squares);
        intersecion.retainAll(cubes);

        System.out.println("Intercection contains " + intersecion.size() + " elements");

        Set<String> words = new HashSet<>();
        String sentence = "this is my awesome phrase";
        String[] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));

        for(String s : words)
        {
            System.out.println(s);
        }

        Set<String> mo = new HashSet<>();
        Set<String> alli = new HashSet<>();

        String[] moWords = {"dark", "happy", "love", "me", "her"};
        mo.addAll(Arrays.asList(moWords));

        String[] alliWords = {"light", "jovial", "heart", "me", "her"};
        alli.addAll(Arrays.asList(alliWords));

        System.out.println("mo - alli");
        Set<String> diff1 = new HashSet<>(mo);
        diff1.removeAll(alli); //remove any string from mo that are in alli
        printSet(diff1);

        System.out.println("alli - mo");
        Set<String> diff2 = new HashSet<>(alli);
        diff2.removeAll(mo);
        printSet(diff2);

        Set<String> unionTest =  new HashSet<>(mo);
        unionTest.addAll(alli);
        Set<String> intersectionTest = new HashSet<>(mo);
        intersectionTest.retainAll(alli); //intersection is "me" and "her"

        System.out.println("Symmetric diff is");
        unionTest.removeAll(intersectionTest);
        printSet(unionTest);

        if(mo.containsAll(alli))
        {
            System.out.println("alli is part of mo");
        }

        if(mo.containsAll(intersectionTest))
        {
            System.out.println("intersection is part of Mo");
        }
        if(alli.containsAll(intersectionTest))
        {
            System.out.println("intersection is part of Alli");
        }

    }

    private static void printSet(Set<String> set){
        System.out.println("\t");
        for(String s : set){
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
