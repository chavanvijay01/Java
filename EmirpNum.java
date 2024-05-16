// check the number is prime or not 
// if the number is prime then reverse the number
// check the reverse number is prime or not 
// if both the number and the reverse number are prime then it is an emirp number


import java.util.Scanner;

class EmirpNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int count = 0;
		for (int i = 2; i<num; i++ ) {
			if(num %i == 0){
				count++;
				break;
			}
		}

		boolean flag = count==0?true : false;

		if (flag) {
			int rev = 0;
			while(num>0){
				int rem = num%10;
				rev = rev *10 + rem;
				num/=10;
			}
			int count1 = 0;
			for (int i = 2; i<rev ;i++ ) {
				if (rev%i == 0) {
					count1 ++;
					break;
				}
			}
			boolean flag1 = count1==0?true : false;
			if (flag && flag1) {
				System.out.println("It is an emirp number ");
			}
			else{
				System.out.println("It is not an emirp number");
			}
		}
		else{
			System.out.println("not a Emirp number.");
		}
	}
}