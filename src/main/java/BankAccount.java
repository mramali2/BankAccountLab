import java.time.LocalDate;

public class BankAccount {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private int accountNumber;
    private double balance;

    private String accountType;

    private double overdraft;


    public BankAccount(String inputFirstName,String inputLastName, String inputDateOfBirth, int inputAccountNumber, String inputAccountType){
        this.firstName = inputFirstName;
        this.lastName = inputLastName;
        this.dateOfBirth = LocalDate.parse(inputDateOfBirth) ;
        this.accountNumber = inputAccountNumber;
        this.balance = 50;
        this.accountType = inputAccountType;
        this.overdraft = -100;
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

    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }

    public void deposit(int depositValue) {
        this.balance += depositValue;
    }

    public void withdraw(int withdrawalValue) {
        if((this.balance - withdrawalValue) < this.overdraft){
            System.out.println("You have gone beyond your overdraft limit - unable to process withdeawal.");
        }else{
            this.balance -= withdrawalValue;
        }

    }

    public void payInterest() {
        if(this.accountType == "Savings") {
            this.balance *= 1.10;
        }else if(this.accountType == "Current"){
            this.balance *= 1.05;
        }else{
            this.balance *= 1.02;
        }
    }
}
