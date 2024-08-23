class EkClass{
    int a;
    public int getA() {
        return a;
    }
    EkClass(int a) {
        this.a = a;
    }
    public int returnOne(){
        return 1;
    }
}
class DoClass extends EkClass{
    DoClass(int x){
        super(x);
        System.out.println("I am a constructor");
    }
}
public class SuperThis {
    public static void main(String[] args) {
        EkClass e = new EkClass(2);
        System.out.println(e.getA());

        DoClass dc = new DoClass(45);
    }
}
