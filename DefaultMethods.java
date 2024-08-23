interface Camera{
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
interface Wifi{
    String[] getNetwork();
    void connectToNetwork(String network);
}

class CellPhone{
    void calling(int phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }
}
class SmartPhone extends CellPhone implements Wifi, Camera{
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
public class DefaultMethods {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.record4k();
        String[] net = sp.getNetwork();
        for(String item : net){
            System.out.println(item);
        }
    }
}
