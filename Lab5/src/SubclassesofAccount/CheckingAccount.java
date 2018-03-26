package SubclassesofAccount;

public class CheckingAccount extends Account {
    private double limit = 20000;
    public CheckingAccount() {
    }

    CheckingAccount(int id, double balance, double annualInterestRate) {
        super(id, balance, annualInterestRate);
    }

    @Override
    public void deposit(double i) {
        super.deposit(i);
    }

    @Override
    public void withdraw(double i) {
        if(i <= super.getBalance() + limit) super.withdraw(i);
        else System.out.println("Over limit");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
