package de.ait.homework43;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private BankAccount bankAccountDima;
    private BankAccount bankAccountShoni;

    @BeforeEach
    void setUp() {
        bankAccountDima = new BankAccount("Dima", 4.84);
        bankAccountShoni = new BankAccount("Shoni", 300);

    }

    @Test
    void depositAmountPositiveSuccess() {
        assertEquals(4.84, bankAccountDima.checkBalance());
        bankAccountDima.deposit(100);
        assertEquals(104.84, bankAccountDima.checkBalance());
    }

    @Test
    void depositAmountPosAndNegFail() {
        assertEquals(4.84, bankAccountDima.checkBalance());
        bankAccountDima.deposit(3);
        assertEquals(4.84, bankAccountDima.checkBalance());
        bankAccountDima.deposit(-10);
        assertEquals(4.84, bankAccountDima.checkBalance());

    }

    @Test
    void withdrawSuccess() {
        bankAccountShoni.withdraw(100);
        assertEquals(200,bankAccountShoni.checkBalance());
    }

    @Test
    void withdrawFail() {
        bankAccountShoni.withdraw(500);
        assertEquals(300,bankAccountShoni.checkBalance());
    }

    @Test
    void checkBalance() {
        bankAccountShoni.deposit(-200);
        assertEquals(300,bankAccountShoni.checkBalance());

        bankAccountDima.deposit(0);
        assertEquals(4.84,bankAccountDima.checkBalance());
    }
}