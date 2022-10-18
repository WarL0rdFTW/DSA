import java.util.Scanner;

class recursion1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
  int ans = factorial(n);
        System.out.println(ans);

    }
   static  int factorial(int n){
         
    if(n==0) return 1;
       
        return n * factorial(n-1);
    }
}