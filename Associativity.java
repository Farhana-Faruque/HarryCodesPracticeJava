public class Associativity {
    public static void main(String[] args) {
        // Precedence and Associativity
        int a = 6*5-34/2;
        // highest precedence goes to * and /
        /*  = 30 - 34/2
            = 30 - 17
            = 13
         */
        System.out.println(a);

        int b = 60/5 - 34*2;
        // associativity from left to right
        /*  = 12 - 34*2
            = 12 - 68
            = -56
        */
        System.out.println(b);

        a = 2;
        b = 4;
        int c = 3;
        int k = (b*b - 4*a*c) / (2*a);
        System.out.println(k);
        int x = 7;
        int y = 5;
        int z = (x - y)/2;
        System.out.println(z);
    }
}
