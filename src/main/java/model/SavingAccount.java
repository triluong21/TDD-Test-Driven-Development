package model;

public class SavingAccount {
		
	private String actionDescription;
	private double amount;
	private double balance;
	
	public SavingAccount() {
		
	}
	
	public SavingAccount(String a, double b) {
		this.actionDescription = a;
		this.amount = b;
	}
	
	public String getActionDescription() {
		return actionDescription;
	}
	public void setActionDescription(String actionDescription) {
		this.actionDescription = actionDescription;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

}
