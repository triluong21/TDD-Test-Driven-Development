package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import model.FunctionSA;
import model.SavingAccount;



public class TestFunctionSA {
	FunctionSA fSA = new FunctionSA();
	SavingAccount savingaccount = new SavingAccount("Functions", 0);
	
	@Before
	public void setUp() throws Exception {
	}
	
	// Test deposit with Invalid selection
	@Test
	public void testDepositSAInvalidSelect() {
		savingaccount.setBalance(10000);
		savingaccount.setActionDescription("Withdrawal");
		savingaccount.setAmount(1000);
		
		double returnedbalance = fSA.depositSA(savingaccount);
		assertEquals(10000, returnedbalance, 0.0);
	}
	// Test deposit amount within allowed limitation
	@Test
	public void testDepositSAInLimit() {
		savingaccount.setBalance(10000);
		savingaccount.setActionDescription("Deposit");
		savingaccount.setAmount(1000);
		
		double returnedbalance = fSA.depositSA(savingaccount);
		assertEquals(11000, returnedbalance, 0.0);
	}
	
	// Test deposit amount with zero dollar
	@Test
	public void testDepositSAZero() {
		savingaccount.setBalance(10000);
		savingaccount.setActionDescription("Deposit");
		savingaccount.setAmount(0);
		
		double returnedbalance = fSA.depositSA(savingaccount);
		assertEquals(10000, returnedbalance, 0.0);
	}
	
	// Test deposit amount over allowed limitation
	@Test
	public void testDepositSAOverLimit() {
		savingaccount.setBalance(10000);
		savingaccount.setActionDescription("Deposit");
		savingaccount.setAmount(5000);
		
		double returnedbalance = fSA.depositSA(savingaccount);
		assertEquals(10000, returnedbalance, 0.0);
	}
	
	// Test Withdrawal with Invalid Selection
	@Test
	public void testWithdrawalSAInvalidSelect() {
		savingaccount.setBalance(10000);
		savingaccount.setActionDescription("Deposit");
		savingaccount.setAmount(200);
		
		double returnedbalance = fSA.withdrawalSA(savingaccount);
		assertEquals(10000, returnedbalance, 0.0);
	}
	
	// Test Withdrawal within allowed limitation
	@Test
	public void testWithdrawalSAInLImit() {
		savingaccount.setBalance(10000);
		savingaccount.setActionDescription("Withdrawal");
		savingaccount.setAmount(200);
		
		double returnedbalance = fSA.withdrawalSA(savingaccount);
		assertEquals(9800, returnedbalance, 0.0);
	}
	
	// Test Withdrawal with Zero or less Dollar
	@Test
	public void testWithdrawalSAZero() {
		savingaccount.setBalance(10000);
		savingaccount.setActionDescription("Withdrawal");
		savingaccount.setAmount(-10);
		
		double returnedbalance = fSA.withdrawalSA(savingaccount);
		assertEquals(10000, returnedbalance, 0.0);
	}
	
	// Test Withdrawal over allowed daily limit
	@Test
	public void testWithdrawalSAOverLImit() {
		savingaccount.setBalance(10000);
		savingaccount.setActionDescription("Withdrawal");
		savingaccount.setAmount(301);
		
		double returnedbalance = fSA.withdrawalSA(savingaccount);
		assertEquals(10000, returnedbalance, 0.0);
	}
	
	// Test Withdrawal creates negative balance
	@Test
	public void testWithdrawalSANegativeBalance() {
		savingaccount.setBalance(200);
		savingaccount.setActionDescription("Withdrawal");
		savingaccount.setAmount(201);
		
		double returnedbalance = fSA.withdrawalSA(savingaccount);
		assertEquals(200, returnedbalance, 0.0);
	}
}
