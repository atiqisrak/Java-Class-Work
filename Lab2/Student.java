class Student{
	public String fullName;
	public String contactNumber;
	public String emailAddress;
	public String homeAddress;

	Student(){
	
	}

	public Student(String name, String number, String email,
				   String homeAddress){
		this.fullName = name;
		this.contactNumber = number;
		this.emailAddress = email;
		this.homeAddress = homeAddress;
	}

	public void showStudentInformation(){
		System.out.println("Name is "+this.fullName+" , " +
				"mobile number is: "+this.contactNumber);
	}

	public String getStudentInformation(){
		String information = "Name is "+this.fullName+" , " +
				"mobile number is: "+this.contactNumber;
		return information;
	}
}
