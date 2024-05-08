// Write a program to calculate the sum of first 10 natural number

import java.util.Scanner;

class CalculateSumUsingLoops {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number : ");
	int num = sc.nextInt();
	int sum = 0;

	for (int i = 0; i<=num ;i++ ) {

			sum = sum + i;
			
		}
		System.out.print("The sum of natural is : " + sum);
	}
}