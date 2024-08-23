import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int age;
        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        switch(age){
            case 13:
                System.out.println("You are in your teenage");
                break;
            case 18:
                System.out.println("You are an adult");
                break;
            case 23:
                System.out.println("You have to start making money");
                break;
            case 60:
                System.out.println("You are retired");
                break;
            default:
                System.out.println("Enjoy your life!!!");
        }
        System.out.print("Thanks for enjoying Java code!");


        /*
        if(age>56){
            System.out.println("You are experienced!");
        }
        else if(age > 46){
            System.out.println("You are semi experienced!");
        }
        else if(age > 36){
            System.out.println("You are semi semi experienced!");
        }
        else{
            System.out.println("You are not experienced");
        } */
    }
}
