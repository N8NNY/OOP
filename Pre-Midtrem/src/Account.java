import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {
    private int id;
    private double balance;
    private double annuallnterestRate;
    private LocalDateTime dateCreated;
    private ArrayList<Transaction> list = new ArrayList<Transaction>();

    public Account() {
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = LocalDateTime.now();
    }

    public void computeDeposit(double deposit) {
        balance += deposit;
    }

    public void computeWitdraw(double withdraw) {
        balance -= withdraw;
    }

    public double getMounthlyInterstRate() {
        return annuallnterestRate / 12;
    }

    public double getMounthlyInterst() {
        return balance * annuallnterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void addTransaction(Transaction transaction) {
        list.add(transaction);
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", annuallnterestRate=" + annuallnterestRate +
                ", dateCreated=" + dateCreated + "}" + "\n" + list;
    }
}
