package Recursion;

import java.util.Scanner;

public class recursion5 {
    public static void main(String[] args) {
        
     int n,a=0,b=1,c;

     System.out.println("Enter no");

     Scanner sc = new Scanner(System.in);

     n = sc.nextInt();
     for(int i=0;i<n;i++){
        System.out.print(a+ " ");
        c = a+b;
        a = b;
        b =c;
     }

    }
//    static void fib(int n){

//         for(int i=0;i<n;i++){
//             int a = 0;
//             int b = 1;
//             int c = a+b;
//             System.out.println(a);
//             a = b;
//             b = c;
            
//         }

//     }
    
}
