class MainClass{
	public static void main(String[] args){
		// instance/Object create of student class
		Student stu = new Student();
		
		// set data into student class
		stu.fullName = "ABC";
		stu.contactNumber = "123";
		stu.emailAddress = "abc@gmail.com";
		stu.homeAddress = "Banani";

		// show student information from student class
		stu.showStudentInformation();

		// get student information from student class
		String output = stu.getStudentInformation();
		System.out.println("Output information: "+output);
	}
}