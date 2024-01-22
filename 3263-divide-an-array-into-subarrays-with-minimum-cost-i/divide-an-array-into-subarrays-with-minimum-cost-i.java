public class Solution {
    public int minimumCost(int[] nums) {
        if (nums.length == 3) {
            return Arrays.stream(nums).sum();
        }

        Arrays.sort(nums, 1, nums.length);
        return nums[0] + nums[1] + nums[2];
    }
}
