package AutoBoxing;

import java.util.ArrayList;

public class Main {
    /*
     * Concept of autoboxing is to allow primitive types (i.e.: int, double, etc.) to "act" as classes
     * trying to do will not compile:
     * ArrayList<int> intArrayLit = new ArrayList<>();
     * */

    public static void main(String[] args){
        //if we want to create an arraylist of int we can do...:
        ArrayList<Integer> intArrayList = new ArrayList<>();

        //autoboxing would be
        Integer autoboxing = Integer.valueOf(3);

        //unboxing would be
        double unboxing = autoboxing.doubleValue();

        //but at compile time we can also do this which is the same (will do the boxing and unboxing behind the scenes)
        intArrayList.add(3);
    }
}
