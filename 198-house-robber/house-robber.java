class Solution {
    public int rob(int[] nums) {
        int rob = 0;
        int miss = 0;
        for (int i = 0; i < nums.length; i ++) {
            int rob2 = miss + nums[i];
            int miss2 = Math.max(miss, rob);
            rob = rob2;
            miss = miss2;
        }
        return Math.max(rob,miss);
    }
}