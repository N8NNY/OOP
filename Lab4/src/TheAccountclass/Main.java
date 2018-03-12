package TheAccountclass;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000, 4.5/100);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("id: " +account.getID());
        System.out.println("Balance: " +account.gatBalance());
        System.out.println("Monthly interest: "+account.getMonthlyInterest());
        System.out.println("Date: "+account.getDate());
    }
}

