import java.util.Scanner;

class CalculateFutureInvestment{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter investment amount : ");
		double investmentAmount = sc.nextDouble();
		System.out.print("Enter the annual interest rate : ");
		double annualInterestRate = sc.nextDouble();
		System.out.print("Enter the number of year you want to invest : ");
		double numberOfYear = sc.nextDouble();

		
		double futureInvestmentValue = investmentAmount + ((investmentAmount/100)*annualInterestRate)*numberOfYear;
		System.out.println("The Accumulated value is : "+ futureInvestmentValue);
	}
}