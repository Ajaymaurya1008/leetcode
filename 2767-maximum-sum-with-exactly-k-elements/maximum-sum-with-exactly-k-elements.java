class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max=0;
        for(int i:nums){
            if(max<i) max=i;
        }
        int sum=max;
        for(int i=1;i<k;i++){
            max=max+1;
            sum+=max;
        }
        return sum;
    }
}