import java.util.*;

    public class firstOccurnce {
        int first(int arr[], int idx, int x){
            if(arr.length==idx){
                return -1;
            }
            if(arr[idx]==x){
                return idx;
            }else{
                int fiisa = first(arr, idx+1, x);
                return fiisa;
            }

        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the nos of element to be put in Array");
            int n = sc.nextInt();
            System.out.println("Enter the elements");
            int arr[] = new int [n];
            for(int i = 0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("enter the no to search");
            int d = sc.nextInt();
            firstOccurnce f1 = new firstOccurnce();
            System.out.println(f1.first(arr, 0, d));
        }
    }