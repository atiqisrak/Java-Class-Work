class Student {
    public String name;
    public String id;
    public int batch;
    public String department;

    Student(){
        System.out.println("Student information: ");
    }
    public Student(String name, String id, int batch, String dept){
        this.name = name;
        this.id = id;
        this.batch = batch;
        this.department = dept;
    }
    public String getInfo(){
        String information = this.name+this.id+this.batch+this.department;
        return information;
    }
    public void show(){
        System.out.println("Name : "+this.name+ "\nID: "+this.id+
                "\nBatch: "+this.batch+ "\nDepartment: "+this.department);
    }
}
