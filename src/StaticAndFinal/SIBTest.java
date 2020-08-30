package StaticAndFinal;

public class SIBTest {
    public static final String owner;

    //having static constructors in class (declared by just using the keyword static) will call the static methods first
    //by order in which they appear in the class and THEN call the regular constructor methods (i.e: with non static keyword)
    static {
        owner = "mo";
        System.out.println("SIBTest static initialization block called");
    }

    public SIBTest(){
        System.out.println("SIBTest constructor called");
    }

    static {
        System.out.println("2nd initialization block called");
    }

    public void someMethod(){
        System.out.println("someMethod called");
    }
}
