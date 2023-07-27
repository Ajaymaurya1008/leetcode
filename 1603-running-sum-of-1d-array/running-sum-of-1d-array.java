class Solution {
    public int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        int m=0;
        for(int i=0; i< nums.length;i++){
            arr[i]=m+=nums[i];
        }
        return arr;
    }
}