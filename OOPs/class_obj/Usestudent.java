
class student {

    int roll;
    char grade;
    double per;
}

class UseStudent {

    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student();

        s1.roll = 01;
        s1.grade = 'A';
        s1.per = 89.3;

        s2.roll = 02;
        s2.grade = 'A';
        s2.per = 83.3;

        System.out.println("Roll = " + s1.roll + ".  Grade = " + s1.grade + ".  Percentage = " + s1.per + "%");
        System.out.println("Roll = " + s2.roll + ".  Grade = " + s2.grade + ".  Percentage = " + s2.per + "%");
    }
}
