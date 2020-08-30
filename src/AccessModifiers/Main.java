package AccessModifiers;

public class Main {
    public static void main(String[] args) {
        Account mosAccount = new Account("Mo");
        mosAccount.deposit(20000);
        mosAccount.withdrawal(-1100);
        mosAccount.deposit(500);
        mosAccount.deposit(-600);
        mosAccount.calculateBalance();
        //mosAccount.balance = 100000;

        System.out.println("Balance on account is " + mosAccount.getBalance());
        //mosAccount.transactions.add(100000);
        System.out.println("Balance on account is " + mosAccount.getBalance());

    }
}
