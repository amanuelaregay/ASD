package entities;

import java.time.LocalDate;

//Transaction represent an action happened on an account (e.g. withdraw from an account)

public class Transaction {
	
	public enum Type{ DEPOSIT, WITHDRAW}	
	
	private int number; //transaction number
	private LocalDate date;//transaction date
	private double ammount;
	private Type type;
	
	public Transaction(int number, LocalDate date, double ammount, Type type) {
		super();
		this.number = number;
		this.date = date;
		this.ammount = ammount;
		this.type = type;
	}

	public int getNumber() {
		return number;
	}

	public LocalDate getDate() {
		return date;
	}

	public double getAmmount() {
		return ammount;
	}

	public Type getType() {
		return type;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void setAmmount(double ammount) {
		this.ammount = ammount;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
	
	
	
	
	

}
