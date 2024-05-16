

// class Exp {
// 	public static void main(String[] args) {
// 		for (int i = 1; i <= 5; i++) {
           
//             // Print spaces 
//             for (int j = i; j <= 5; j++) {
//                 System.out.print(" ");
//             }
            
//             // Print asterisks
//             for (int j = 1; j  <=  i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
// 	}
// }


// For Pyramid
// for (int i = 1; i<=5 ;i++ ) {
// 			for (int j=i; j<=5; j++) {
// 				System.out.print(" ");
// 			}
// 			for (int j=1;j<=i; j++ ) {
// 				System.out.print("* ");
// 			}
// 			System.out.println();	
// 		}


// For inverted Pyramid 
/* 
 // Print spaces 
            for (int j = 1; j  <=  i; j++) {
                System.out.print(" ");
            }
            
            // Print asterisks
            for (int j = i; j  <=  5; j++) {
                System.out.print("* ");
            }

*/


class Exp{
	public static void main(String[] args) {
		for(int i= 1; i<=5; i++){
			for (int j = 1; j<=i ; j++) {
				System.out.print(" ");
			}
			for (int j = i; j<=5 ; j++ ) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}