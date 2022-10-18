import java.util.*;
public class minimizeheight {
    public static void main(String[] args){
        int k = 5;
        int n =10;
        int[] arr  = {2, 6, 3, 4, 7, 2, 10, 3, 2, 1};
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
        for(int i=0;i<n;i++){
            if(arr[i]<k+1){
                arr[i] +=k;
            }
            else{
                arr[i] -=k;
            }
        }
        
        int diff = arr[n-1] - arr[0];
         System.out.print(diff);

         // GFG CODE
         Arrays.sort(arr);
         int ans = arr[n-1] - arr[0];
         int s = arr[0] +k ;
         int l = arr[n-1] -k ;
          
          
          int mi=0,ma=0;
          for(int i=0;i<n-1;i++){
              mi = Math.min(s,arr[i+1] - k);
              ma = Math.max(l,arr[i]+k);
              if(mi<0) continue;
              ans = Math.min(ans,ma-mi);
               
          }
          System.out.println(ans);
    }
}
