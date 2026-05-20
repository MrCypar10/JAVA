import java.util.*;

    public class all_Indices {
        public static int[] multioccur (int arr[],int idx , int fsf, int x){
            if(idx == arr.length){
                return new int[fsf];
            }
            if(arr[idx]==x){
                int iarr[] = multioccur(arr, idx+1, fsf+1, x);
                    iarr[fsf] = idx;
                    return iarr;
            }else{
                int iarr[] = multioccur(arr, idx+1, fsf, x);
                    return iarr;
            }

        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the nos of elements");
            int n  = sc.nextInt();
            System.out.println("enter the elements");
            int arr []= new int[n];
            for(int i = 0; i<n; i++ ){
                arr[i] = sc.nextInt();
            }
            System.out.println("enter the element");
            int x = sc.nextInt();
            int [] iarr = multioccur(arr, 0, 0, x );
            for(int i = 0; i <iarr.length;i++){
            System.out.println(iarr[i]);
            }
        }
}
