package entities;

public class Saving extends Account {

	private double interetRate;
	
	public Saving(String accountNumber, double interest, Party party, double balance) {
		super(accountNumber, interest, party, balance);		
	}

	public double getInteretRate() {
		return interetRate;
	}

	public void setInteretRate(double interetRate) {
		this.interetRate = interetRate;
	}
}
