package Recursion;

public class recursion3 {
    public static void main(String[] args) {
        counting(1000);

    }

    static void counting(int n ){
        if(n==0) return ;

        System.out.print(n + " ");
        counting(n-1);

    }
}
