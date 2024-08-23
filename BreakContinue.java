public class BreakContinue {
    public static void main(String[] args) {
        for(int i = 0; i <5 ;i++){
            System.out.println(i);
            System.out.println("Java is great");
            if(i == 2){
                System.out.println("Ending the loop");
                break;
            }
        }
        System.out.println("Loop ends here.");

        // continue veijailla

        int n=0;
        while(n < 5){
            n++;
            if(n == 2){
                System.out.println("Ending the loop.");
                continue;
            }
            System.out.println(n);
            System.out.println("Java is great.");
        }
    }
}
