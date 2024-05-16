import java.util.*;

class EmployeeManagementSystem {
	static int eid;
	static String ename;
	static String erole;
	static double esal;


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*** Welcome ***");
		System.out.println();

        fertures:
		for (; ; ) {
			System.out.println("***  Features  ***");
			System.out.println("1. Add new Exployee");
			System.out.println("2. View Exployee");
			System.out.println("3. Edit Employee");
			System.out.println("4. Exit");
			System.out.println();
			System.out.print("Enter an option : ");
			int opt = sc.nextInt();

			switch(opt){
			case 1 : {
				addNewEmployee();
				break;
			}
			case 2 : {
				System.out.print("Enter the Eid : ");
				int eid1 = sc.nextInt();
				viewExployee(eid1);
				break;
			}
			case 3 : {
				System.out.println("Edit Employee Data");
				System.out.println("1. Edit Name");
				System.out.println("2. Edit Role");
				System.out.println("3. Edit Sal");
				System.out.print("Enter the option : ");
				int opt1 = sc.nextInt();
				switch(opt1){
					case 1 : {
						editName();
						break;
					}
					case 2 : {
						editRole();
						break;
					}
					case 3 : {
						editSal();
						break;
					}
					default : System.out.println("Invalid Input");
				}
				break;
			}
			case 4 : {
				System.exit(0);
				break;
			}
			default : System.out.println("Invalid Option");
			}
		}

	}

	public static  void addNewEmployee(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Data");
		System.out.print("Employee Name : ");
		ename = sc.nextLine();
		System.out.print("Enplyee Id : ");
		eid = sc.nextInt();
		sc.nextLine();
		System.out.print("Exployee role : ");
		erole = sc.nextLine();
		System.out.print("Exployee salary : ");
		esal = sc.nextDouble();
	}

	public static void viewExployee(int eid1){
		if (eid == eid1) {
			System.out.println("Employee Data");
			System.out.println("Name : " + ename);
			System.out.println("Emp Id : " + eid);
			System.out.println("Role : "+ erole);
			System.out.println("Salary : "+ esal);
			System.out.println();
		}
		else{
			System.out.println("Wrong Eid");
		}
	}
	public static void editName(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the new Name : ");
		String newName = sc.nextLine();
		ename = newName;


	}
	public static void editRole(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Role : ");
		String newRole = sc.nextLine();
		erole = newRole;

	}
	public static void editSal(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the new sal : ");
		double newSal = sc.nextDouble();
		esal = newSal;

	}
}