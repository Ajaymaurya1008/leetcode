public class Solution {
    public boolean canSortArray(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                int a = Integer.bitCount(nums[j]);
                int b = Integer.bitCount(nums[j+1]);

                if (nums[j] > nums[j + 1] && a == b) {
                    swap(nums, j, j + 1);
                }
            }
        }

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }

        return true;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
