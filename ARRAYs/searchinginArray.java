import java.util.*;

    public class searchinginArray{
        int search(int arr [], int n, int x){
             for(int i = 0; i<n;i++)
                if(arr[i]==x)
                return i;
             
        return -1;
            } 
    public static void main(String[] args) {
        serchingonArray s1=new serchingonArray();
        int arr [] = {15,56,8,68,32,10};
       System.out.println(s1.search(arr, 6, 10));
    }
        }