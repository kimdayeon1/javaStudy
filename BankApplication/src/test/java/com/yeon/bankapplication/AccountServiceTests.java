package com.yeon.bankapplication;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccountServiceTests {
    private AccountService accountService;

    @BeforeEach
    public void setup() {
        accountService = new AccountService();
    }

    @Test
    public void testAddAccount() {
        assertTrue(accountService.addAccount("김다연", "111-111", 10000));
        assertEquals(1, accountService.size());
    }

    @Test
    public void testDeposit() {
        accountService.addAccount("김다연", "111-111", 10000);
        assertTrue(accountService.deposit("111-111", 5000));
        Account account = accountService.findAccountByNumber("111-111");
        assertEquals(15000, account.getCurrent());
    }

    @Test
    public void testWithdraw() {
        accountService.addAccount("김다연", "111-111", 10000);
        assertTrue(accountService.withdraw("111-111", 5000));
        Account account = accountService.findAccountByNumber("111-111");
        assertEquals(5000, account.getCurrent());
    }
}
