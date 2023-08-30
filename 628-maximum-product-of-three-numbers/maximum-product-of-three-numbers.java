class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int m = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        int n = nums[0]*nums[1]*nums[nums.length-1];
        int max = Math.max(m,n);
        return max;
    }
}