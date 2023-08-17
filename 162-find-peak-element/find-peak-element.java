class Solution {
    public int findPeakElement(int[] nums) {
        int max=0;
        int index=0;
        if(nums.length==1)
            index=0;
        else if(nums[1]>nums[0])
            index=1;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
                index=i;
            }
        }
        return index;
    }
}