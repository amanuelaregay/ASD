package dal;

import java.util.List;
import java.util.stream.Collectors;

import database.DBTables;
import entities.Account;

public class AccountDAOImp implements AccountDAO {

	@Override
	public boolean addAccount(Account account) {
		DBTables.ACCOUNT_TABLE.add(account);
		return true;
	}

	@Override
	public boolean depositToAccount(String accountNumber, double amount) {
		
		Account accountToUpdate = findAccount(accountNumber);
		if (accountToUpdate != null) {
			accountToUpdate.setBalance(accountToUpdate.getBalance() + amount); // TODO: test it																				 
			return true;
		}

		return false;
	}

	@Override
	public boolean wihdrawFromAccount(String accountNumber, double amount) {
		
		Account accountToUpdate = findAccount(accountNumber);
		if (accountToUpdate != null) {
			accountToUpdate.setBalance(accountToUpdate.getBalance() - amount); // TODO: test it																				 
			return true;
		}

		return false;
	}

	@Override
	public boolean addInterest(String accountNumber, double interest) {
		Account accountToUpdate = findAccount(accountNumber);
		if (accountToUpdate != null) {
			accountToUpdate.setInterest(interest); // TODO: test it																				 
			return true;
		}

		return false;
	}
	
	//Return Account object if found, null if not
	@Override
	public Account findAccount(String accountNumber){
		List<Account> list = 
				DBTables.ACCOUNT_TABLE.stream().
				filter(account -> account.getAccountNumber() == accountNumber)
				.collect(Collectors.toList()); //should get one object
		
		if (list.size() > 0)
			return list.get(0);
		
		return null;
		
	}

}
