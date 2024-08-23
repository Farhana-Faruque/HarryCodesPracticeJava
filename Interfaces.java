interface Bicycle{
    int a = 34;
    void applyBreak(int decrement);
    void speedUp(int increment);
}
interface Horn{
    void blowHorn();
}
class Cycle1 implements Bicycle, Horn{
    int speed = 45;
    public void blowHorn(){
        System.out.println("Pee pee poo pooo");
    }
    public void applyBreak(int decrements){
        System.out.println("Apply Break.");
    }
    public void speedUp(int increment){
        System.out.println("Apply Speed.");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        Cycle1 cl = new Cycle1();
        cl.blowHorn();
        cl.applyBreak(7);
        //  You can create properties in interfaces..
        System.out.println(cl.a);
    }
}
