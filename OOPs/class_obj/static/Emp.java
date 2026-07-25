 public class Emp{

    private int id;
    private String name;
    private double sal;
    private static int nextId=1; 

    public Emp (String n, double s){
        name = n;
        sal = s;
        id = nextId++;
    }

    public void show(){
        System.out.println("Emp id :"+id+", Name :"+name+", Salary :"+sal);
    }

    public void showNextId(){
        System.out.println(nextId);
    }
}

