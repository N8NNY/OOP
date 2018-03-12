import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private char gender;
    private String address;
    private int age;
    private ArrayList<Account> listBlankAccount = new ArrayList<Account>();

    public Customer() {

    }

    public Customer(String name, char gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }

    public void addBankAccount(Account bankAccount) {
        listBlankAccount.add(bankAccount);
    }

    public ArrayList<Account> getListBankAccount() {
        return listBlankAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
