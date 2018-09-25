package model;


public class FunctionSA {
	double calculatedbalance = 0;
	String intendedAction;

	public double depositSA(SavingAccount savingaccount) {
		calculatedbalance = savingaccount.getBalance();
		intendedAction = savingaccount.getActionDescription();
		
		if (intendedAction == "Deposit") {
			if (savingaccount.getAmount() <= 0){
				System.out.println("Deposit amount is Zero or Less.");
			}
			else if (savingaccount.getAmount() >= 5000){
				System.out.println("Deposit amount is over allowed limit - Over $5,000.00.");
			}
			else {
				calculatedbalance += savingaccount.getAmount();
				if (calculatedbalance >= 50000) {
					System.out.println("Acount balance is over limit allowed - Over $10,000.00.");
					calculatedbalance -= savingaccount.getAmount();
				}
			}
		}
		else {
			System.out.println("Invalid option selected - Should be Deposit.");
		}
		return calculatedbalance;
	}
	
	public double withdrawalSA(SavingAccount savingaccount) {
		calculatedbalance = savingaccount.getBalance();
		intendedAction = savingaccount.getActionDescription();
		
		if (intendedAction == "Withdrawal") {
			if (savingaccount.getAmount() <= 0){
				System.out.println("Withdrawal amount is Zero or Less.");
			}
			else if (savingaccount.getAmount() > 300){
				System.out.println("Withdrawal amount is over daily limit - Over $300.00.");
			}
			else {
				calculatedbalance -= savingaccount.getAmount();
				if (calculatedbalance < 0) {
					System.out.println("Acount has negative balance - Withdrawal rejected");
					calculatedbalance += savingaccount.getAmount();
				}
			}
		}
		else {
			System.out.println("Invalid option selected - Should be Withdrawal.");
		}
		return calculatedbalance;
	}
}
