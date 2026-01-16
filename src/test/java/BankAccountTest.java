import org.junit.jupiter.api.Test;

import com.imt.mines.BankAccount;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void testDepositMoney() {
        BankAccount account = new BankAccount();

        account.depositMoney(200.0);
        assertEquals(200.0, account.getBalance(), 0.001);
    }

    @Test
    void testDepositGoesWrongMoney() {
        BankAccount account = new BankAccount();

        account.depositMoney(-200.0);
        assertEquals(0.0, account.getBalance(), 0.001);
    }

}
