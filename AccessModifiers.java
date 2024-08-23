class MyEmployee{
    private int id;
    private String name;

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

public class AccessModifiers {
    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();

        harry.setName("Code with Harry");
        System.out.println(harry.getName());

        harry.setId(8);
        System.out.println(harry.getId());

    }
}
