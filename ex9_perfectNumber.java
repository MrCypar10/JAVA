
import java.util.*;

class ex9_perfectNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = sc.nextInt();

        int sum = 0;
        for(int i = n-1; i>=1; i--){
            if(n%i==0){
                sum+=i;
            }

        }
        if (sum == n) {
            System.out.println(n + " is a Perfect Number :");
        } else {
            System.out.println(n + " is not a Perfect Number :");
        }

    }
}
