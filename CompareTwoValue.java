import java.util.Scanner;

class CompareTwoValue{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the num1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter the num2 : ");
		int num2 = sc.nextInt();

		System.out.println((num1 > num2 )? num2 + " is smaller " : num1 + " is smaller");
	}
}