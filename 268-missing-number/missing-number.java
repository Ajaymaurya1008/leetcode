class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int exp = n*(n+1)/2;
        int sum=0;
        for(int i =0 ; i<n ; i++){
            sum+=nums[i];
        }
        return exp-sum;

        // Arrays.sort(nums);
        // for(int i=0;i<=nums.length;i++){
        //     int n = Arrays.binarySearch(nums,i);
        //     if(n<0)
        //         return i;
        // }
        // return -1;
    }
}