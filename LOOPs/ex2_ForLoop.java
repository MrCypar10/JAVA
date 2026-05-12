import java.util.*;

class ex2_ForLoop {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = sc.nextInt();
        int i ;
        for (i = 1; i <= n; i++) {
            System.out.println(i);
        }
        System.out.println("i Outside of Loop : " + i);
    }
}