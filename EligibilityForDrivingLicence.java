import java.util.Scanner;

class EligibilityForDrivingLicence  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age : ");
		int age = sc.nextInt();
		if(age >= 18){
			System.out.print("Enter your RTO test Score : ");
			int testScore = sc.nextInt();
			if(testScore >= 60){
				System.out.println("You can drive the vehicle");
			}
			else {
				System.out.println("Re-appear for test again.");
			}
		}
		else{
			System.out.println("You are not able to take diriving test try after " + (18-age) + " Year");
		}

	}
}