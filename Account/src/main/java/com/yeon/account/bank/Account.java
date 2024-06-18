package com.yeon.account.bank;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Account {
    private String name;
    private String bankNumber;
    private int current;

    public Account() {
        this.name = "김다연";
    }

    public Account(String name, String bankNumber, int current) {
        this.name = name;
        this.bankNumber = bankNumber;
        this.current = current;
    }
}
