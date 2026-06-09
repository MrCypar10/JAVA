
class Student {

    private int roll;
    private String name;
    private double per;

    public void setStudent() {
        roll = 01;
        name = "Cypar";
        per = 0.5;
    }

    public void showStudent() {
        System.out.println("Roll no = " + roll + ".  Name = " + name + ".  Percentage = " + per + "%");
    }
}

public class UseStudent2 {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setStudent();
        s1.showStudent();
    }

}
