import java.util.*;
public class kthelement {
    public static void main(String args[]){
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           int arr[]=new int[n];
           for(int i=0;i<n;i++){
               arr[i] = sc.nextInt();
           }
           int  k = sc.nextInt();
           sc.close();
           System.out.println(kthSmallest(arr, n, k));
           System.out.println(kthLargest(arr,n,k));
    }
    public static int kthSmallest(int[] arr,int n, int k) 
    { 
        //Your code here
      PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
      for(int i=0;i<k;i++){
          pq.add(arr[i]);
      }
      for(int i=k;i<n;i++){
          if(pq.peek()>arr[i]){
              pq.poll();
              pq.add(arr[i]);
          }
      }
      return pq.peek();
    }
    public static int kthLargest(int[] arr,int n,int k){
       
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0;i<k;i++){
            pq.add(arr[i]);
        }
        for(int i=k;i<n;i++){
            if(pq.peek()<arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }
        }
      
      
      
        return pq.peek();
    } 
}
