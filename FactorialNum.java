import java.util.Scanner;

class FactorialNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number : ");
		int num = sc.nextInt();

		int factorial = 1;

		for (int i = num; i>=1 ;i-- ) {
			factorial*=i;
		}
		System.out.println("The factorial of the num is : " + factorial);
	}
}