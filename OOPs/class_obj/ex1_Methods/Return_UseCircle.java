// DRIVER CLASS

//========================
import java.util.*;

public class Return_UseCircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius of a Circle");
        int r = sc.nextInt();

        Return_Circle obj = new Return_Circle();
        obj.setRadius(r);

        double res;

        res = obj.calculateArea();
        System.out.println("Area of a Circle is = " + res);

        res = obj.calculateCircum();
        System.out.println("Circumference of a Circle is = " + res);
    }

}
