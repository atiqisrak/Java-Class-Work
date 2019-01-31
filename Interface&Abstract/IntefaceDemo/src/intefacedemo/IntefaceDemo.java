
package intefacedemo;


public class IntefaceDemo {

    
    public static void main(String[] args) {
        //SEU seu = new SEU();
        
        SEU studentSEU = new Student();
        SEU employeeSEU = new Employee();
        SEU adminSEU = new Admin();
        employeeSEU.showAllEmployee();
        adminSEU.getRoutine(49);
    }
    
}
