package SubclassesofAccount;

public class Main {
    public static void main(String[] args) {
        demoChecking();
    }

    public static void demoSaving() {
        SavingsAccount savingsAccount = new SavingsAccount(2,1000, 3);

        savingsAccount.withdraw(500);
        System.out.println(savingsAccount);
        savingsAccount.deposit(700);
        System.out.println(savingsAccount);
        savingsAccount.withdraw(1300);
        System.out.println(savingsAccount);

    }

    public static void demoChecking() {
        CheckingAccount checkingAccount = new CheckingAccount(1, 1000, 3);
        checkingAccount.withdraw(1000);
        System.out.println(checkingAccount);
        checkingAccount.withdraw(  19000);
        System.out.println(checkingAccount);


    }
}

