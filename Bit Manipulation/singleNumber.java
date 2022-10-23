public class singleNumber {

    public static void main(String[] args) {
        int[] arr = {1,3,4,1,3,6,7,6,7};

        System.out.println(uniqueNumber(arr));

    }

    /**
     *
     * @param arr represents array with repeating elements and with a single element
     *
     * @return    single element
     * Explanation = using the XOR property i.e. a^a = 0
     */
    static int uniqueNumber(int[] arr){
        int ans = 0;

        for(int i = 0;i<arr.length;i++){

            ans ^= arr[i];

        }
        return ans;
    }


}
