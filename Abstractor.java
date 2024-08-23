abstract class Parent{
    public Parent() {
        System.out.println("I am a parent");
    }
    public void sayHello(){
        System.out.println("Hi");
    }
    abstract public void greet();
}

// overriding is different class, same methods
// overloading is same class, same methods with different parameters

class Child extends Parent{
    public void greet(){
       System.out.println("Good morning");
    }
    void name(){
        System.out.println("Tell me your name.");
    }
}
public class Abstractor {
    public static void main(String[] args) {
        Parent c = new Child();
        c.greet();
        c.sayHello();

    }
}
