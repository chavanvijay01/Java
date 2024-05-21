// Write a program to find the factorial value of any number entered through the keyboard

import java.util.Scanner;

class FactorialLoops  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int factorial = 1;

		for (int i = num; i>=1 ; i-- ) {
			factorial = factorial*i;
		}
		System.out.println(factorial);
	}
}