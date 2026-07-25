import java.util.*;

public class PrimeNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int count= 0;
        int n = sc.nextInt();
        

        for(int i = 1; i<=n; i++){
            if (n%i==0) {
                count++;
        
        }
            
            
        }

        if (count==2) {
            System.out.println(n+" : is a Prime Number");
        }
        else{
            System.out.println(n+": is not a Prime Number");
        }
    }
}

//int i;
//for(i=1;i<=n;i++){
//if(n%i==0)
// {break;}
//}
//if(i==n){"prime number"} else {Not a prime number}