class CharcterLoop  {
	public static void main(String[] args) {

		System.out.println("From A to Z");
		for(char ch = 'A'; ch <= 'Z'; ch++){
			System.out.print(ch + " ");
		}

		System.out.println();
		for(char ch = 'a'; ch <= 'z'; ch++){
			System.out.print(ch + " ");
		}

		System.out.println();
		for(char ch = '0'; ch <= '9'; ch++){
			System.out.print(ch + " ");
		}


		System.out.println("From Z to A");

		for(char ch = 'Z'; ch >= 'A'; ch--){
			System.out.print(ch + " ");
		}

		System.out.println();
		for(char ch = 'z'; ch >= 'a'; ch--){
			System.out.print(ch + " ");
		}

		System.out.println();
		for(char ch = '9'; ch >= '0'; ch--){
			System.out.print(ch + " ");
		}




	}
}