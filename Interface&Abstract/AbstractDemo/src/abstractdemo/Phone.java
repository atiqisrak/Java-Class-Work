
package abstractdemo;

public abstract class Phone {
    String name;
    String model;
    String menufacturer;
    String brand;
    
    // common 
    public void call(String number){
        System.out.println("calling...");
    }
    
    public void sms(String number, String body){
        System.out.println("SMS send to "+number+" and body "+body);
    }
    
    // smart phone
    abstract void installApps();
    abstract void Facebook();
    abstract void Youtube();
}
