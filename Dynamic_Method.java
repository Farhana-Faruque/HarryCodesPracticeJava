class Phone{
    public void showTime(){
        System.out.println("Time is 8 am");
    }
    public void on(){
        System.out.println("Turning on phone..");
    }
}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music..");
    }
    public void on(){
        System.out.println("Turning on in class Two");
    }
}
public class Dynamic_Method {
    public static void main(String[] args) {
        Phone obj = new Phone();
        //obj.on();

        SmartPhone sm = new SmartPhone();

        Phone ph = new SmartPhone(); // Allowed
        // SmartPhone sm2 = new Phone(); // Not Allowed
        ph.showTime();
        ph.on();
        //ph.music();// not allowed
    }
}
