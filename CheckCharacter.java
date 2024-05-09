//  Write a program to input any character and check whether it is alphabet, digit or special character

import java.util.Scanner;

class CheckCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the character : ");
		char ch = sc.next().charAt(0);
		if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
			System.out.println("The character is Alphabate");
		}
		else if(ch >= '0' && ch <= '9') {
			System.out.println("The character is Number");
		}
		else {
			System.out.println("The Character is Special char");
		}
	}
}