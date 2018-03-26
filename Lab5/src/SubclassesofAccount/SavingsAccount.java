package SubclassesofAccount;

public class SavingsAccount extends Account {

    public SavingsAccount() {

    }

    public SavingsAccount(int id, double balance, double annualInterestRate) {
        super(id, balance, annualInterestRate);

    }

    @Override
    public void deposit(double i) {
        super.deposit(i);
    }

    @Override
    public void withdraw(double i) {
        if(super.getBalance() >= i ) super.withdraw(i);
        else System.out.println("error");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
