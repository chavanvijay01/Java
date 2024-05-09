
//  Write a program to check whether a year is leap year or not
import java.util.Scanner;

class CheckLeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Year : ");
		int year = sc.nextInt();

		if(year%4 == 0){
			System.out.println("The year is leap..");
		}
		else {
			System.out.println("The year is not leap..");
		}
	}
}