public class KthUtils {

    public static int findKthSmallestNumber(int[] nums, int k) {
        int result;
        int[] sortedNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int tempIndex = 0;
            for (int j = 0; j < nums.length; j++) {
                int tempNum = nums[j];
                if (sortedNums[i] > tempNum || j == 0) {
                    sortedNums[i] = tempNum;
                    tempIndex = j;
                }
            }
            nums[tempIndex] = Integer.MAX_VALUE;
        }
        result = sortedNums[k - 1];
        return result;
    }
}
