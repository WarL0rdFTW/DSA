public class swapalternate {
     public static void main(String args[]){
            int even[]={2,5,3,6,8,90,10,11};
            int odd[]={4,5,3,6,8};

            swaalternate(even,8);
            //printarray(even,8);
            System.out.println();
            swaalternate(odd,5);
           // printarray(odd,5);
     }
     static void swaalternate(int[] arr,int size){
            
        for(int i=0;i<size;i+=2){
            if(i+1 <size){
                swap(arr[i],arr[i+1]);
            }
            
        }
        for(int i=0;i<size;i++){
        System.out.print(arr[i] + " ");
        }
     }
      static void swap(int i, int j) {
         int temp =i;
         i=j;
         j=temp;
    }
    static void printarray(int [] arr,int size){
                 for(int i=0;i<size;i++){
                     System.out.print(arr[i]+ " ");
                 }
     }
    
}
