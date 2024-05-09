// WAJP to check the digit is number or not 
import java.util.Scanner;

class CheckTheDigit{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the digit : ");
		int digit = sc.nextInt();

		System.out.println((digit >=0 && digit <= 9)?"The number is digit" : "The number is not digit");
	}
}