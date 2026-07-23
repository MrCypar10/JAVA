 public class Emp{

    private int id;
    private String name;
    private double sal;
    private static nextId; 

    public Emp (string name, double sal){
        this.name = name;
        this.sal = sal;
        id = nextId++;
    }

    public void show(){
        System.out.println("Emp id :"+id+", Name :"+name+", Salary :"+sal);
    }

    public void showNextId(){
        System.out.println(nextId);
    }
}

