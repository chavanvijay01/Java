import java.util.Scanner;

class EligibiltyForArmy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age : ");
		int age = sc.nextInt();

		if(age >= 18){
			System.out.print("Enter your height in cm : ");
			double height = sc.nextDouble();
			if(height >= 162){
				System.out.print("Enter your weight : ");
				double weight = sc.nextDouble();
				if(weight >= 56){
					System.out.println("You are elibible to join army.");
				}
				else{
					System.out.println("You are not eligible to join army.");
				}
			}
			else{
				System.out.println("You are not eligible for join Army.");
			}
		}
		else{
			System.out.println("You are not eligible for join Army.");
		}
	}
}