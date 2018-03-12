import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Teller t = new Teller();
        Customer c1 = new Customer("Suthee", 'F', "11/22 BKK", 30);
        t.newAccount(c1, 500);
        t.newAccount(c1, 1000);

        t.deposit(c1, 100, 500);
        t.withdraw(c1,100,200);

        t.deposit(c1,101,1200);
        t.withdraw(c1,101,500);

        System.out.println("Transaction Information");
        ArrayList<Account> list = c1.getListBankAccount();
        for (Account account:list) {
            System.out.println(account);
        }
    }
}
