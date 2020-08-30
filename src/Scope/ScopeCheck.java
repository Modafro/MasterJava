package Scope;

public class ScopeCheck {
    public int publicVar = 0;
    private int privateVar = 1;

    public ScopeCheck() {
        System.out.println("Scope check created, publicVar = " + publicVar + ": privateVar = " + privateVar) ;

    }

    public void timesTwo() {
        int privateVar = 2;
        for(int  i=0; i< 10; i++){
            System.out.println(i + " times two is " + i * this.privateVar);
        }
    }

    public int getPrivateVar() {
        return privateVar;
    }

    public class InnerClass {
        public int privateVar = 3;

        public InnerClass(){
            System.out.println("Inner class created is " + privateVar);
        }

        public void timesTwo() {
            int privateVar = 2;
            for(int  i=0; i< 10; i++){
                System.out.println(i + " times two is " + i * this.privateVar);
                System.out.println("************call privateVar from ScopeCheck instance*********************");
                System.out.println(i + " times two is " + i * ScopeCheck.this.privateVar);
            }
        }
    }
}
