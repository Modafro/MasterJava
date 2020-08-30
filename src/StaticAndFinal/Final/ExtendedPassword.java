package StaticAndFinal.Final;

public class ExtendedPassword  extends Password{
    private int decryptedPassword;

    public ExtendedPassword(int password){
        super(password);
        this.decryptedPassword = password;
    }

    //uncomment me to understand final keyword/access modifier
//    @Override
//    public void storePassword() {
//        System.out.println("Saving password as " + this.decryptedPassword);
//    }
}
