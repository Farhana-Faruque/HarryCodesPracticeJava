interface Camera2{
    void takingSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning..");
    }
    default void record4k(){
        greet();
        System.out.println("Recording 4k videos...");
    }
}
interface Wifi2{
    String[] getNetwork();
    void connectToNetwork(String network);
}

class CellPhone2{
    void calling(int phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }
}
class SmartPhone2 extends CellPhone2 implements Wifi2, Camera2{
    public void takingSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Recording videos");
    }
    public String[] getNetwork(){
        System.out.println("Getting list of networks");
        String[] networkList = {"Blah", "Mya"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Camera2 cam1 = new SmartPhone2(); // its smartphone but works as a camera
        // cam1.getNetwork(); // Not Allowed
        cam1.record4k();

    }
}
