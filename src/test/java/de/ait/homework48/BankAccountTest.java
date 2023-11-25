package de.ait.homework48;

import de.ait.homework48.Exceptions48.InsufficientFundsException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private BankAccount bankAccountDmytro;
    private BankAccount bankAccountSasha;

    @BeforeEach
    void setUp() {
        bankAccountDmytro = new BankAccount("1", "Dmytro01");
        bankAccountSasha = new BankAccount("2", "Sasha02");
        assertEquals(0, bankAccountDmytro.getBalance());
        assertEquals(0, bankAccountSasha.getBalance());

    }

    @Test
    void depositSuccess() {
        bankAccountDmytro.deposit(120.5);
        assertEquals(120.5, bankAccountDmytro.getBalance());

    }

    @Test
    void depositIncorrectAmountFail() {
        assertThrows(IllegalArgumentException.class, () ->
        {bankAccountDmytro.deposit(-5);});
        assertEquals(0, bankAccountDmytro.getBalance());
    }

    @Test
    void withdrawSuccess() {
        bankAccountSasha.deposit(200.8);
        assertEquals(200.8, bankAccountSasha.getBalance());
        bankAccountSasha.withdraw(150.3);
        assertEquals(50.5, bankAccountSasha.getBalance());
    }

    @Test
    void withdrawNegativeAmountFail() {
        assertThrows(IllegalArgumentException.class, () ->
        {bankAccountSasha.deposit(-1000);});
        assertEquals(0, bankAccountSasha.getBalance());
    }

    @Test
    void withdrawInsufficientFundsFail() {
        bankAccountSasha.deposit(170.4);
        assertEquals(170.4, bankAccountSasha.getBalance());
        assertThrows(InsufficientFundsException.class, () ->
        {bankAccountSasha.withdraw(1000);});
    }

}