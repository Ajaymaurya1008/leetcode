class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long sum=0;
        for(int i:nums) sum +=i;
        for(int i=nums.length-1;i>=2;i--){
            sum = sum - nums[i];
            if(sum>nums[i]) return sum+nums[i];
        }
        return -1;
    }
}