package service;

import dal.AccountDAO;
import dal.AccountDAOImp;
import entities.Account;

//Service classes are singletones
public class AccountServiceImp implements AccountService {

	private AccountDAO accountDAO;
	private static AccountServiceImp instance;
	
	private AccountServiceImp(){
		accountDAO = new AccountDAOImp();
	}
	
	public static AccountService getInstance(){
		if(instance == null)
			instance = new AccountServiceImp();
		return instance;
	}
	
	@Override
	public boolean createAccount(Account account) {
		if (accountDAO.addAccount(account)) 
			return true;
		
		return false;
	}

	@Override
	public boolean addInterestToAllAccounts() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deposit(String accountNumbr, double amount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean wihdraw(String accountNumbr, double amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
