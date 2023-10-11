import java.time.LocalDate;

public class BankAccount {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private int accountNumber;
    private double balance;


    public BankAccount(String inputFirstName,String inputLastName, String inputDateOfBirth, int inputAccountNumber){
        this.firstName = inputFirstName;
        this.lastName = inputLastName;
        this.dateOfBirth = LocalDate.parse(inputDateOfBirth) ;
        this.accountNumber = inputAccountNumber;
        this.balance = 50;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String newDateOfBirth) {
        this.dateOfBirth = LocalDate.parse(newDateOfBirth);
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int newAccountNumber) {
         this.accountNumber = newAccountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(int newBalance) {
        this.balance = newBalance;
    }

    public void deposit(int depositValue) {
        this.balance += depositValue;
    }

    public void withdraw(int withdrawalValue) {
        this.balance -= withdrawalValue;
    }

    public void payInterest() {
        this.balance *= 1.05;
    }
}
