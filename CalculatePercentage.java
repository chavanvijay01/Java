// If the marks of Robert in three subjects are 78,45 and 62 respectively (each out of 100 ), write a program to calculate his total marks and percentage marks.

import java.util.Scanner;

class CalculatePercentage{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the marks for subject1 : ");
		double subject1 = sc.nextDouble();
		System.out.print("Enter the marks for subject2 : ");
		double subject2 = sc.nextDouble();
		System.out.print("Enter the marks for subject3 : ");
		double subject3 = sc.nextDouble();

		double totalMarks = subject1 + subject2 + subject3;
		double percentage = (totalMarks/300)*100;

		System.out.println("The percentage is : " + percentage + "% and the total marks are : "+ totalMarks);
	}
}