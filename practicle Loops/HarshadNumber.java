import java.util.*;
public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int m=0;
        int org =n;
        int sum =0;

       while(n>0){
            m=n%10;
            sum+=m;

            n=n/10;
        }

    if(org%sum==0){
        System.out.println(org +" is Harsad Number");
        }
        else{
            System.out.println(org+" Not a Harshad Number");
        }
    }
}
