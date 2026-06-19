
import java.util.*;

public class lastOccurance {

    public static int lastoccur(int arr[], int idx, int x) {
        if (idx == arr.length) {
            return -1;
        }
        int lissa = lastoccur(arr, idx + 1, x);
        if (lissa == -1) {
            if (arr[idx] == x) {
                return idx;
            } else {
                return -1;
            }
        } else {
            return lissa;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int n = sc.nextInt();
        System.out.println("Enter the elements");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the last occur no to find");
        int x = sc.nextInt();

        int li = lastoccur(arr, 0, x);
        System.out.println("The index Last occur is: " + li);
    }
}
