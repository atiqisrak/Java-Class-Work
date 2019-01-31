
package abstractdemo;

public class SmartPhone extends Phone{

    @Override
    public void call(String number) {
        super.call(number); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sms(String number, String body) {
        super.sms(number, body); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void installApps() {
        System.out.println("Yes, can install apps");
    }

    @Override
    void Facebook() {
        System.out.println("yes, can access facebook");
    }

    @Override
    void Youtube() {
        System.out.println("Yes, can access Youtube");
    }

    
    
}
