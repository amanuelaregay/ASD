package entities;

import java.util.List;

public abstract class Account {
	
	private String number;//account number
	private double interest;
	private Party party;//Account owned only by one party
	private double balance;
	private List<Transaction> transactions;
	
	public Account(String accountNumber, double interest, Party party, double balance) {
		super();
		this.number = accountNumber;
		this.interest = interest;
		this.party = party;
		this.balance = balance;
		//this.transactions = transactions;
	}

	public String getAccountNumber() {
		return number;
	}

	public double getInterest() {
		return interest;
	}

	public Party getParty() {
		return party;
	}

	public double getBalance() {
		return balance;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setAccountNumber(String accountNumber) {
		this.number = accountNumber;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public void setParty(Party party) {
		this.party = party;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	} 
	
	
	
	

}
