
import java.util.Scanner;


class EvilNum  {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number : ");
			int num = sc.nextInt();
			int countOfRem = 0;

			while(num != 0){
				countOfRem += num%2;

				num/=2;	
			}
			if (countOfRem%2 == 0)
				System.out.println("Num is Evil");
			else 
				System.out.println("Num is Odious");
			

		}	
}