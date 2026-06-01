
import java.util.*;

public class salesmanproblem_JaggedArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Salesman ?");
        int n = sc.nextInt();
        int[][] arr = new int[n][];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the no. of sales for salesman " + (i + 1));
            int Nsales = sc.nextInt();

            for (int j = 0; j < Nsales; j++) {
                System.out.println("Enter sales : ");
                int sales = sc.nextInt();

            }

        }
             

    }
}
