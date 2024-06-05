clas OddException extends Exception{
	String message;
	OddException(String message){
		super(message);
	}
}


class EnvenOddExceptiob  
	
{
	public static void main(String[] args) {
		int num = 9;
		if(num%2==1){
			throw new OddException("Odd number Exception")
		}
		else{
			System.out.println("Even number ");
		}
	}
}