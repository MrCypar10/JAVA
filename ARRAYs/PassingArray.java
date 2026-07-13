
import java.util.*;

public class PassingArray {

    public int add(int[] brr) {
        int total = 0;
        for (int x : brr) {
            total = x + total;
        }
        return total;
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values :");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        PassingArray p = new PassingArray();
        int ans = p.add(arr);

        System.out.println("sum is :" + ans);
    }
}
