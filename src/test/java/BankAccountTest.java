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

    @Test
    void testWithdrawMoney() {
        BankAccount account = new BankAccount();
        account.depositMoney(200.0);
        account.setWithdrawLimit(200.0);
        assertEquals(true, account.withdrawMoney(100.0));
    }

    @Test
    void testWithdrawMoneyNotMoney() {
        BankAccount account = new BankAccount();
        account.depositMoney(50.0);
        account.setWithdrawLimit(200.0);
        assertEquals(false, account.withdrawMoney(100.0));
    }

    @Test
    void testWithdrawMoneyLimit() {
        BankAccount account = new BankAccount();
        account.depositMoney(200.0);
        account.setWithdrawLimit(50.0);
        assertEquals(false, account.withdrawMoney(100.0));
    }

    @Test
    void testWithdrawNegatifAmount() {
        BankAccount account = new BankAccount();
        account.depositMoney(200.0);
        account.setWithdrawLimit(200.0);
        assertEquals(false, account.withdrawMoney(-100.0));
    }
}
