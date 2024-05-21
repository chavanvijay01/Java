import java.util.Scanner;

class FindingTheRunwayLength{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the speed V : ");
		double v = sc.nextDouble();
		System.out.print("Enter the Accelaration A : ");
		double a = sc.nextDouble();

		double length = (v*v)/(2*a);
		System.out.println("The minimum length is : "+ length);
	}
}