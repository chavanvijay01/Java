import java.util.Scanner;

class CalculatingEnergy{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the amount in kilogram : ");
		double m = sc.nextDouble();
		System.out.print("Enter the initial temprature in degree Celsius : ");
		double initialTemp = sc.nextDouble();
		System.out.print("Enter the final temprature in degree Celsius : ");
		double finalTemp = sc.nextDouble();

		double energy = m*(finalTemp-initialTemp)*4184;
		System.out.println("The energy needed is : " + energy);
	}
}