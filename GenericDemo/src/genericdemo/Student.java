
package genericdemo;

import java.util.Comparator;

public class Student implements Comparable<Student>{
    String name;
    String address;
    String instituteName;
    String instituteAddress;
    String id;
    String department;
    int batch;
    double cgpa;

    public Student(String name, String address, String instituteName, String instituteAddress, String id, String department, int batch, double cgpa) {
        this.name = name;
        this.address = address;
        this.instituteName = instituteName;
        this.instituteAddress = instituteAddress;
        this.id = id;
        this.department = department;
        this.batch = batch;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    public String getInstituteAddress() {
        return instituteAddress;
    }

    public void setInstituteAddress(String instituteAddress) {
        this.instituteAddress = instituteAddress;
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

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public int compareTo(Student t) {
        if(t.cgpa>this.cgpa)
            return 1;
        return 0;
    }
    
    
    
    
}
