package com.yeon.bankapplication;
import com.yeon.bankapplication.AccountService;
import com.yeon.bankapplication.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;


public class BanksystemApplicationTests {
    private AccountService accountService;
    private BankApplication bankApplication;

    @BeforeEach
    public void setup() {
        accountService = new AccountService();
        //bankApplication = new BankApplicationNew(accountService);
    }


    @Test
    public void testAddAccount() {
        accountService.addAccount("김다연", "111-111", 10000);// 계좌 생성 후 종료

        Account account = accountService.findAccountByNumber("111-111");
        assertNotNull(account);
        assertEquals("김다연", account.getName());
        assertEquals(10000, account.getCurrent());
    }

    @Test
    public void testDeposit() {
        accountService.addAccount("김다연", "111-111", 10000);

        assertTrue(accountService.deposit("111-111", 5000));

        Account account = accountService.findAccountByNumber("111-111");
        assertNotNull(account);
        assertEquals(15000, account.getCurrent());
    }

    @Test
    public void testWithdraw() {
        accountService.addAccount("김다연", "111-111", 10000);

        assertTrue(accountService.withdraw("111-111", 5000));

        Account account = accountService.findAccountByNumber("111-111");
        assertNotNull(account);
        assertEquals(5000, account.getCurrent());
    }


    private void simulateInput(String input) {
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
    }
}
