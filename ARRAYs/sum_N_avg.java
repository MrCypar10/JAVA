
import java.util.*;

    public class sum_N_avg{
    
    
    public static void main(String[] args) {
     int sum = 0;
        Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number : ");
        int [] arr = new int[5];
        for(int  i = 0; i<=4; i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("Sum is : "+ sum);
        System.out.println("Avg is : "+ (float)(sum/5));
    }

    }