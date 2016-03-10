package base;

import java.util.Date;

public class Account {

	// A private int data field named id for the account (default 0).
	private int id;

	// A private double data field named balance for the account (default 0).
	private double balance;

	// A private double data field named annualInterestRate
	private double annualInterestRate; // stores current interest rate

	// A private Date data field named dateCreated that stores the date when the
	// account was created.
	private Date dateCreated;

	// A no-arg constructor that creates a default account.
	Account() {
		id = 0;
		balance = 0.0;
		annualInterestRate = 0.0;
	}

	/**
	 * A constructor for the specified id and initial balance
	 * @param newId
	 * @param newBalance
	 */
	// balance.
	Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
	}
	
	/**
	 *  A constructor for the new id, balance, and annual interest rate
	 * @param newId
	 * @param newBalance
	 * @param newAnnualInterestRate
	 */
	Account(int newId, double newBalance, double newAnnualInterestRate) {
		id = newId;
		balance = newBalance;
		annualInterestRate = newAnnualInterestRate;
	}

	/**
	 * The accessor and mutator methods for id
	 * @return id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Accessor for balance
	 * @return balance
	 */
	public double getBalance() {
		return balance;
	}
	
	/**
	 * accessor method for annualInterestRate
	 * @return annualInterestRate
	 */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	/**
	 * The accessor method for dateCreated.
	 * @return dateCreated
	 */
	public Date getDateCreated() {
		return dateCreated;
	}

	/**
	 * A method named getMonthlyInterestRate() that returns 
	 * the monthly interest rate.
	 * @return monthly interest rate
	 */
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;

	}

	/**
	 * A method named withdraw that withdraws a specified amount from the account
	 * @param amount
	 * @return balance
	 * @throws InsufficientFundsException
	 */
		double withdraw(double amount) throws InsufficientFundsException {
			if (amount <= balance) {
				balance -= amount;

				return balance;
			} else {
				double needs = amount - balance;
				throw new InsufficientFundsException(needs);
			}
	}

	/**
	 * A method named deposit that deposits a specified amount to the account.
	 * @param amount
	 * @return balance after deposit
	 */
	double deposit(double amount) {
		return balance += amount;

	}

}
