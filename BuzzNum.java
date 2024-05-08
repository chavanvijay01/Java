// Buzz number 
// if the number is conpletely divisible by the 7 or the numbers last digit is 7
// then it is the buzz number





import java.util.Scanner;

class BuzzNum  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();

		if ((num%7 == 0) || (num%10 == 7)) {
			System.out.println(num + " is buzz nummber ");
		}
		else{
			System.out.println(num + " is not buzz number");
		}
	}
}