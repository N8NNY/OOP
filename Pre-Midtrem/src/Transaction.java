import java.time.LocalDateTime;

public class Transaction {
    private LocalDateTime date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    public Transaction(LocalDateTime date, char type, double amount, double balance, String description) {
        this.date = LocalDateTime.now();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "date=" + date +
                ", type=" + type +
                ", amount=" + amount +
                ", balance=" + balance +
                ", description='" + description + '\'' +
                '}';
    }
}
