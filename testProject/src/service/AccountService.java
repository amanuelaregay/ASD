package service;

import entities.Account;

public interface AccountService {
	
	boolean createAccount(Account account);//add account to database
	
	boolean addInterestToAllAccounts();
	
	boolean deposit(String accountNumbr, double amount);
	
	boolean wihdraw(String accountNumbr, double amount);	

}
