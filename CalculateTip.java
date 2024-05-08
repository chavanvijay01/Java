import java.util.Scanner;

class CalculateTip {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Subtotal : ");
		double subTotal = sc.nextDouble();
		System.out.print("Enter the Gratuity rate in percentage : ");
		double gratuity = sc.nextDouble();

		double tip = (subTotal/100)*gratuity;
		double totalBill = subTotal + tip;

		System.out.println(" The total bill is : " + totalBill);
	}
}