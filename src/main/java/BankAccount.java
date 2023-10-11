import java.time.LocalDate;

public class BankAccount {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private int accountNumber;
    private int balance;


    public BankAccount(String inputFirstName,String inputLastName, String inputDateOfBirth, int inputAccountNumber){
        this.firstName = inputFirstName;
        this.lastName = inputLastName;
        this.dateOfBirth = LocalDate.parse(inputDateOfBirth) ;
        this.accountNumber = inputAccountNumber;
        this.balance = 0;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }
}
