import java.util.Scanner;

class AbleToDonateBlood  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your age :");
		int age = sc.nextInt();

		if (age >= 20) {
			System.out.print("Are you consume CIGARETTE or ALCOHOL in last 24 hrs (yes/no):");
			String consume = sc.next().toUpperCase();
			if(consume.equals("YES")){
				System.out.println("You are not eligible to donate blood.");
			}
			else {
				System.out.print("Enter your weight : ");
				int weight = sc.nextInt();
				if (weight > 50) {
					System.out.println("You are eligible to donate blood ");
				}
				else{
					System.out.println("You are not eligible to donate blood.");
				}
			}
				
		}
		else {
			System.out.println("You are not eligible to donate blood.");
		}
	}
}