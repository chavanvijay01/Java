//  Diamond Star Pattern: This pattern prints a diamond shape with stars.


/*
			*
		   * *
		  * * *
		 * * * *
		* * * * *
		* * * * *
		 * * * *
		  * * *
		   * *
		    *
*/


class DiamondStarPattern {
	public static void main(String[] args) {

		// for pyramid
		for (int i = 1; i<=5 ;i++ ) {
			for (int j=i; j<=5; j++) {
				System.out.print(" ");
			}
			for (int j=1;j<=i; j++ ) {
				System.out.print("* ");
			}
			System.out.println();	
		}

		// for inverted pyramid
		for (int i=1; i<=5 ; i++ ) {
			for (int j=1; j<=i ;j++ ) {
				System.out.print(" ");
			}
			for (int j=i; j<=5 ;j++ ) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}