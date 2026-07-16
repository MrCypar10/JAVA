public class smallestInArray {
public static void main(String[] args) {
    
    
    int arr [] = {10,35,47,85,98};
    int res = Integer.MAX_VALUE;
    for(int i = 0; i<arr.length; i++){
    if(arr[i]<=res)
       res = arr[i];
    }
    System.out.println(res);
        }
    
}
