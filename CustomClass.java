// Template...
class Employee{
    int id;
    String name;
    int salary;

    public void print(){
        System.out.print("My id is " + id);
        System.out.println(" and my name is " + name);
    }
    public int getSalary(){
        return salary;
    }
}
// main class
public class CustomClass {
    public static void main(String[] args) {
        System.out.println("This is our custom class!!!");
        // Instantiating a new object
        Employee far = new Employee();
        Employee ank = new Employee();

        // setting attributes...
        far.id = 1506;
        far.salary = 50;
        far.name = "Farhana";

        ank.id = 17;
        ank.salary = 20;
        ank.name = "Ankon";

       //printing attributes...
        /* System.out.println(far.id);
        System.out.println(far.name); */

        far.print();
        ank.print();
        int salary = ank.getSalary();
        System.out.println(salary);
    }
}
