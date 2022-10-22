
public class oddEven {


    public static void main(String[] args) {

        check(144);

    }

    /**
     *
     * @param n = if the number N is & with 1 it will describe the last bit
     *          if the last bit is 1 then the number is odd and
     *          if the last bit is 0 then the number N is even.
     */
    static  void check(int n){

        if((n&1) == 1){
             System.out.println("Odd");
        }
        else System.out.println("Even");


    }
}
