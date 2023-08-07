class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0] = search(nums,target,true);
        ans[1] = search(nums,target,false);
        return ans;
    }
    static int search(int[] arr, int index, boolean isFirstIndex){
            int start = 0;
            int end = arr.length -1;
            int ans = -1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]<index){
                start = mid + 1;
            }
            else if(arr[mid]>index){
                end = mid - 1;
            }
            else{
                ans = mid;
                if(isFirstIndex){
                    end = mid-1;
                }else{
                    start = mid +1;
                }
            }
        }
        return ans;
    }
}