public class slidingWindow {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int res = maxSum(arr, k);

        System.out.println("Max sum of subarray of size " + k + " is " + res);
    }

    public static int maxSum(int[] arr, int k) {
        int winSum = 0;
        int maxSum = 0;

        for (int i = 0; i < k; i++) {
            winSum += arr[i];
        }
        maxSum = winSum;

        for (int i = k; i < arr.length; i++) {
            int removed = arr[i - k];  
            int added = arr[i];        

            winSum = winSum - removed + added;

            if (winSum > maxSum) {
                maxSum = winSum;
            }
        }

        return maxSum;
    }
}
