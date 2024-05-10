import java.util.Scanner;

class ConvertPoundsIntoKilogram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number in pounds : ");
		double pound = sc.nextDouble();

		double kilogram  = pound * 0.454;
		System.out.println("In number in kilogram is : " + kilogram + " Kg");
	}
}