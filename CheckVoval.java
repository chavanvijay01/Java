// WAJP to check the characte is voval or not 
import java.util.Scanner;

class CheckVoval {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the character : ");
		String str = sc.next().toLowerCase();
		char ch = str.charAt(0);
		System.out.println((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')?"The character is Voval" : " The character is Consonant");
	}
}