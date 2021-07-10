public class MaxSumSubArray {
    //kadane's algorithm
    private static void maxSum(int[] arr) {
        int meh = 0;
        int msf = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        for(int i = 0; i < arr.length; i++) {
            meh += arr[i];
            if(meh < arr[i]) {
                meh = arr[i];
                start = i;
            }
            if(msf < meh) {
                msf = meh;
                end = i;
            }
        }
        System.out.println(msf);
        System.out.println(start);
        System.out.println(end);
    }

    public static void main(String[] args) {
        int [] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        maxSum(arr);
    }
}
