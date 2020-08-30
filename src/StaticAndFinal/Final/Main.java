package StaticAndFinal.Final;

public class Main {
    public static void main(String[] args) {
        FinalClass one  = new FinalClass("one");
        FinalClass two  = new FinalClass("two");
        FinalClass three  = new FinalClass("three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

        //one.instanceNumber = 4;
        int pw = 538305;
        Password password = new ExtendedPassword(pw);
        password.storePassword();

        password.letMeIn(4924);
        password.letMeIn(538305);
        password.letMeIn(934);
    }
}
