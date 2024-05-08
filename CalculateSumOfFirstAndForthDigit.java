// Write a program to calculate the sum of the first and the second last digit of a 5 digit.
import java.util.Scanner;

class CalculateSumOfFirstAndForthDigit{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the five digit number : ");
		int number = sc.nextInt();

		int first = number/10000;
		number %= 10000;

		int second = number/1000;
		number %= 1000;

		int third = number/100;
		number %= 100;

		int forth = number/10;
		number %= 10;

		int fifth = number;
		


		int sum = first + fifth;
		System.out.println("sum : " + sum);
	}
}