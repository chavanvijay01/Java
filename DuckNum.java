// if the numbers first digit contain 0 than it is not a duck number
// if the numbers first digit is not 0 than it is the duck number

import java.util.Scanner;

class DuckNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		String num = sc.next();

		if(num.charAt(0) == '0'){
			System.out.print("It is not DuckNum");
		}
		else {
			System.out.println("It is DuckNum");
		}
	}
}