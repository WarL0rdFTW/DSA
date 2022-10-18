

public class MaxMin {
      public static void main(String args[]){
      int arr[] = {11,56,2,67,89,100};


    /*  1st Approach Brute Force
    
    
    Arrays.sort(arr);
      int start=0;
      int end = arr.length-1;
      
       for(int i=0;i<1;i++){
           System.out.print("Minimum Value ");
           System.out.println(arr[start]);
           System.out.print("Maximum Value ");
           System.out.println(arr[end]);
      }
      }
      */
      // 2nd Approach
      int n = arr.length;
      Pair minmax = MaxMinfunction(arr, n);
      System.out.printf("Minmim value is %d",minmax.min);
     // System.out.printf("\nMaximum value is %d",minmax.max);
     

    }
    static class Pair{
        int min;
        int max;
    }
      
static Pair MaxMinfunction(int arr[],int n){
     Pair minmax = new Pair();
      
     if(arr[0]>arr[1]){
         minmax.min=arr[1];
         minmax.max=arr[0];
     }
     else{
         minmax.min =arr[0];
         minmax.max=arr[1];
     }


    if(n==1){
        minmax.min = arr[0];
        minmax.max= arr[0];
        return minmax;
    }
    for(int i=2;i<n;i++){
        if(arr[i]>minmax.max){
            minmax.max = arr[i];
        }
        else if(arr[i]<minmax.min){
            minmax.min = arr[i];
        }
        
    }
    return minmax;

}



}
