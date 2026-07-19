
import java.util.*;

public class ex6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            int k = n % 10;
            if (k % 2 == 0) {
                sum += k;
            }
            n /= 10;
        }
        System.out.println("Sum of even Digits of the Number is :" + sum);
    }

}
