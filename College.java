class College {
	
	String name;
	int collegeCode;
	String address;
	int noOfDepartment;
	char grade;
	int staffCount;
	Department department;



	College(String name, int collegeCode, String address, int noOfDepartment, char grade, int staffCount){
		this.name = name;
		this.collegeCode = collegeCode;
		this.address = address;
		this.noOfDepartment = noOfDepartment;
		this.grade = grade;
		this.staffCount = staffCount;
	}


	public void displayCollege(){
		System.out.println("*** College Details ***");
		System.out.println("name : " + name);
		System.out.println("College Code : " + collegeCode);
		System.out.println("Address : " + address);
		System.out.println("Number of Department : " + noOfDepartment);
		System.out.println("Grade : " + grade);
		System.out.println("Number of Staff : " + staffCount);
		System.out.println();
	}

	public void createInstanceOfDepartment(String name, String hod, int noOfClassrooms, int noOfStaff, int noOfSubjects){
		department = new Department(name, hod, noOfClassrooms, noOfStaff, noOfSubjects);
	}

}