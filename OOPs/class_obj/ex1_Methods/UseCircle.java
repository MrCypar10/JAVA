
import java.util.*;

public class UseCircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius of a Circle");
        int r = sc.nextInt();
        Circle obj = new Circle();
        obj.setRadius(r);
        obj.calculateArea();
        obj.calculateCircum();
    }

}
