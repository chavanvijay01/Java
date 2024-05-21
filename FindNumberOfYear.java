import java.util.Scanner;

class FindNumberOfYear{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number in minutes : ");
		double minutes = sc.nextDouble();

		double minuteInYear = 365*24*60;
		double year = minutes/minuteInYear;


		System.out.println("The year are : " + year);
	}
}