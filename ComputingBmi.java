import java.util.Scanner;

class ComputingBmi{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the weight in pound : ");
		double weight = sc.nextDouble();
		System.out.print("Enter the height in inces : ");
		double height = sc.nextDouble();

		double bmi = (weight*0.45359237)/ ((height*0.0254)*(height*0.0254));
		System.out.println("The bmi is : "+ bmi);
	}
}