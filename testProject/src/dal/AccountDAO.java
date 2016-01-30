package dal;

import entities.Account;

public interface AccountDAO {
	
	boolean addAccount(Account account);
	
	boolean depositToAccount(String accountNumber, double amount);
	
	boolean wihdrawFromAccount(String accountNumber, double amount);
	
	boolean addInterest(String accountNumber, double interest);//add interest to specific account. TODO: is the signature is correct
	
	public Account findAccount(String accountNumber);

}
