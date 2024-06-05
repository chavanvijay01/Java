

class ExceptionHandlingExp {
	public static void main(String[] args) {
		System.out.println("Exc Starts");
		try{
			System.out.println(10/0);	
		}
		// System.out.println("Can We have code between try and catch block ");
		catch(ArithmeticException ae){
			ae.printStackTrace();
		}
		// System.out.println("Can we have code between try and finally block ");
		finally{
			System.out.println("Hi from finally block ");
		}
		System.out.println("Exc Ends");
	}
}