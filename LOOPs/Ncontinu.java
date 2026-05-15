import java.util.*;

class Ncontinu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0;
        System.out.println("Enter the No");
        for (; ;){
            n = sc.nextInt();
            if (n==0) 
                break;
            
            if (n>0) {
                continue;
            }    
                sum = sum+n;
            
        System.out.println("Sum is :"+sum);
        }
    }
    
}