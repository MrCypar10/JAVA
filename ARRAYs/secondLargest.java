import java.util.*;

public class secondLargest {
    public static int secLargest(int arr[]){
        int largest = 0;
        int res = -1;
            for(int i = 1; i<arr.length;i++){
                if(arr[i] > largest){
                     res = largest;
                    largest = arr[i];
                }
                else if( arr[i] >= res){
                    res = arr[i];
                } 
            }
                    return res;
            }
         public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the Nos of element");
            int n = s.nextInt();
        System.out.println("enter the elements");
            int arr[] = new int [n];
                for(int i = 0; i<arr.length;i++)
                    arr[i] = s.nextInt();
                    secondLargest s1 = new secondLargest();
                    int k = s1.secLargest(arr);
                    System.out.println("Second Largest No is : "+k);
    }
}
