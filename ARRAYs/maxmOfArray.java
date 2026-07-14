import java.util.*;

    public class maxmOfArray {
        int maxArray(int arr[],int idx){
            if(idx==arr.length)
                return arr[idx];
            
                int misa = maxArray(arr, idx+1);
                if(misa>arr[idx]){
                return misa;
                }else{
                    return arr[idx];
                }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of elements");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the Array");
        int arr []= new int[n];
        for(int i = 0; i< arr.length; i++){
         arr[i] = sc.nextInt();}
         maxmofArray max = new maxmofArray();
         System.out.println(max.maxArray(arr, 0));
    }    
}
