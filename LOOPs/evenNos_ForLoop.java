import java.util.*;


public class evenNos_ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        if (n == 0 || n == 1) {
            System.out.println("Not a Even Number.");
        }
        for (int i = 2; i <=n; i++) {
            if (i%2==0) {
                System.out.print(i+" ");
            }
        }
    }
    
}