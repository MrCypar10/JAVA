import java.util.*;
public class AvgInEven_N_Oddpos {
    // In Even No pos
    public static double Avg(int arr[]){
        double avg = 0;
        double res= 0;     
        double count = 0 ;   
        for( int i = 0; i<arr.length;i++){
            //if((i+1)%2==0){ if((i-1)%2==0)//for EVEN pos.


                
                //if(i%2==0){|| if((i+1)%2!=0){
                if((i+2)%2==0){ // for ODD pos.



               avg += arr[i];
                count++;
                res =avg/count;
    }
}        
                   return res;
    }  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the NO of elements");
        int n = sc.nextInt();
        System.out.println("Enter the elements");
        int arr[]= new int[n];
        for( int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The Avg Of Even Postion Nos is: "+Avg(arr));
    }
}
