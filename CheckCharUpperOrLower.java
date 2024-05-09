// WAJP to check the character is alphabate or not if it is alphabate then is upparcase or lowercase

import java.util.Scanner;
class CheckCharUpperOrLower{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the cheracter : ");
		char ch = sc.next().charAt(0);

		System.out.println(((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))? ((ch >= 65 && ch <= 90)?"The character is upper":"character is lower" ) : "charracter is not alphabate");
	}
}