package com.capgemini.bankapp.service;

import com.capgemini.bankapp.exception.PayeeAccountNotFoundException;

public interface BankAccountService {

	
	public double getBalance(long accountId) throws PayeeAccountNotFoundException;
	public double withdraw(long accountId, double amount) throws PayeeAccountNotFoundException;
	public double deposit(long accountId, double amount);
	public boolean fundTransfer(long fromAcc, long toAcc, double amount) throws PayeeAccountNotFoundException;

}