import java.util.*;

    public class SlidingWindow {
        static int  maxsum(int arr[],int k){
            int curr =0;
            for (int i = 0; i<k;i++)
            curr += arr[i];
            int res = curr;
            for(int i=k; i<arr.length;i++){
                curr += arr[i] -arr[i-k];
                res = Math.max(res, curr);
            } 
            return res;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Size of The Array");
            int n = sc.nextInt();
            System.out.println("Enter the Elements");
            int arr[] =  new int[n];
            for(int i  = 0; i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter the Order");
            int k = sc.nextInt();
            System.out.println(maxsum(arr, k));
        }
}
