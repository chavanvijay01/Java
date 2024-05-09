// wajp to find whether a character is between 65 to 90 or 97 to 122 then it is alphabate
import java.util.Scanner;

class CheckTheAlphabate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the character : ");
		char c = sc.next().charAt(0);

		System.out.println(((c >=65 && c <= 90 ) || (c >= 97 && c<=122))?"alphabate" : "not alphabate");
	}
}