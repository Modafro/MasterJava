package Arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class MainLinkedList {

    public static void main(String[] args){
        Customer customer = new Customer("Mo", 100);

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(3);
        intList.add(5);

        intList.forEach(c -> System.out.println(c.intValue()));

        //this will move records down or up in order to create that element which can take a lot of processing time
        //with a large array list
        intList.add(1, 2);
        intList.forEach(c -> System.out.println(c.intValue()));

        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Brussels");
        placesToVisit.add("Brugges");
        placesToVisit.add("Namur");
        placesToVisit.add("Oostand");

        printList(placesToVisit);

        //what this will do is that "Brussels" was pointing at Brugges but by adding "Anvers", "Brussels" will now point
        // to "Anvers" without having to move the order of the elements which does wonder for performance.
        placesToVisit.add(1, "Anvers");
        printList(placesToVisit);

        LinkedList<String> newPlacesToVisit = new LinkedList<>();
        addInOrder("Lille", newPlacesToVisit);
        addInOrder("Dinan", newPlacesToVisit);
        addInOrder("Lille", newPlacesToVisit);
        printList(newPlacesToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext())
        {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("============================");
    }

    private static boolean addInOrder(String newCity, LinkedList<String> linkedList)
    {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext())
        {
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison > 0){
                stringListIterator.add(newCity);
                return true;
            }
            else if (comparison == 0)
            {
                System.out.println(newCity + " is already included as a destination");
                return false;
            }
        }

        stringListIterator.add(newCity);
        return true;
    }
}
