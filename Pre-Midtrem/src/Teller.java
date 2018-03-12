import java.time.LocalDateTime;
import java.util.ArrayList;

public class Teller {
    private static int acctNum = 100;

    public Teller() {
    }

    public void newAccount(Customer cust, double initAmount) {
        Account acc = new Account(acctNum++, initAmount);
        cust.addBankAccount(acc);
    }

    public void deposit(Customer cust, int acctNum, double deposit) {
        ArrayList<Account> list = cust.getListBankAccount();
        boolean found = false;
        for(int i = 0;i < list.size();i++) {
            Account acc = list.get(i);
            if(acc.getId() == acctNum) {
                acc.computeDeposit(deposit);
                found = true;
                if(found) {
                    Transaction transaction = new Transaction(LocalDateTime.now(), 'd', deposit, acc.getBalance(), "happy");
                    acc.addTransaction(transaction);
                }
                break;
            }
        }


    }

    public void withdraw(Customer cust,int acctNum, double withdraw) {
        ArrayList<Account> list = cust.getListBankAccount();
        boolean found = false;
        for(int i = 0;i < list.size();i++) {
            Account acc = list.get(i);
            if(acc.getId() == acctNum) {
                acc.computeWitdraw(withdraw);
                found = true;
                if(found) {
                    Transaction transaction = new Transaction(LocalDateTime.now(), 'w', withdraw, acc.getBalance(), "sad");
                    acc.addTransaction(transaction);
                }
                break;
            }
        }
    }
}
