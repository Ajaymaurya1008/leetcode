class Solution {
    public int findPeakElement(int[] nums) {
        int start=0;
        int end=nums.length-1; 
        while(start<end){
            int mid = start + (end-start)/2;
            if(nums[mid]>nums[mid+1]){
                end = mid;
            }
            else 
                start=mid+1;
        }
        return start;
        // int max=0;
        // int index=0;
        // if(nums.length==1)
        //     index=0;
        // else if(nums[1]>nums[0])
        //     index=1;
        // for(int i=0;i<nums.length;i++){
        //     if(max<nums[i]){
        //         max=nums[i];
        //         index=i;
        //     }
        // }
        // return index;
    }
}