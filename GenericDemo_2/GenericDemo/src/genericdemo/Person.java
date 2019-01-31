
package genericdemo;

public class Person<T> {
    
    T Object;

    public Person(T Object) {
        this.Object = Object;
    }
    
    public T getObject(){
        return this.Object;
    }
    
}
