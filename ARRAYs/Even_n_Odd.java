import java.util.*;

    
    public class Even_n_Odd {
        public static void main(String[] args) {
            int sum = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the numbers : ");
            int [] arr = new int[5];
            for(int i = 0; i <= 4; i++){
                arr [i] = sc.nextInt();
                sum = sum + arr[i];
            }
            System.out.println("Sum is : "+ sum);
            System.out.println("Avg is : " +(float)(sum/5));

        }
        
    }