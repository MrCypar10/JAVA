import java.util.*;

    class largestOne{
        public static void main(String[] args) {
            int count = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Numbers : ");
            int []arr = new int[10];
            for(int  i = 0; i <10; i++){
            arr[i]  = sc.nextInt();
            }
            for(int  i = 0; i < 10; i++){
            count = Math.max(count, arr[i]);
        }

        // Arrys.sort(arr);
        // SOUT(arr[9])

                System.out.println("greatest No is :" +count);
            }
        }
    