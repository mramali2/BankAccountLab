import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    @Test
    void canGetFirstName(){
//        Given
        BankAccount bankAccount = new BankAccount("John","Smith","1990-01-25",12345);
//        With
        String result = bankAccount.getFirstName();
//        Then
        String expected = "John";
        assertThat(result).isEqualTo(expected);

    }

    @Test
    void canSetFirstName(){
        BankAccount bankAccount = new BankAccount("John","Smith","1990-01-25",12345);
        bankAccount.setFirstName("James");
        String result = bankAccount.getFirstName();
        String expected = "James";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void canGetLastName(){
        BankAccount bankAccount = new BankAccount("John","Smith","1990-01-25",12345);
    }
}
