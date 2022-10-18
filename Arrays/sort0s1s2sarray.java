

public class sort0s1s2sarray {
    public static void main(String[] args){
    int [] arr = {0,1,1,0,2,1,2,0};
    int count1=0;
    int count2=0;
    int count3=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==0){
            count1++;
        }
        if(arr[i]==1){
            count2++;
        }
        if(arr[i]==2){
            count3++;
        }
    }
    while(count1>0){
    System.out.println(0 + " ");
    count1--;
    }
    // System.out.println(count2);
    // System.out.println(count3);

}
}
