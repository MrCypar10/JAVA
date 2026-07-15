
import java.util.*;


      
public class maxDifference {

        public static int maxdiff(int arr[]) {
            int n = arr.length;
            int max_diff = arr[1] - arr[0];
            int min_diff = arr[0];

            for (int i = 0; i < n; i++) {
                if (arr[i] - min_diff > max_diff) {
                    max_diff = arr[i] - min_diff;
                }
                if (arr[i] < min_diff) {
                    min_diff = arr[i];
                }
            }
            return max_diff;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the no of elements");
            int n = sc.nextInt();
            System.out.println("Enter the elements");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Max difference is  : ");
            System.out.println(maxdiff(arr));

        }

    }
        
