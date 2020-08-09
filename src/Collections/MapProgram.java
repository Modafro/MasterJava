package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    private static final String MICH = "Mich";
    private static final String MO = "Mo";

    public static void main(String[] args){
        Map<String, String> people = new HashMap<>();
        people.put("Mo", "an awesome dude");
        people.put("Alli", "an awesome dudette");
        people.put("Kaz", "an awesome groom witness");
        people.put("Karen", "who's the this random person?");
        System.out.println(people.put("Mitch", "an awesome bride witness"));

        System.out.println(people.get("Mo"));

        if(people.containsKey("Mo")){
            System.out.println("Mo has already been defined as awesome");
        }
        else{
            /*no error will be throw if you map.put on a key that was already defined. it'll just overwrite the value
            * pf existing key.
            * */
            people.put(MO, "is he really an awesome dude though?");
        }
        System.out.println(people.get("Mo"));

        people.replace(MO, "is he really an awesome dude though?");

        //remove by key
        people.remove("Karen");

        //remove by key and value
        if((people.remove("Mitch", "not an awesome bride witness"))){
            System.out.println("removed " + "Mitch");
        }else {
            System.out.println(MICH + " not removed, key/value pair not found");
        }

        //print all the keys from the map set
        System.out.println("========================================================");
        for(String key: people.keySet()){
            System.out.println(key + " : " + people.get(key));
        }
    }
}
