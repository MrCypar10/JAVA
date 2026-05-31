
import java.util.*;

public class diagonalElementsSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[4][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter the values for [" + i + "][" + j + "]");
                arr[i][j] = sc.nextInt();

            }

        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j <= i; j++) {
                System.out.print(arr[i][j] + " ");
                sum += arr[i][j];
            }
            System.out.println();
        }

        System.out.println("Sum is : " + sum);
    }
}
