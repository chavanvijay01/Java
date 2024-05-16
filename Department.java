class Department {
	
	String name;
	String hod;
	int noOfClassrooms;
	int noOfStaff;
	int noOfSubjects;
	Teacher teacher;


	Department(String name, String hod, int noOfClassrooms, int noOfStaff, int noOfSubjects){
		this.name = name;
		this.hod = hod;
		this.noOfClassrooms = noOfClassrooms;
		this.noOfStaff = noOfStaff;
		this.noOfSubjects = noOfSubjects;
	}

	public void displayDepartment(){
		System.out.println("*** Department Details ***");
		System.out.println("Name : " + name);
		System.out.println("HOD : " + hod);
		System.out.println("Number of classroom : " + noOfClassrooms);
		System.out.println("Number of Staff : " + noOfStaff);
		System.out.println("Total Subjects : " + noOfSubjects);
		System.out.println();
	}

	public void createInstanceOfTeacher(String name, String subject, String qualification, int experience, double salary){
		teacher = new Teacher(name, subject, qualification, experience, salary);
	}
}