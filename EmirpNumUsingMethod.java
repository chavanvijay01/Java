import java.util.Scanner;

class EmirpNumUsingMethod {


	// Find the number is prime or Not
	public static boolean isPrime(int num){
		if(num <= 1)
			return false;

		int count = 0; 
		for (int i= 2; i<num ; i++) {
			if (num%i == 0) {
				count ++;
				break;
			}
		}
		boolean flag = count == 0?true:false; 
		return flag; 
	}

	// Check the number is emirp or not
	public static boolean emirpNum(int num){
		
		if(isPrime(num) == false)
			return false;

		int rev = 0;
		while(num>0){
			int rem = num%10;
			rev = rev*10 + rem;
			num/=10;
		}

		// Calling the prime method again for checkint the number is prime or not
		return isPrime(rev);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		
		if (emirpNum(num) == true) {
			System.out.println(num + " is Emirp");
		}
		else {
			System.out.println(num + " is Not Emirp");
		}

		// for (int i = 1; i<=1000; i++) {
		// 	if (emirpNum(i) == true) 
		// 		System.out.print(i + " ");	
		// }
	}		
}






