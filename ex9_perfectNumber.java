import java.util.*;
 class ex9_perfectNumber {
     public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the Number :");
        int org = n;
        n-1;
        int i = n;
        int sum = 0;
        while(n>0){
           int k = org % 10;
            if(org % k == 0){
                sum += k;
            }
            n = n/10;
        }
        if(sum==org){
            System.out.println(org+" is a Perfect Number :");
        }
        else{
            System.out.println(org+" is not a Perfect Number :");
        }
            
        }
     }