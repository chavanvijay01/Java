import java.util.*;


class Exam
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.next();
		String str1 = "";

		for (int i = 0; i<str.length(); i++ ) 
		{
			char ch = str.charAt(i);
			if (ch >='a' && ch <='z') 
			{
				str1 = str1 + (++ch);
			}
			else
			{
				str1 = str1 + ch;
			}
		}
		String op = "";

		for (int i = 0; i<str1.length() ; i++ ) 
		{
			char ch = str1.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u') 
			{
				op = op + (char) (ch - 32);
			}
			else
			{
				op = op + ch;
			}
		}
			System.out.println(op);
	}
	
}