public class LIS {
    private static int LISMaxLength(int[] arr) {
        int[] dp = new int[arr.length];
        int totalMax = Integer.MIN_VALUE;
        for(int i = 0; i < dp.length; i++) {
            int max = 0;
            for(int j = 0; j < i; j++) {
                if(arr[i] > arr[j] && dp[j] > max) {
                        max = dp[j];
                }
            }
            dp[i] = max + 1;
            totalMax = Math.max(dp[i], totalMax);
        }
        return totalMax;
    }

    public static void main(String[] args) {
        int[] arr = {10,9,2,5,3,7,101,18};
        System.out.println(LISMaxLength(arr));
    }
}
