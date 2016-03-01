package quiz2;

import java.util.Scanner;

public class Quiz2 {
	
	public static void main(String[] args) {
		
		// Create scanner object to read input from user
		Scanner in = new Scanner(System.in);

		// Get user input
		System.out.println("Enter the initial tuition cost: ");
		double initialTuition = in.nextDouble();

		System.out.println("Enter percentage increases for tuition: ");
		double tuitionRate = (in.nextDouble() / 100);

		System.out.println("Enter the repayment APR: ");
		double APR = (in.nextDouble() / 100);

		System.out.println("Enter the term: ");
		double term = in.nextDouble();
		in.close();
		
		double totalCost = initialTuition;

		// Present the information
		System.out.print("The total tuition will be: $");
		System.out.printf("%.2f", calcTuition(initialTuition, tuitionRate));
		
		System.out.println();
		
		System.out.print("The monthly payment will be: $");
		System.out.printf("%.2f", calcMonthly(APR, term, totalCost));
	}

	/**
	 * A program that will calculate the total cost of tuition
	 * @return
	 * totalCost
	 */
	public static double calcTuition(double initialTuition, double tuitionRate) {
		double totalCost = initialTuition;
		for (int k = 1; k != 4; k++) {
			totalCost += ((totalCost / k) * (1 + tuitionRate));
		}
		return totalCost;
	}

	/**
	 * A program that will calculate monthly payment for student loans
	 * @return
	 * monthlyCost
	 */
	public static double calcMonthly(double APR, double term, double totalCost) {
		// Monthly payment
		double R = APR + 1;
		double T = term * 12;
		double monthlyCost = (((totalCost * APR * (Math.pow(R, T))) / ((Math.pow(R, T)) - 1)));
		
		return monthlyCost;
	}

}
