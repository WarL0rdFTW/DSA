public class magicNumber {

    public static void main(String[] args) {

        int n = 3;

        int ans = 0;
        int base = 5;
        while(n>0){

            int last = n & 1; // to get the last bit of the number.
            n = n >> 1;

            ans += last * base;
            base = base * 5;

        }


        System.out.println(ans);

    }

}
