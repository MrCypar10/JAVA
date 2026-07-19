
import java.util.Scanner;

/**
 * ex8_palindrome
 */
public class ex8_palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = sc.nextInt();
        int org = n;
        int rev = 0;

        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        if (org == rev) {
            System.out.println(org + " Is a Palindrome Number. ");
        } else {
            System.out.println(org + " Is not a Palindrome Number. ");
        }
    }

}
