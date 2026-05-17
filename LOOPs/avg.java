import java.util.*;

    class avg {
         public static void main(String[] args) {
            Scanner sc  = new Scanner(System.in);
            int n, sum = 0, count = 0;
            System.out.println("Enter the Number :");
            for (; ;){
                n = sc.nextInt();
                if (n==0)
                    break;
                
                if (n<0){
                    continue;
                }
                
                sum = sum + n;
                count++;
                
            System.out.println("Sum is : " + sum);
            System.out.println("Average is : "+ (sum/count));
         }
    }
}