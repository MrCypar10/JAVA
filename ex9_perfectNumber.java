
import java.util.*;

class ex9_perfectNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = sc.nextInt();

        int org = n;
        int sum = 0;
        while (n > 0) {
            int k = org % 10;
            if (org % k == 0) {
                sum += k;
            }
            n = n / 10;
        }
        if (sum == org) {
            System.out.println(org + " is a Perfect Number :");
        } else {
            System.out.println(org + " is not a Perfect Number :");
        }

    }
}
