import java.util.Scanner;

class CheckTheSquare
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Length : ");
		double length = sc.nextDouble();
		System.out.print("Enter the breadth : ");
		double breadth = sc.nextDouble();

		if (length == breadth) 
			System.out.println("This is the Square");
		else
			System.out.println("This is not Square");
		
	}
}