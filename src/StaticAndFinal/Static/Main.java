package StaticAndFinal.Static;

public class Main {
    public int multiplier =7;

    public static void main(String[] args) {
        StaticTest firstInstance = new StaticTest("1st instance");
        System.out.println(firstInstance.getName() + " is instance number " + firstInstance.getNumInstances());
        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        StaticTest secondInstance = new StaticTest("2nd instance");
        System.out.println(secondInstance.getName() + " is instance number " + secondInstance.getNumInstances());
        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        StaticTest thirdInstance = new StaticTest("3rd instance");
        System.out.println(thirdInstance.getName() + " is instance number " + secondInstance.getNumInstances()); //notice i'm using secondInstance to get numInstances
        //a static field is associated with the class and not the instance so all of the instances of an object share the
        //the same static field.

        //int answer = multiply(6);
    }

    public int multiply(int number){
        return number * multiplier;
    }
}
