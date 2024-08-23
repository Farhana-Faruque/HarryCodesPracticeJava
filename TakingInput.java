import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking inputs from the keyboard");
        Scanner sc = new Scanner(System.in);

        /* System.out.print("First number: ");
        int a = sc.nextInt();
        System.out.print("Second number: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum is: " + sum);

        boolean b1 = sc.hasNextInt(); // this is used for checking if the input is integer
        System.out.println(b1);

        String str = sc.next(); // it will print only a word
        System.out.println(str); */

        String str1 = sc.nextLine(); // it will print a whole line
        System.out.println(str1);
    }
}
