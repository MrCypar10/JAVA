
import java.util.*;

class ex5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the NUmber : ");
        int num = sc.nextInt();
        int ld = num % 10;
        while (num > 9) {
            num = num / 10;
        }
        int sum = num + ld;
        System.out.println("Sum is " + sum);
    }
}
