import java.util.Scanner;

class EligibilityForInterview {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the percentage : ");
		int percentage = sc.nextInt();

		if(percentage > 60){
			System.out.println("You are eligible for Interview");
		}
		else 
			System.out.println("You are not eligible for Interview");
	}
}
