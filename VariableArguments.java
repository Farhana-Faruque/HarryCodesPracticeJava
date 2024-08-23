public class VariableArguments {
    /* static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }
    static int sum(int a, int b, int c, int d){
        return a+b+c+d;
    } */
    static int sum(int ...arr){
        int result = 0;
        for(int elements: arr){
            result += elements;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to variable arguments.....");
        System.out.println("The sum of nothing is " + sum());
        System.out.println("The sum of 1 is " + sum(1));
        System.out.println("The sum of 4 and 5 is " + sum(4,5));
        System.out.println("The sum of 4, 3,and 5 is " + sum(4,5,3));
        System.out.println("The sum of 4,3,2 and 5 is " + sum(4,5,2,3));
    }
}
