package TheAccountclass;

import java.util.Date;

public class Account {
    private  int id;
    private  double balance;
    private  double annualInterestRate;
    private Date dataCreated;

    public Account(){

    }

    public Account(int id,double balance, double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDate(){
        this.dataCreated = new Date();
        return dataCreated;
    }

    public  double getMonthlyInterestRate(){
        return  annualInterestRate / 12;
    }

    public  double getMonthlyInterest(){
        return balance * getMonthlyInterestRate();
    }

    public double withdraw(double wd){
        balance -= wd;
        return balance;
    }

    public double deposit(double ds){
        balance += ds;
        return balance;
    }

    public  double getID(){
        return id;
    }

    public  double gatBalance(){
        return balance;
    }
}
