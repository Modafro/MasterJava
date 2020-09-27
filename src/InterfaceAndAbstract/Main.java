package InterfaceAndAbstract;

public class Main {
    public static void main(String[] args){
        ITelephone myPhone;
        int myNumber = 349543;
        myPhone = new DeskPhone(myNumber);
        myPhone.powerOn();
        myPhone.callPhone(myNumber);
        myPhone.answer();

        int myNumber1 = 3949594;
        myPhone = new MobilePhone(myNumber1);
        myPhone.callPhone(myNumber1);
        myPhone.answer();
    }
}
