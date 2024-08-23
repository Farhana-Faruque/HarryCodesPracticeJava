class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 45;
        name = "My name is blah blah";
    }
    public MyMainEmployee(String n){
        id = 45;
        name = n;
    }
    public MyMainEmployee(String n, int myid){
        id = myid;
        name = n;
    }

    public void setName(String n){
        this.name = n;
    }
    public int getId(){
        return id;
    }
    // setter
    public void setId(int i){
        this.id = i;
    }
    // getter
    public String getName(){
        return name;
    }
}

public class Constructor {
    public static void main(String[] args) {
        MyMainEmployee harry = new MyMainEmployee();
        MyMainEmployee harry1 = new MyMainEmployee("Farhana");
        MyMainEmployee harry2 = new MyMainEmployee("Blah", 9);
        /*harry.setId(87);
        harry.setName("Sagol"); */

        System.out.println(harry.getId());
        System.out.println(harry.getName());

        System.out.println(harry1.getId());
        System.out.println(harry1.getName());

        System.out.println(harry2.getId());
        System.out.println(harry2.getName());


    }
}
