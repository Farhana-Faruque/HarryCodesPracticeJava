public class Methods {
    static void tellJokes(){
        System.out.println("I invented a new word....");
    }

    static int logic(int x, int y){
        int z;
        if(x>y){
            z = x + y;
        }
        else{
            z = (x + y) * 5;
        }
        return z;
    }

    public static void main(String[] args) {
        int a = 5, b = 7;
        int c;
        c = logic(a,b);
        System.out.println(c);
        int a1 = 2, b1 = 1;
        int c1 = logic(a1,b1);
        System.out.println(c1);

        // Method invocation using object creation
        // Methods obj = new Methods();
        // c = obj.logic(a,b); // this method is not static


    }
}
