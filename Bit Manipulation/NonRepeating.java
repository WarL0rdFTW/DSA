public class NonRepeating {
    public static void main(String args[]){
        int arr[] = {1,2,3,2,1,4};
     System.out.println(NonReap(arr));
    }
    static int NonReap(int arr[]){
        int n = arr.length;
        int ans =0;
                     for(int i=0;i<n;i++){
                        ans = ans ^ arr[i];
                     }
                          return ans;
    }
}
