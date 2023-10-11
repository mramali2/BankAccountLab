import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.offset;

public class BankAccountTest {

    @Test
    void canGetFirstName(){
//        Given
        BankAccount bankAccount = new BankAccount("John","Smith","1990-01-25",12345,"Savings");
//        With
        String result = bankAccount.getFirstName();
//        Then
        String expected = "John";
        assertThat(result).isEqualTo(expected);

    }

    @Test
    void canSetFirstName(){
        BankAccount bankAccount = new BankAccount("John","Smith","1990-01-25",12345, "Savings");
        bankAccount.setFirstName("James");
        String result = bankAccount.getFirstName();
        String expected = "James";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void canGetLastName(){
        BankAccount bankAccount = new BankAccount("John","Smith","1990-01-25",12345, "Savings");
        String result = bankAccount.getLastName();
        String expected = "Smith";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void canSetLastName(){
        BankAccount bankAccount = new BankAccount("John","Smith","1990-01-25",12345, "Savings");
        bankAccount.setLastName("Doe");
        String result = bankAccount.getLastName();
        String expected = "Doe";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void canGetDateOfBirth(){
        BankAccount bankAccount = new BankAccount("John","Smith","1990-01-25",12345,"Savings");
        LocalDate result = bankAccount.getDateOfBirth();
        LocalDate expected = LocalDate.of(1990,01,25);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void canSetDateOfBirth(){
        BankAccount bankAccount = new BankAccount("John","Smith","1990-01-25",12345,"Savings");
        bankAccount.setDateOfBirth("1999-02-13");
        LocalDate result = bankAccount.getDateOfBirth();
        LocalDate expected = LocalDate.of(1999, 02, 13);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void canGetAccountNumber(){
        BankAccount bankAccount = new BankAccount("John","Smith","1990-01-25",12345,"Savings");
        int result = bankAccount.getAccountNumber();
        int expected = 12345;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void canSetAccountNumber(){
        BankAccount bankAccount = new BankAccount("John","Smith","1990-01-25",12345,"Savings");
        bankAccount.setAccountNumber(56789);
        int result = bankAccount.getAccountNumber();
        int expected = 56789;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void canGetBalance(){
        BankAccount bankAccount = new BankAccount("John","Smith","1990-01-25",12345,"Savings");
        double result = bankAccount.getBalance();
        double expected = 50;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void canSetBalance(){
        BankAccount bankAccount = new BankAccount("John","Smith","1990-01-25",12345,"Savings");
        bankAccount.setBalance(50);
        double result = bankAccount.getBalance();
        double expected = 50;
        assertThat(result).isEqualTo(expected);

    }

//    Need to test whether it can deposit 100 and increase total to 150
    @Test
    void canDeposit(){
        BankAccount bankAccount = new BankAccount("John","Smith","1990-01-25",12345,"Savings");
        bankAccount.deposit(100);
        double result = bankAccount.getBalance();
        double expected = 150;
        assertThat(result).isEqualTo(expected);

    }

    @Test
    void canWithdrawal(){
        BankAccount bankAccount = new BankAccount("John","Smith","1990-01-25",12345,"Savings");
        bankAccount.withdraw(20);
        double result = bankAccount.getBalance();
        double expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void canNotWithdrawal(){
        BankAccount bankAccount = new BankAccount("John","Smith","1990-01-25",12345,"Savings");
        bankAccount.withdraw(200);
        double result = bankAccount.getBalance();
        double expected = 50;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void canPaySavingsInterest(){
        BankAccount bankAccount = new BankAccount("John","Smith","1990-01-25",12345,"Savings");
        bankAccount.payInterest();
        double result = bankAccount.getBalance();
        double expected = 55;
        assertThat(result).isEqualTo(expected, offset(0.00001));
    }

    @Test
    void canPayCurrentInterest(){
        BankAccount bankAccount = new BankAccount("John","Smith","1990-01-25",12345,"Current");
        bankAccount.payInterest();
        double result = bankAccount.getBalance();
        double expected = 52.5;
        assertThat(result).isEqualTo(expected, offset(0.00001));
    }
    @Test
    void canPayOtherInterest(){
        BankAccount bankAccount = new BankAccount("John","Smith","1990-01-25",12345,"Student");
        bankAccount.payInterest();
        double result = bankAccount.getBalance();
        double expected = 51;
        assertThat(result).isEqualTo(expected, offset(0.00001));
    }



}
