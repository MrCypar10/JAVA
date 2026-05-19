import java.util.*;

    
    public class Even_n_Odd {
        public static void main(String[] args) {
            int Esum = 0, Osum = 0, Ecnt = 0, Ocnt = 0;
            Scanner sc = new Scanner(System.in);
            
            int [] arr = new int[5];
            
            for(int i = 0; i <= 4; i++){
                System.out.println("Enter the numbers : ");
                arr [i] = sc.nextInt();
                String b = (arr[i]%2==0)?"Even" :"Odd";

                if(b.equalsIgnoreCase("Even")){
                    Esum += arr[i];
                    Ecnt++;
                }else{
                    Osum += arr[i];
                    Ocnt++;
                }
                }
                System.out.println("Sum of Even NoS : " +Esum);
                System.out.println("Avg of Even Nos : "+(float)(Esum/Ecnt));
                
                System.out.println();
                System.out.println();            

                System.out.println("Sum of Odd NoS : " +Osum);
                System.out.println("Avg of Odd Nos : "+(float)(Osum/Ocnt));
        }
    }