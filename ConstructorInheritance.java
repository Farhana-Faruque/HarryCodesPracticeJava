class MyBase{
    MyBase(){
        System.out.println("I am a constructor of an Inheritance..");
    }
    MyBase(int x) {
        System.out.println("I am an overloaded constructor of value: " + x);;
    }
}
class MyDerived extends MyBase{
    MyDerived(){
        super(0);
        System.out.println("I am a derived class constructor..");
    }
    MyDerived(int x, int y){
        super(x);
        System.out.println("I am an overloaded constructor of derived with value: " + y);
    }
}
class ChildDerived extends MyDerived{
    ChildDerived(){
        System.out.println("I am a child of derived class...");
    }
    ChildDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I am an overloaded constructor of derived with value: " + z);
    }
}

public class ConstructorInheritance {
    public static void main(String[] args) {
        MyBase b = new MyBase();
        MyDerived d = new MyDerived();
        System.out.println();

        MyBase b1 = new MyBase(3);
        MyDerived d1 = new MyDerived(4,5);
        System.out.println();

        ChildDerived cld = new ChildDerived();
        ChildDerived cld1 = new ChildDerived(2,3,4);
    }
}
