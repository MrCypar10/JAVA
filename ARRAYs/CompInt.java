
import java.util.*;

public class CompInt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 Numbers ");
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            if (n == arr[i]) {
                System.out.println("The Number [" + n + "] is Present in Array at : " + i);
                break;
            }
        }
    }
}
