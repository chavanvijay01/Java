import java.util.Scanner;

class AreaOfHexagon{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Length of Sides : ");
		double lengthOfSide = sc.nextDouble();

		double area = (3*(1.41421356)*(lengthOfSide*lengthOfSide))/2;
		System.out.println("The area of the Hexagon is : " + area);
	}
}