import java.io.IOException;
public class Student {
    private String name;
    private String id;
    private String department;
    private int batch;

    public Student() {
        this.name = name;
        this.id = id;
        this.department = department;
        this.batch = batch;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public int getBatch() {
        return batch;
    }
    public void setBatch(int batch) {
        this.batch = batch;
    }
}
public class CGPA {
    private int semester;
    private double GPA;
    private int credit;

    public CGPA(int isemester, double iGPA, int icredit) {
        semester = isemester;
        GPA = iGPA;
        credit = icredit;
    }
    public void setSemester(int semester) {
        this.semester = semester;
    }
    public int getSemester() {
        return semester;
    }
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    public double getGPA() {
        return GPA;
    }
    public void setCredit(int credit) {
        this.credit = credit;
    }
    public int getCredit() {
        return credit;
    }
    public double getCGPA() {
        return 3;
    }
}
public class StudentRecord {
    public static void main(String[] args) throws IOException {
        Student student1 = new Student();
        student1.setName("Name: Niloy");
        student1.setId("\nID: 2016100000039");
        student1.setDepartment("\nDepartment: CSE\nBatch: ");
        student1.setBatch(43);

        CGPA CSE2014 = new CGPA(2,3.25,4);
        CGPA CSE2015 = new CGPA(1,2.8,4);
        CGPA CSE2016 = new CGPA(4,4,3);

        String s = student1.getName()+student1.getId()+student1.getDepartment()+student1.getBatch();
        System.out.println(s);
        System.out.println("");
        double tGPA = CSE2014.getCGPA() + CSE2015.getCGPA() + CSE2016.getCGPA();
        double tCredit = CSE2014.getCredit()+CSE2015.getCredit()+CSE2016.getCredit();
        double tCGPA = (tGPA*tCredit)/tCredit;
        System.out.println("CGPA: "+tCGPA);
    }
}
