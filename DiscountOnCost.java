import java.util.Scanner;

class DiscountOnCost 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the quantity you want to purches : ");
		int quantity = sc.nextInt();
		int  prise = quantity*100;

		if(prise >= 1000){
			System.out.println("The Discounted prise is : " + (prise - (prise/100)*10) + " and you got a discount of " + ((prise/100)*10));
		}
	    else 
	    	System.out.println("The prise is : " + prise);
	}
}