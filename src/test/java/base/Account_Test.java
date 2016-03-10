package base;

import static org.junit.Assert.*;
import java.util.Date;
import org.junit.Test;


public class Account_Test {

	//Variables for tests
	int id = 1122;
	double balance = 20000;
	double annualInterestRate = 4.5;

	@Test
	public void depositTest() { //Test the deposit
		Account Account = new Account(id, balance, annualInterestRate);
		balance += 3000;
		assertEquals(balance, Account.deposit(3000), 0);

	}

	@Test	//Test that the withdrawal is correct
	public void withdrawTest() throws InsufficientFundsException {
		Account Account = new Account(id, balance);
		balance -= 2500;
		assertEquals(balance, Account.withdraw(2500), 0);
	}

	@Test(expected=InsufficientFundsException.class) //Test that insufficient funds is being used
	public void testWithdrawTooMuch() throws InsufficientFundsException { 
		Account Account = new Account(id, balance);
		Account.withdraw(99999);
		
	}
	
	@Test	//Print statement about bank account
	public void print() {
		Account a = new Account();
		double balance = a.getBalance();
		double monthlyInterest = a.getMonthlyInterestRate();
		Date dateCreated = a.getDateCreated();
		System.out.print(
			"Balance: $" + balance + " Monthly Interest: " + monthlyInterest + "% " + "Date: " + dateCreated);
	}

}
