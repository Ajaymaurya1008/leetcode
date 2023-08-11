
class Solution {
    public int findFinalValue(int[] nums, int original) {
        boolean tt = true;
        while(tt){
            tt = isPresent(nums,original);
            original = original*2;
        }
        return original/2;
    }

    public boolean isPresent(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
                return true;
        }
        return false;
    }
}