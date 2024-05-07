import java.util.Scanner;
class Acceleration  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the starting velocity : ");
		double v0 = sc.nextDouble();
		System.out.print("Enter the ending velocity : ");
		double v1 = sc.nextDouble();
		System.out.print("Enter the time span : ");
		double t = sc.nextDouble();

		double avgAcceleration = (v1 - v0)/t;
		System.out.println("The average acceleration is : " + avgAcceleration + " m/s" );
	}
}