# Exercice 8 : Écriture de tests unitaires pour le domaine bancaire


```java
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
```
```
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.017 s -- in BankAccountTest
```