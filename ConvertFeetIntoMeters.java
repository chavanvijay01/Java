import java.util.Scanner;
class ConvertFeetIntoMeters{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number in feet : ");
		double feet = sc.nextDouble();
		double meter = feet * 0.305;
		System.out.println("The number in meter is " + meter + " meters");
	}
}