import java.util.Scanner;

class FindTheLargestNum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the num1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter the num2 : ");
		int num2 = sc.nextInt();

		System.out.println((num1 > num2)? num1 + " is greter" : num2 + " is greter");
	}
}  