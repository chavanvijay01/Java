import java.util.Scanner;

class Election{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your age : ");
		int age = sc.nextInt();

		if(age >= 18){
			System.out.print("Do u have a votar Id (yes/no) :");
			String votarId = sc.next().toLowerCase();
			if(votarId.equals("yes")){
				System.out.println("***** Welcome *****");
				System.out.println("1. BJP");
				System.out.println("2. Congress");
				System.out.println("3. AAP");
				System.out.println("4. MNS");
				System.out.println("5. ShivSena");
				System.out.println("6. NCP");
				System.out.println("7. NOTA");

				System.out.print("Enter your option to vote your party :");
				String vote = sc.next().toUpperCase();
				if(vote.equals("BJP")){
					System.out.println("You have voted for BJP");
				}
				else if(vote.equals("CONGRESS")){
					System.out.println("You have voted for Congress");
				}
				else if(vote.equals("AAP")){
					System.out.println("You have voted for AAP");
				}
				else if(vote.equals("MNS")){
					System.out.println("You have voted for MNS");
				}
				else if(vote.equals("SHIVSENA")){
					System.out.println("You have voted for ShivSena");
				}
				else if(vote.equals("NCP")){
					System.out.println("You have voted for NCP");
				}
				else if(vote.equals("NOTA")){
					System.out.println("You have wested your time ");
				}
				else{
					System.out.println("Invalid Option");
				}
			}
			else{
				System.out.println("Jaldi vaha se hato");
			}
		}
		else{
			System.out.println("You are not eligible for voat try agter " + (18 - age) + " year");
		}
	}
}