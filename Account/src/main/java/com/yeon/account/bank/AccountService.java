package com.yeon.account.bank;

import java.util.ArrayList;
import java.util.List;

public class AccountService {
    private List<Account> accountList = new ArrayList<>();

    public int size() {
        return this.accountList.size();
    }

    public void clear() {
        this.accountList.clear();
    }

    public boolean addAccount(String name, String bankNumber, int money) {
        return this.accountList.add(new Account(name, bankNumber, money));
    }

    public boolean addAccount(Account account) {
        return this.accountList.add(account);
    }

    public List<Account> getAllAccount() {
        return this.accountList;
    }

    public boolean deposit(String bankNumber, int money) {
        Account account = this.findAccountByNumber(bankNumber);
        if (account == null) {
            return false;
        }
        account.setCurrent(account.getCurrent() + money);
        return true;
    }

    public boolean withdraw(String bankNumber, int money) {
        Account account = this.findAccountByNumber(bankNumber);
        if (account == null) {
            return false;
        }
        if (account.getCurrent() >= money) {
            account.setCurrent(account.getCurrent() - money);
            return true;
        }
        return false;
    }

    public Account findAccountByNumber(String bankNumber) {
        if (bankNumber == null || bankNumber.isEmpty()) {
            return null;
        }
        for (Account account : accountList) {
            if (bankNumber.equals(account.getBankNumber())) {
                return account;
            }
        }
        return null;
    }
}
