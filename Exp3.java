

// class Exp3{
// 	public static void main(String[] args) {
		
// 		int num1 =0;
// 		int num2 = 1;
// 		System.out.print(num1 + " " + num2 + " ");
// 		for (int i = 1; i<=10 ; i++) {
// 			int num3 = num1 + num2;
// 			num1 = num2;
// 			num2 = num3;
// 			System.out.print(num3 + " ");
// 		}
// 	}
// }


// class Exp3  {
// 	public static void main(String[] args) {
// 		String name = "nitin";

// 		String rev = "";

// 		int length = name.length();

// 		for (int i = length-1; i>=0; i--) {
// 			rev = rev + name.charAt(i);
// 		}
// 		if (name.equals(rev)) {
// 			System.out.println("Palindrome");
// 		}
// 		else{
// 			System.out.println("Not Palindrome");
// 		}
// 	}
// }

/*
      5 6 7 8 9
        c d e f 
          2 3 4
            a b
              1

*/

/*
class Exp3 {
	public static void main(String[] args) {
		
		
		for (int i = 1; i<= 5; i++) {
			int num = 5;
			char ch = 'c';
			for (int j = 1; j<=i; j++) {
				System.out.print("  ");
			}
			if (i%2 == 1) {
				for (int j = 5; j>=i ; j-- ) {
					System.out.print(num++ + " ");
				}
				num -= i;
			}
			else{
				for (int j= 5; j>=i ; j-- ) {
					System.out.print(ch++ + " ");

				}
				// ch = ch - i;
			}
			System.out.println();
			
		}
	}
}
*/



/* 

		1 
	  1 2 3
	1 2 3 4 5
  1 2 3 4 5 6 7
1 2 3 4 5 6 7 8 9 
  1 2 3 4 5 6 7 
    1 2 3 4 5
      1 2 3 
        1


*/

class Exp3 {
	public static void main(String[] args) {
		for (int i = 1; i<= 4; i++ ) {
		int num = 1;
		int num1 = 3;
		for (int j = 5; j>=i; j-- ) {
			System.out.print("  ");
		}
		for (int j = 1; j<=i;  j++) {
			System.out.print(num++ + " ");
		}
		for (int j = 2; j<=i; j++) {
			System.out.print(num1++ + " ");
		}
		// num1++;
		System.out.println();
	}

		for (int i = 1; i<=5; i++ ) {
			int num = 1;
			int num1 = 5;
			for (int j= 1; j<=i ; j++ ) {
				System.out.print("  ");
			}
			for (int j = i; j<=4; j++) {
				System.out.print(num++ + " ");
			}
			for (int j = i-1; j<=4; j++ ) {
				System.out.print(num1++ + " ");

			}
			
			System.out.println();
		}





	}
}
