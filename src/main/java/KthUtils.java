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

    public static int findKthSmallestNumberEfficient(int[] nums, int k) {
        return findKthSmallestNumberRecursive(nums, k, 0, nums.length - 1);
    }

    private static int findKthSmallestNumberRecursive(int[] nums, int k, int start, int end) {
        int p = partition(nums, start, end);
        if (p == k - 1) {
            return nums[p];
        }
        if (p > k - 1) {
            return findKthSmallestNumberRecursive(nums, k, start, p - 1);
        }
        return findKthSmallestNumberRecursive(nums, k, p + 1, end);
    }

    private static int partition(int[] nums, int low, int high) {
        if (low == high)
            return low;

        int pivot = nums[high];
        for (int i = low; i < high; i++) {
            if (nums[i] < pivot) {
                swap(nums, low++, i);
            }
        }
        swap(nums, low, high);
        return low;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
