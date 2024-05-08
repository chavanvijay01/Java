import java.util.Scanner;

class Bonus
 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Salary : ");
		int salary = sc.nextInt();
		System.out.print("Enter the experience : ");
		int exp = sc.nextInt();

		if(exp > 5)
			System.out.println("The net bonus amount is : "+ ((salary/100)*5) + " The increased salary is : " + (salary+(salary/100)*5));
		else 
			System.out.println("The salary is :" + salary);
	}
} 