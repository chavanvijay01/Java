import java.util.*;
class ConvertCelsiusToFahrenheit {
	public static void main(String[] args){
	
		System.out.println("Enter the temprature in degree : ");
		Scanner sc = new Scanner(System.in);
		 double celsius = sc.nextInt();

		double fahrenheit = 1.8 * celsius + 32;
		System.out.println(" The temprature in Fahrenheit is - " + fahrenheit);
		
	}
}