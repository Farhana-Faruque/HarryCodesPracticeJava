public class ArrayBlah {
    public static void main(String[] args) {
        // 1. declaration and memory allocation
        // int[] marks1 = new int[5];

        // 2. declaration and memory allocation
        // int[] marks2;
        // marks2 = new int[2];

        // 3. Declaration , memory allocation and initialization
        int[] marks = {100,133,76,87,99};
        System.out.println(marks.length);

        String[] students = {"Farhana", "Faiza", "Maeesha", "Aunanna"};
        System.out.println(students.length);
        System.out.println(students[2]);

        System.out.println("Printing using for loop..");
        for(int i = 0;i< marks.length ; i++){
            System.out.println(marks[i]);
        }

        System.out.println("Printing in reverse order using for loop..");
        for(int i = marks.length - 1; i >= 0 ; i--){
            System.out.println(marks[i]);
        }

        // for-each loop
        System.out.println("Using for-each loop...");
        for(int elements : marks){
            System.out.println(elements);
        }


    }
}
