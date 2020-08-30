package StaticAndFinal.Final;

public class Password {
    private static final int key = 837457493;
    private final int encryptedPassword;

    public Password(int password){
        this.encryptedPassword = encryptDecrypt(password);
    }

    public int encryptDecrypt(int password){
        return password ^ key;
    }

    public final void storePassword(){
        System.out.println("Saving password as " + this.encryptedPassword);
    }

    public boolean letMeIn(int password){
        if(encryptDecrypt(password) == this.encryptedPassword){
            System.out.println("Welcome");
            return true;
        }
        else{
            System.out.println("Not welcomed");
            return false;
        }
    }
}
