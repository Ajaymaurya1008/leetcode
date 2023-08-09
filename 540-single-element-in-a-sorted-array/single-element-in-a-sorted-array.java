class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start =0;
        int end = nums.length-1;
        int mid;
        while(start<end){
            mid = start + (end-start)/2;
            if((mid%2==0 && nums[mid]==nums[mid+1]) || (mid%2==1 && nums[mid]==nums[mid-1])){
                start = mid+1;
            } 
            else
                end = mid;
        }
        return nums[start];
    }
}

        // int start = 0;
        // int end = nums.length;
        // int mid;
        // if(nums.length==1)
        //     return nums[0];
        // if(nums[0]!=nums[1])
        //     return nums[1];
        // if(nums[nums.length-1]!=nums[nums.length-2])
        //     return nums[nums.length-1];
        // while(start<=end){
        //     mid = start + (end - start)/2;
        //     if(nums[mid]==nums[mid+1])
        //         start = mid + 1;
        //     else if(nums[mid]==nums[mid-1])
        //         end = mid -1;
        //     else
        //         return nums[mid];
        // }
        // return 0;

        // while(start<=end){
        //     mid = start = (end - start)/2;
        //     if(mid%2==0){
        //         if(nums[mid]!=nums[mid+1])
        //             return nums[mid];
        //         start = mid+1;
        //     }
        //     else if(mid%2!=0){
        //         end = mid -1;
        //     }
        // }
        // return 0;
    
        // while(start<=end){
        //     mid = start + (end-start)/2;
        //     if(((nums[mid-1] == nums[mid]) && ((mid - 1) % 2 != 0)) || ((nums[mid+1] == nums[mid]) && (mid % 2 == 0))){
        //         start = mid + 1;
        //     }
                
        //     else if((nums[mid+1]==nums[mid] && (nums.length-mid)%2!=0) || (nums[mid+1]!=nums[mid] && (nums.length-mid)%2==0)){
        //         end = mid-1;
        //     }
        //     else{
        //         return nums[mid];
        //     }
        // }
        // return 0;
