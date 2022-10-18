public class mergesort{
    public static void conquer(int arr[],int si,int mid,int ei){
         
        
    }
    public static void divide(int arr[],int si,int ei){

        if(si>=ei){
            return;
        }
          int mid = si + (ei-si)/2;
          divide(arr, si, mid);
          divide(arr,mid+1,ei);
          conquer(arr, si, mid, ei);
          
    }
      public static void main(String args[]){
          int arr[] = {2,8,1,5,9,4,6};
          int n = arr.length;
      }
}