import java.util.*;
public class maxmi {
    public static void main(String args[]){

    int arr[] = {3,5,1,2,9,12,10};

    int min = Integer.MAX_VALUE;
    int max=0;
    int n = arr.length;
    for(int i=0;i<n;i++){
       if(min>arr[i]){
           min = arr[i]; // 3 
     }
     if(max<arr[i]){
       max = arr[i];
     }
    }

    System.out.println(min + " " + max);
    
}
}