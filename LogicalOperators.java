public class LogicalOperators {
    public static void main(String[] args) {
        System.out.println("For logical AND....");
        boolean a = true;
        boolean b = false;
        if(a && b){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        System.out.println("For logical OR....");
        if(a || b){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        System.out.println("For logical NOT....");
        System.out.println("NOT(a) is " + !a);
        System.out.println("NOT(b) is " + !b);

    }
}
