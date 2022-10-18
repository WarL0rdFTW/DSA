package Recursion; 
import java.util.Scanner;

class rough{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ans = new int[n];

        for(int i=1;i<=n;i++){
            ans[i] = i;
            
        }
        
        for(int i=0;i<n;i++){
            System.out.print(ans[i] + " ");
        }
    }
}