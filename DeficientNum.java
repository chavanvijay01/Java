import java.util.Scanner;


class DeficientNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i<num ; i++ ) {
			if (num%i == 0) {
				sum += i;
			}
		}

		if (num > sum) {
			int defi = (2*num) - (num + sum);
			System.out.println(defi);
			}
		else{
			System.out.println("It is not deficient Num");
		}						
	}
} 