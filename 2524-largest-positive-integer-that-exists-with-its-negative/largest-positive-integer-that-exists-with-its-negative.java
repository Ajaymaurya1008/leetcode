class Solution {
    public int findMaxK(int[] nums) {
        int max =-1;
        for(int i:nums){
            if(i<0){
                boolean ans = Search(nums,Math.abs(i));
                if(ans){
                    max=Math.max(Math.abs(i),max);
                }
            }
        }
        return max;
    }

    static boolean Search(int[] arr,int num){
        for(int i=0;i<arr.length;i++){
                if(arr[i]==num){
                    return true;
                }
        }
        return false;
    }
}