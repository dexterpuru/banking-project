package com.upGrad.service;

import com.upGrad.beans.Account;
import com.upGrad.exceptions.AccountNotFoundException;

import java.util.HashMap;
import java.util.List;

public interface AccountService {
    public Account createAccount(Account account);
    public Account loginAccount(int accountNumber, int pin) throws AccountNotFoundException;
    public Account addAmount(int accountNumber, int amount) throws AccountNotFoundException;
    public Account getAmount(int accountNumber, int pin, int amount) throws AccountNotFoundException;
    public boolean deleteAccount(Account account);
    public HashMap<Integer,Account> getAllAccounts();
}
