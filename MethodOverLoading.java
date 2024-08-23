public class MethodOverLoading {
    static void foo(){
        System.out.println("Good morning!!!");
    }
    static void foo(int a){
        System.out.println("Bad morning.... " + a);
    }
    static void foo(int a, int b){
        System.out.println("Good morning bro " + a);
        System.out.println("Bad morning bro " + b);
    }


    static void change(int a){
        a = 98;
    }

    static void changeArray(int[] array){
        array[0] = 56;
    }

    static void tellJokes(){
        System.out.println("I invented a new word...\n");
    }

    public static void main(String[] args) {
        tellJokes();
        // case 1 : changing the integer
        int x = 45;
        change(x);
        System.out.println("After running change the x is: " + x);

        // changing the array
        int[] arr = { 12,2341,4563,123,675};
        changeArray(arr);
        System.out.println("The change is " + arr[0]);
        System.out.println();

        // Method Overloading
        foo();
        foo(200);
        foo(45,123);

    }
}
