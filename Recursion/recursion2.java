package Recursion;

public class recursion2 {

    public static void main(String[] args) {
        int ans = powerof(0);
        System.out.println(ans);
    }

    static int powerof(int n){
        
        if (n==0) return 1;
        return  2 * powerof(n-1);

    }
    
}
