package Recursion;

import java.net.SocketTimeoutException;

public class recursion4 {
    public static void main(String[] args) {
         reachDest(1, 10);
      
    }

    static void reachDest(int src , int des){
        System.out.println("source "+src + " destinaton  " + des);
        if(src == des) {
             System.out.println("Reached ");
             return ; 
        }
        reachDest(src +1 , des) ;
    }
}
