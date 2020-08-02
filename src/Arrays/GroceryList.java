package Arrays;

import java.util.ArrayList;

//let's play with an array list
public class GroceryList {

    //can't have ArrayList accepting primitive types as its object.
   private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item) {

        if(!groceryList.contains(item)) {
            groceryList.add(item);
            Integer.valueOf(2);
            System.out.println(item + " added to the list");}
        else{
            System.out.println(item + " is already in the grocery list!");
        }
    }

    public void printGroceryList(){
        System.out.println("This is what you need to buy:");
        groceryList.forEach(c -> System.out.println(c));
    }

    public void removeGroceryItem(String item)
    {
        if(groceryList.contains(item)) {
            groceryList.remove(item);
            System.out.println(item + " removed from the list.");}
        else {
            System.out.println(item + " is not in the grocery list");
        }
    }

    public void findItem(String item)
    {
        if(groceryList.contains(item)){
            int itemNumberInList = groceryList.indexOf(item) + 1;
            System.out.println(String.format("%s is number %s in the grocery list", item, itemNumberInList));
        }else {
            System.out.println(item + " is not in the grocery list");
        }
    }

}
