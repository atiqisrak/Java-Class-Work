
package abstractdemo;

public class AbstractDemo {

    
    public static void main(String[] args) {
        System.out.println("=====Normal Phone=====");
        Phone normalPhone = new NormalPhone();
        normalPhone.call("123");
        normalPhone.sms("123", "Hello");
        normalPhone.installApps();
        normalPhone.Facebook();
        normalPhone.Youtube();
        System.out.println("\n=====SmartPhone=====");
        Phone smartPhone = new SmartPhone();
        smartPhone.call("123");
        smartPhone.sms("123", "Hello");
        smartPhone.installApps();
        smartPhone.Facebook();
        smartPhone.Youtube();
    }
    
}
