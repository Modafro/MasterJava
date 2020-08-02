package Arrays;

import java.util.Scanner;

public class MainArrayList {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args){
        boolean quit = false;
        printChoices();

        while(!quit)
        {
            int choice = getChoice();

            switch (choice){
                case 1:
                    System.out.println("Enter item to add: ");
                    groceryList.addGroceryItem(scanner.next());
                    break;
                case 2:
                    System.out.println("Enter item to remove");
                    groceryList.removeGroceryItem(scanner.next());
                    break;
                case 3:
                    System.out.println("Enter item to find");
                    groceryList.findItem(scanner.next());
                    break;
                case 4:
                    groceryList.printGroceryList();
                    break;
                case 5:
                    System.out.println("Bye!");
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid entry, try again");
            }
        }

    }

    private static int getChoice() {
        int choice = 0;
        boolean isInteger = false;


        while(!isInteger)
        {
            choice = 0;
            System.out.print("Enter your choice number: ");

            try{
                choice = scanner.nextInt();
                isInteger = true;
            }
            catch (Exception e){
                System.out.println("Invalid Number");
                scanner.next();
            }
        }
        return choice;
    }

    private static void printChoices() {
        System.out.println("Here are your choices: ");
        System.out.println("1. Add item in grocery list");
        System.out.println("2. Remove item in grocery list");
        System.out.println("3. Find item in grocery list");
        System.out.println("4. Print grocery list");
        System.out.println("5. Quit application");
    }
}
