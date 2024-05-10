import java.util.Scanner;

class CheckVovalOrConsonant  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the alphabate : ");
		char alphabate = sc.next().charAt(0);

		if(alphabate == 'a' || alphabate == 'A'){
			System.out.println("The alphabate is voval...");
		}
		else if(alphabate == 'e' || alphabate == 'E'){
			System.out.println("The alphabate is voval...");
		}
		else if(alphabate == 'i' || alphabate == 'I'){
			System.out.println("The alphabate is voval...");
		}
		else if(alphabate == 'o' || alphabate == 'O'){
			System.out.println("The alphabate is voval...");
		}
		else if(alphabate == 'u' || alphabate == 'U'){
			System.out.println("The alphabate is voval...");
		}
		else{
			System.out.println("The alphabate is consonant...");
		}
	}
}