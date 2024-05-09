

import java.util.Scanner;

class CheckCube{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		boolean flag = false;

		for(int i = 1; i<num; i++ ){
			if (i*i*i == num){
				flag = true;
				break;
			} 
		}
		if (flag) 
			System.out.println("The number is Cube");
		else 
			System.out.println("The number is not cube");
			
		
	}
}